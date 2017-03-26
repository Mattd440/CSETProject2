package CSET.model;



public class Course {
    //course properties
    private String year;
    private String type;
    private int sectionNumber;
    private int creditHours;

    public Course() {
    }

    //constructor to create a new course object
    public Course(String year, String type, int sectionNumber, int creditHours) {
        this.year = year;
        this.type = type;
        this.sectionNumber = sectionNumber;
        this.creditHours = creditHours;
    }
    // getter methods to retrieve information about a course
    public String getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public int getCreditHours() {
        return creditHours;
    }


    //override tostring method to format output about a course
    @Override
    public String toString() {
        return "Course: " + this.type + this.sectionNumber + "  Credits: " + this.creditHours +"  Level: " + this.year ;
    }
}
