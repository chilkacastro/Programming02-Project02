/*
 * The MIT License
 *
 * Copyright 2021 Chilka Castro .
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package vanierschoolsystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A Teacher Class
 * @author Chilka Castro
 */
public class Teacher extends User implements Serializable {
    private List<Course> teachingCourses;

    /**
     * Constructor with two data members
     *
     * @param fname the first name of the teacher
     * @param lname the last name of the teacher
     */
    public Teacher(String fname, String lname) {
        super(fname, lname);
        super.userId = VanierSchoolSystem.generateId('T');
        this.teachingCourses = new ArrayList<>();
    }

    /**
     * Copy constructor
     * @param teacher the teacher to copy
     */
    public Teacher(Teacher teacher) {
        super(teacher);
        this.teachingCourses = new ArrayList<>(teacher.teachingCourses);
    }

    /**
     * Checks if the teacher teaches that course or not
     * @param courseName the name of the course
     * @return True if the teacher teaches that course and false if not
     */
    public boolean checkTeacherCourses(String courseName) {
        for (Course course : teachingCourses) 
            if (course.getCourseName().equalsIgnoreCase(courseName))
                return true;
        
        return false;
    }
    
    /**
     * Adds the course in the teaching courses list
     * @param course the course to add to the teaching course
     */
    public void updateCourse(Course course) {
        teachingCourses.add(course);
    }
    
    /**
     * Creates a String that represents a Teacher
     * @return a String that represents a Teacher
     */
    @Override
    public String toString() {
        String str = "";

        str += super.toString();
        str += String.format("%s : \n", "Teaching Courses");
        for (Course teachCourse : teachingCourses) 
            str += String.format("\t%s\n", teachCourse.getCourseName());
        
        return str;
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    public void setTeachingCourses(List<Course> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }
}
