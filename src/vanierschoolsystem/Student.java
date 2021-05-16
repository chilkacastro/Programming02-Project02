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
 * A Student Class
 * @author Chilka Castro
 */
public class Student extends User implements Serializable {
    private List<Course> regCourses;

    /**
     * Constructor with two data members
     * @param fname the first name of the Student
     * @param lname the last name of the Student
     */
    public Student(String fname, String lname) {
        super(fname, lname);
        super.userId = VanierSchoolSystem.generateId('s');
        this.regCourses = new ArrayList<>();
    }

    /**
     * Copy constructor
     * @param student the student to copy
     */
    public Student(Student student) {
        super(student);
        this.regCourses = new ArrayList<>(student.regCourses);
    }
    
    /**
     * Registers a course
     * @param courseName the name of the course
     * @return a number : 1 means student has it already, 2 means the student
     * was able to register successfully and 3 means it is full.
     */
    public int registerCourse(String courseName) {
        boolean courseValid = false;
        for (Course course : VanierSchoolSystem.courses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                courseValid = true;
                int studentCount = course.getRegsStudents().size();
                // Student has it already
                if (regCourses.contains(course)) 
                    return 1; 
                if (!regCourses.contains(course)) {
                    // Course is full so student cant register
                    if (studentCount == course.getMaxStudent())
                        return 2;
                    // Student registers successfully
                    if (studentCount < course.getMaxStudent() && studentCount >= 0) {
                        course.getRegsStudents().add(this);
                        this.regCourses.add(course);
                        VanierSchoolSystem.serializeAllData();
                        return 3; 
                    }       
                }
                break; 
            }        
        }
        if (!courseValid) { // course is not valid
            return 4;
        }
        return 4;
    }
    
    /**
     * Generates a hash code value for the Student object
     * @return a hash code value for the Student object
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + super.hashCode();
        hash = 17 * hash + Objects.hashCode(this.regCourses);
        return hash;
    }

    /**
     * Checks if two objects are the same or not
     * @param obj the object to be compared with
     * @return True if both objects are the same and False if not
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Student other = (Student) obj;
        if (!super.equals(other))
            return false;
        if (!Objects.equals(this.regCourses, other.regCourses))
            return false;
        return true;
    }
    
    /**
     * Creates a String that represents a Student
     * @return a String that represents a Student
     */
    @Override
    public String toString() {
        String str = "";
        int idx = 0;
        str += super.toString();
        str += String.format("%s :\n ", "Registered Courses");
            for (Course regCourse : regCourses) {
                str += String.format("%s : ", toCamelCase(regCourse.getCourseName())); 
                try {
                    if (regCourse.getRegsStudents().contains(this)) {
                        idx = regCourse.getRegsStudents().indexOf(this);
                        str += String.format("%s\n", 
                                regCourse.getFinalScores().get(idx)); 
                    }
                }
                catch(IndexOutOfBoundsException e) {
                    str += String.format("%s\n", "null");   
                }
            } 
        return str;
    }

    public List<Course> getRegCourses() {
        return regCourses;
    }

    public void setRegCourses(List<Course> regCourses) {
        this.regCourses = regCourses;
    }
}
