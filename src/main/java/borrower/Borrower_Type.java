package borrower;

import Display.IDisplay;

import java.util.Scanner;

public class Borrower_Type implements IDisplay {
    private int ID;
   private String FirstName;
   private String LastName;
   private String Gender;
   private String Email;


   static Scanner UserInput=new Scanner(System.in);


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    @Override
    public void idisplay() {

    }
}
