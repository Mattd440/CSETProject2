package CSET.controller;

import CSET.model.Course;
import CSET.model.CourseData;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Matt on 3/8/2017.
 */
public class CourseUtilsTest {
    private static CourseData courses;
    private Course[] courseList;
    private Course[] testMathCourses;

    private String removedCourse;

    private Course testCourse1;
    private Course testCourse2 ;

    @Before
    public void setUp() throws Exception {
        courses = new CourseData();
        testMathCourses = new Course[]{
                  new Course("So", "MATH",2450, 3) };
        removedCourse = "math2890";
       courseList= new Course[]{
                new Course("So", "MATH",2450, 3),
                new Course("So", "MATH",2460, 3),
                new Course("Jr", "MATH",2890,3)};


        testCourse1 = new Course("Sr", "CSET", 3600, 3);
        testCourse2 = new Course("So", "MATH",2450, 3);
    }


    @Test
    public void getCreditHoursReturnsCorrectCreditHours() throws Exception {
        assertEquals(3, CourseUtils.getCreditHours("cset1200"));
        assertEquals(3 , CourseUtils.getCreditHours("math2450"));
    }

//    @Test
//    public void removeCourseRemovesCrseListourseFromArray() throws Exception {
//        CourseUtils.removeClass(courses,"math2890");
//        CourseUtils.removeClass(courses,"math2460");
//        Course[] mathCourses= courses.getMath();
//        assertArrayEquals (testMathCourses,mathCourses);
//    }
}