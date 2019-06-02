package borrower;

import sun.swing.SwingUtilities2;

public class Student {

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

}
