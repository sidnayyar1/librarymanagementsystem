package book;

public class Arts extends Book_Type {

    String Author;
    int subject;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    @Override
    public void idisplay() {
        super.idisplay();
    }
}
