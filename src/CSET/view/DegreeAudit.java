package CSET.view;

import CSET.controller.CourseUtils;
import CSET.controller.ElectiveUtils;
import CSET.model.CourseData;
import CSET.model.ElectiveData;
import CSET.model.Student;

import java.util.*;

public class DegreeAudit {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         Student student;
    //boolean valid = true;
         // enter students name and create student object
         System.out.println("Enter the students name");
         student = new Student(input.next());

         //Get the amount of classes student has taken
         try {
             System.out.println("How many regular courses have you completed?");
             student.setCoursesTaken(input.nextInt());

             System.out.println("How many elective courses have you completed?");
             student.setElectivesTaken(input.nextInt());

         }catch(InputMismatchException e){
            System.out.println(e.getMessage());
         }
         //call methods to enter courses and electives
         student.enterCoursesCompleted();
         student.enterElectiveCoursesCompleted();

         //print the students information
         student.printStudentData();






     }
}
