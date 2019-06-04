package book;
import java.util.ArrayList;
import java.awt.print.Book;
import java.lang.reflect.Array;

public class Commerce extends Book_Type {

        String Subdivision;
        int volume;

    public String getSubdivision() {
        return Subdivision;
    }

    public void setSubdivision(String subdivision) {
        Subdivision = subdivision;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void idisplay() {
        super.idisplay();
    }
//    ArrayList<String> Shelf2_Commerce=new ArrayList<>();
//        Shelf2_Commerce.add("business");
//        Shelf2_Commerce.add("economics");
//        Shelf2_Commerce.add("maths");
//        Shelf2_Commerce.add("french");
//        Shelf2_Commerce.add("english");
//            System.out.println(Shelf2_Commerce);
}
