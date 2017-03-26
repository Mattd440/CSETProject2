package CSET.controller;

import CSET.model.Course;
import CSET.model.CourseData;

/**
 * Created by Matt on 2/16/2017.
 */
public class CourseUtils {
    // object that is used to access arrays of courses
  private static CourseData courseData = new CourseData();

    // method used to display the courses the student still needs to complete
    //@params -> an object containing the arrays of courses
    public static void printRemainingCourses(CourseData courseData){

       // get all the cset courses and loop through displaying each
        System.out.println("CSET Courses Remaining");
        for(Course c: courseData.getCset()){
            System.out.println(c.toString());
        }

        // get all the math courses and loop through displaying each
        System.out.println(" \nMath Courses Remaining");
        for(Course c: courseData.getMath()){
            System.out.println(c.toString());
        }

        System.out.println(" \nPhilosophy Courses Remaining");
        for(Course c: courseData.getPhil()){
            System.out.println(c.toString());
        }

        System.out.println(" \nPhysics Courses Remaining");
        for(Course c: courseData.getPhysics()){
            System.out.println(c.toString());
        }

        System.out.println(" \nEECS Courses Remaining");
        for(Course c: courseData.getEecs()){
            System.out.println(c.toString());
        }

        System.out.println(" \nEnglish Courses Remaining");
        for(Course c: courseData.getEngl()){
            System.out.println(c.toString());
        }

        System.out.println(" \n ElectricalEngineering Courses Remaining");
        for(Course c: courseData.getEet()){
            System.out.println(c.toString());
        }
        System.out.println(" \nEngineering Courses Remaining");
        for(Course c: courseData.getEngt()){
            System.out.println(c.toString());
        }
    }

    // method to remove a course from the array of courses
    //@params -> 1. an obect containg the arrays of courses
    //@params -> 2. a string containing the information of the course to be removed
    public static void removeClass(CourseData courseData, String course){
        // split the string in two parts
        // first four characters are the type of course
        try {
                String courseType = course.substring(0, 4);
                // last four characters are the section number of the course
                int sectionNumber = Integer.parseInt(course.substring(4));

                // verify the section number is within a valid range
                if (sectionNumber > 1000 && sectionNumber < 5000) {
                    // switch statement to determine the type of course to be removed
                    switch (courseType.toLowerCase()) {
                        case "cset":
                            // remove the course from the array of cset courses and
                            // set the array to be the orignal array minus the removed course
                            courseData.setCset(findAndRemove(courseData.getCset(), sectionNumber));
                            break;
                        case "math":
                            // remove the course from the array of math courses and
                            // set the array to be the orignal array minus the removed course
                            courseData.setMath(findAndRemove(courseData.getMath(), sectionNumber));
                            break;
                        case "phil":
                            // remove the course from the array of math courses and
                            // set the array to be the orignal array minus the removed course
                            courseData.setPhil(findAndRemove(courseData.getPhil(), sectionNumber));
                            break;
                        case "engt":
                            // remove the course from the array of math courses and
                            // set the array to be the orignal array minus the removed course
                            courseData.setEngt(findAndRemove(courseData.getEngt(), sectionNumber));
                            break;
                        case "phys":
                            // remove the course from the array of math courses and
                            // set the array to be the orignal array minus the removed course
                            courseData.setPhysics(findAndRemove(courseData.getPhysics(), sectionNumber));
                            break;
                        case "eett":
                            // remove the course from the array of math courses and
                            // set the array to be the orignal array minus the removed course
                            courseData.setEet(findAndRemove(courseData.getEet(), sectionNumber));
                            break;
                        case "eecs":
                            // remove the course from the array of math courses and
                            // set the array to be the orignal array minus the removed course
                            courseData.setEecs(findAndRemove(courseData.getEecs(), sectionNumber));
                            break;
                        case "engl":
                            // remove the course from the array of math courses and
                            // set the array to be the orignal array minus the removed course
                            courseData.setEngl(findAndRemove(courseData.getEngl(), sectionNumber));
                            break;
                        default:
                            //display error message
                            System.out.println("Invalid Course Number");
                    }
                } else {
                    //display error message
                    System.out.println("Invalid Section Number");
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // private helper method to find the given course in the array of courses of a particular subject
    //@params 1. am array of courses of the given subject ..math.. cset
    //@params 2. the section number of the course to be removed
    public static Course[] findAndRemove(Course[] courses, int sectionNumber){
        // course array to hold the new array minus the removed course
        Course[] copyCourses;
        //loop through all courses in the array
        for(int i =0;i<courses.length ; i++){
            // //test for a match
            if(courses[i].getSectionNumber() == sectionNumber){
                //remove the course from the array
                for(;i < courses.length-1; ++i){
                    courses[i] = courses[i+1];
                }
            }
        }
        // initialize the copy array
        copyCourses = new Course[courses.length-1];

        for(int i = 0; i < courses.length-1;i++){
            // copy courses from original array to the new array
            copyCourses[i] = courses[i];
        }
        //return the copied array
        return copyCourses;
    }

    // method to get the number of credit hours a course is worth
    //@params -> a string containiing the course data
    public static int getCreditHours(String course){
        //split string in half .. first have is course type second is section Number
        try{
            if(course.length() == 8){
            String courseType = course.substring(0,4);
            int sectionNumber = Integer.parseInt(course.substring(4));

            // test for valid section number
            if(sectionNumber > 1000 && sectionNumber < 5000){
                //switch to determine the type of course
                switch(courseType.toLowerCase()){
                    case "cset":
                        //use the find hrs helper method to return the number of credits
                        // pass it the array of cset course and the section number
                        return findHrs(courseData.getCset(),sectionNumber);
                    case "math":
                        //use the find hrs helper method to return the number of credits
                        // pass it the array of math course and the section number
                        return findHrs(courseData.getMath(),sectionNumber);
                    case "phil":
                        // remove the course from the array of math courses and
                        // set the array to be the orignal array minus the removed course
                        return findHrs(courseData.getPhil(),sectionNumber);
                    case "engt":
                        // remove the course from the array of math courses and
                        // set the array to be the orignal array minus the removed course
                        return findHrs(courseData.getEngt(),sectionNumber);
                    case "phys":
                        // remove the course from the array of math courses and
                        // set the array to be the orignal array minus the removed course
                        return findHrs(courseData.getPhysics(),sectionNumber);
                    case "eett":
                        // remove the course from the array of math courses and
                        // set the array to be the orignal array minus the removed course
                        return findHrs(courseData.getEet(),sectionNumber);
                    case "eecs":
                        // remove the course from the array of math courses and
                        // set the array to be the orignal array minus the removed course
                        return findHrs(courseData.getEecs(),sectionNumber);
                    case "engl":
                        // remove the course from the array of math courses and
                        // set the array to be the orignal array minus the removed course
                        return findHrs(courseData.getEngl(),sectionNumber);
                    default:
                        System.out.println("Invalid Course Number");
                }
            }else{
                System.out.println("Invalid Section Number");
            }}else {
                System.out.println("Course must be 8 characters long");
            }
        }
        catch(NumberFormatException nfe){
            nfe.printStackTrace();
        }

        return 0 ;
    }

    //private helper method to find the number of credit hours a course is worth
    //@params -> 1. an array containing all the courses a particullar subject
    //@params -> 2. the section number to find
    protected static int findHrs(Course[] courses,int sectionNumber) {
        //loop through all course
        for (Course c : courses) {
            // test for a match
            if (c.getSectionNumber() == sectionNumber) {
                //return the number of credut hours
                return c.getCreditHours();
            }

        }
        //display error return 0

        return 0;
    }
}
