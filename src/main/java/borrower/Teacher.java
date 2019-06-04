package borrower;

public class Teacher extends Borrower_Type{

    String FacultyName;
    String Subject;
    String Contact;

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String facultyName) {
        FacultyName = facultyName;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    @Override
    public void idisplay() {
        super.idisplay();
    }
}
