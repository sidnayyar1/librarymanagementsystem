package Admin;

import Display.IDisplay;


public class Librarian implements IDisplay {

int id;
int workingHour;
String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public void idisplay() {
        System.out.println("Lirarian Details");
        System.out.println("id "+getId());
        System.out.println("Working Hours " +getWorkingHour());
        System.out.println("Name "+ getName());
    }

}
