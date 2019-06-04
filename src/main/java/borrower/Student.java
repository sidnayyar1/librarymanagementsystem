package borrower;



public class Student extends Borrower_Type {

    int BatchNumber;
    String ClassName;

    public int getBatchNumber() {
        return BatchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        BatchNumber = batchNumber;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getSectionName() {
        return SectionName;
    }

    public void setSectionName(String sectionName) {
        SectionName = sectionName;
    }

    String SectionName;

    @Override
    public void idisplay() {
     System.out.println(" first Name "+getFirstName());

        System.out.println("Last Name "+getLastName());

        System.out.println("Gender "+getGender());

        System.out.println("email "+getEmail());

        System.out.println("Batch Number"+ getBatchNumber());

        System.out.println("Class Name"+getClassName());

    }


}


