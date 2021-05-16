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
import java.util.Objects;

/**
 * A Teacher Class
 *
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
     *
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
        for (Course course : teachingCourses) {
            if (course.getCourseName().equalsIgnoreCase(courseName))
                return true;
        
        }
        return false;
    }
    
    /**
     * Adds the course in the course
     * @param course
     */
    public void updateCourse(Course course) {
        teachingCourses.add(course);
    }
    
    /**
     * 
     * @param name
     * @return 
     */
    public boolean checkStudentExist(String name) {
        for (User user : VanierSchoolSystem.users) {
            if (user.userId.charAt(0) == 's' || user.userId.charAt(0) == 'S') {
                for (Course studentCourse : ((Student)user).getRegCourses()) {
                    if (teachingCourses.contains(studentCourse))
                        return true; 
                }

            }
        }
        return false;
    }
    

    /**
     * Generates a hash code value for a Teacher object
     *
     * @return a hash code value
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * super.hashCode();
        hash = 23 * hash + Objects.hashCode(this.teachingCourses);
        return hash;
    }

    /**
     * Checks if two objects are the same or not
     *
     * @param obj the object to be compared with
     * @return True if both are the same and False if not
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teacher other = (Teacher) obj;
        if (!super.equals(other)) {
            return false;
        }
        if (!Objects.equals(this.teachingCourses, other.teachingCourses)) {
            return false;
        }
        return true;
    }

    /**
     * Creates a String that represents a Teacher
     *
     * @return a String that represents a Teacher
     */
    @Override
    public String toString() {
        String str = "";

        str += super.toString();
        str += String.format("%s : \n", "Teaching Courses");
        for (Course teachCourse : teachingCourses) {
            str += String.format("\t%s\n", teachCourse.getCourseName());
        }

        return str;
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    public void setTeachingCourses(List<Course> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }
}
