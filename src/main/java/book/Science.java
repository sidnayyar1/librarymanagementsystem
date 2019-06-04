package book;

import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Science extends Book_Type {

    private int edition;

    private String Category;

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public void idisplay() {
        super.idisplay();
    }


    //    {
//        ArrayList<String> Shelf1_Science=new ArrayList<>();
//        Shelf1_Science.add("machine learning");
//        Shelf1_Science.add("cloud computing");
//        Shelf1_Science.add("Biology");
//        Shelf1_Science.add("Physics");
//        Shelf1_Science.add("chemistry");
//        System.out.println(Shelf1_Science);
//
//
//
//
//        ArrayList<String> Shelf3_Newspaper=new ArrayList<>();
//        Shelf3_Newspaper.add("Hindustan time");
//        Shelf3_Newspaper.add("economic Times");
//        Shelf3_Newspaper.add("Delhi Times");
//        Shelf3_Newspaper.add("");
//        Shelf3_Newspaper.add("english");
//        System.out.println(Shelf3_Newspaper);
//
//    }
}
