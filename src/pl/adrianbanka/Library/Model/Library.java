package pl.adrianbanka.Library.Model;

import pl.adrianbanka.Library.Exceptions.PublicationAlreadyExistException;
import pl.adrianbanka.Library.Exceptions.UserAlreadyExistException;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Library implements Serializable {
    private Map<String, Publication> publications = new HashMap<>();
    private Map<String, LibraryUser> users = new HashMap<>();

    public Map<String, Publication> getPublications() {
        return publications;
    }

    public Map<String, LibraryUser> getUsers() {
        return users;
    }

    public void addPublication(Publication publication) {
        if (publications.containsKey(publication.getTitle())) {
            throw new PublicationAlreadyExistException("Publikacja o taki tytule już istnieje " + publication.getTitle());
        }
        publications.put(publication.getTitle(), publication);
    }

    public void addUser(LibraryUser user) {
        if (users.containsKey(user.getPesel())) {
            throw new UserAlreadyExistException("Użytkownik już istnieje.");
        }
        users.put(user.getPesel(), user);
    }

    public boolean removePublication(Publication pub) {
        if (publications.containsValue(pub)) {
            publications.remove(pub.getTitle());
            return true;
        } else {
            return false;
        }
    }
}