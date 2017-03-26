package CSET.model;

import CSET.controller.CourseUtils;
import CSET.controller.ElectiveUtils;

import java.util.HashMap;
import java.util.Scanner;


public class Student{
    private final int HOURSTOGRADUATE = 128;
    private Scanner input = new Scanner(System.in);
    private CourseData courses = new CourseData();
    private int credits =0;
    private HashMap<ElectiveName,Integer> electiveCredits = new HashMap<ElectiveName,Integer>();
    private String name;
    private int coursesTaken;
    private int electivesTaken;
    private int hoursCompleted;


    private Student() {
        electiveCredits.put(ElectiveName.CSET,7);
        electiveCredits.put(ElectiveName.PROF,6);
        electiveCredits.put(ElectiveName.COMM,3);
        electiveCredits.put(ElectiveName.NSCI,4);
        electiveCredits.put(ElectiveName.SSCI,6);
        electiveCredits.put(ElectiveName.HUMA,6);
        electiveCredits.put(ElectiveName.MULT,6);
    }

    public Student(String name) {
        this();
        this.name = name;
    }

    public void setCoursesTaken(int coursesTaken) {
                this.coursesTaken = coursesTaken;
            }

    public void setElectivesTaken(int electivesTaken) {
                this.electivesTaken = electivesTaken;
            }

    private void setHoursCompleted(int hoursCompleted) {
                this.hoursCompleted = hoursCompleted;
            }

    public void enterCoursesCompleted(){
        String course;
        for(int i = 0; i < this.coursesTaken;i++){
            System.out.println("Enter a regular course that you have completed in the form CSET1200");
            course = input.next();

            // determine how many credit hours the course entered is worth
            //loop until credits does not equal zero to ensure the specified amount of courses are entered correctly
            while(credits == 0){
                credits = CourseUtils.getCreditHours(course);
                if(credits == 0){
                    System.out.println("Invalid Course Please Enter a course that you have completed in the form CSET1200");
                    course = input.next();
                }
            }



            // add that number of credits to the number they have completed
            this.setHoursCompleted(this.hoursCompleted + credits);

            // remove completed course from the list of all the courses
            CourseUtils.removeClass(courses,course);
        }
    }

    public void enterElectiveCoursesCompleted(){
        String elective;
        for(int i = 0; i < this.electivesTaken;i++) {
            System.out.println("Enter an elective course that you have completed in the form CSET1200  ");
            elective = input.next();

            String courseType = elective.substring(0,4);
            int sectionNumber = Integer.parseInt(elective.substring(4));

            while(credits == 0){
                credits = ElectiveUtils.getElectiveCreditHours(elective);

                if(credits == 0){
                    System.out.println("Invalid Course Please Enter an elective that you have completed in the form CSET1200");
                    elective = input.next();
                }
            }
            hoursCompleted += credits;
            ElectiveUtils.updateCreditsRemaining(electiveCredits,courseType.toLowerCase(),credits,sectionNumber);
        }
    }

    public void printStudentData(){
                System.out.printf("\n\n \t\t%s's Degree Summary \n\n",this.name);
                // print out the number of courses they have left to complete
                System.out.printf("You have %d credits left  to graduate\n", HOURSTOGRADUATE - this.hoursCompleted);

                System.out.printf("\nThe courses you need to graduate are: \n\n");

                // print out all the courses the student still needs to take
                CourseUtils.printRemainingCourses(courses);

                System.out.printf("\n\nRemaining Elective Credits \n");
                ElectiveUtils.printCreditData(electiveCredits);
            }

}