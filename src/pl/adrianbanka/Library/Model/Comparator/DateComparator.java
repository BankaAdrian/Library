package pl.adrianbanka.Library.Model.Comparator;

import pl.adrianbanka.Library.Model.Publication;

import java.util.Comparator;

public class DateComparator implements Comparator<Publication> {
    @Override
    public int compare(Publication p1, Publication p2) {
        if(p1 == null && p2 == null)
            return 0;
        else  if(p1 == null)
            return 1;
        else if(p2 == null)
            return -1;
        int i1 = p1.getYear();
        int i2 = p2.getYear();
        return -Integer.compare(i1, i2);
    }
}
