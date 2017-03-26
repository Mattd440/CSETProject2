package CSET.model;

import CSET.model.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Matt on 2/9/2017.
 */
public class CourseData {

    // array of all cset courses
    private Course[] cset = new Course[]{
            new Course("Fr", "CSET", 1100, 3),
            new Course("Fr", "CSET", 1200, 3),
            new Course("So", "CSET", 2230, 4),
            new Course("So", "CSET", 2200, 4),
            new Course("Jr", "CSET", 3150, 4),
            new Course("Jr", "CSET", 3300, 4),


            new Course("Sr", "CSET", 3600, 3),
            new Course("Sr", "CSET", 4350, 3),

            new Course("Sr", "CSET", 4750, 4),
            new Course("Sr", "CSET", 4250, 3),

    };

    // array of all math courses
    private Course[] math ={
            new Course("So", "MATH",2460, 3),
            new Course("So", "MATH",2450, 3),

            new Course("Jr", "MATH",2890,3)
    };



    private Course[] phil = {
            new Course("Fr","PHIL",1010,3)
    };

    private Course[] engt ={
            new Course("Fr","ENGT",1000,1),
            new Course("So","ENGT",3050,4),
            new Course("Jr","ENGT",2000,3),
            new Course("Jr","ENGT",3010,4),
            new Course("Sr","ENGT",4050,3)
    };

    private Course[] engl  ={
            new Course("Fr","ENGL",1110,3),
            new Course("Fr","ENGL",2950,3)
    };

    private Course[] physics  ={
             new Course("Fr","PHYS",2010,4),
            new Course("So","PHYS",2020,4)
    };



    private Course[] eet = {
            new Course("Fr","EETT",2210,4),
            new Course("So","EETT",2410,4),
            new Course("Jr","EETT",3350,4)
    };

    private Course[] eecs = {
       new Course("So","EECS",1590,3)
    } ;


        public List<Course>  getAllCourses(){
            List<Course> allCourses= new ArrayList<>();

            allCourses.addAll(Arrays.asList(this.getCset()));
            allCourses.addAll(Arrays.asList(this.getMath()));
            allCourses.addAll(Arrays.asList(this.getPhil()));
            allCourses.addAll(Arrays.asList(this.getEngt()));
            allCourses.addAll(Arrays.asList(this.getEngl()));
            allCourses.addAll(Arrays.asList(this.getPhysics()));
            allCourses.addAll(Arrays.asList(this.getEet()));
            allCourses.addAll(Arrays.asList(this.getEecs()));

            return allCourses;
        };

    //methods to return the list of courses of a subject
    public Course[] getCset() {
        return cset;
    }

    public Course[] getMath() {
        return math;
    }

    public void setCset(Course[] cset) {
        this.cset = cset;
    }

    public void setMath(Course[] math) {
        this.math = math;
    }

    public Course[] getEecs() {
        return eecs;
    }

    public void setEecs(Course[] eecs) {
        this.eecs = eecs;
    }

    public Course[] getEet() {
        return eet;
    }

    public void setEet(Course[] eet) {
        this.eet = eet;
    }

    public Course[] getEngl() {
        return engl;
    }

    public void setEngl(Course[] engl) {
        this.engl = engl;
    }

    public Course[] getEngt() {
        return engt;
    }

    public void setEngt(Course[] engt) {
        this.engt = engt;
    }

    public Course[] getPhil() {
        return phil;
    }

    public void setPhil(Course[] phil) {
        this.phil = phil;
    }

    public Course[] getPhysics() {
        return physics;
    }

    public void setPhysics(Course[] physics) {
        this.physics = physics;
    }










}