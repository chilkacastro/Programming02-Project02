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
 *
 * @author Chilka Castro
 */
public class Course implements Serializable {
    private String courseId;
    private String courseName;
    private int maxStudent;
    private Teacher teacher;
    private List<Student> regsStudents;
    private List<Double> finalScores;

    /**
     * Constructor with one data member
     * @param courseName the name of the course
     */
    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.courseId = VanierSchoolSystem.generateId('c');
        this.maxStudent = 3;
        this.teacher = teacher; 
        this.regsStudents = new ArrayList<>();
        this.finalScores = new ArrayList<>();
    }
    
    /**
     * Copy constructor
     * @param course the course object to copy
     */
    public Course(Course course) {
        this.courseId = course.courseId;
        this.courseName = course.courseName;
        this.maxStudent = course.maxStudent;
        this.teacher = course.teacher;
        this.regsStudents = new ArrayList<>(course.regsStudents);
        this.finalScores = new ArrayList<>(course.finalScores);
    }

    /**
     * Retrieves the final grade of a Student for a course
     * @param regStudent the student who's final grade needs to be retrieved
     * @return the final grade of the student
     */
    public Double retrieveStudentFinalGrade(Student regStudent) {
        // Step 1: Find the index of this student
        try {
        int studentIdx = regsStudents.indexOf(regStudent);
        
        // Step 2: Get the score of that student using the student idx
        Double finalScore = finalScores.get(studentIdx);
        return finalScore;
        // Step 3 : Return the final grade for that student
        }
        
        catch (IndexOutOfBoundsException e) {
        }
        
        return null;
       
    }

    /**
     * Adds a score for a specific student in a specific course
     * @param teacher the teacher 
     * @param score the score of the student
     * @param name the name of the student
     * @return an int number
     */
    public int addScore(Teacher teacher, Double score, String name) {   
        // if the teacher is the same with the teacher object was sent here
        if (this.teacher.equals(teacher))  
            // if the name of the student is the same for the students of this course
            for (Student student : regsStudents)  {
                if (student.fname.equalsIgnoreCase(name)) {
                    int idx = regsStudents.indexOf(student);
                    finalScores.add(idx, score);
                    return 1;
                }
            }
        // if student is not valid
        return 2;
    }       

    /**
     * Generates a hash code value for a course
     * @return a hash code value for a course
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.courseId);
        return hash;
    }
    
    /**
     * Checks if two object are the same or not
     * @param obj the object to be compared with
     * @return  True if both are the same and False if not
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
        final Course other = (Course) obj;
        if (!Objects.equals(this.courseId, other.courseId)) {
            return false;
        }
        return true;
    }

    /**
     * Creates a String that represents a Course
     * @return a String that represents a Course
     */
    @Override
    public String toString() {
        String str = "";
        String finalGrade;
        
        // Course - courseId, courseName, maxStudent
        str += String.format("%-10s : %s\n", "Course ID", courseId);    
        str += String.format("%-10s : %s\n", "Course Name", courseName);
        str += String.format("%-10s : %d\n", "Max Student", maxStudent);
        
        // Teacher - teacherId, teacher full name
        str += String.format("%-10s : %s\n", "Teacher's user ID", teacher.userId);
        str += String.format("%-10s : %s %s\n", "Teacher", teacher.getFname(), teacher.getLname());
        
        // Student - studentId, student full name and final grade
        str += String.format("%s\n", "Students");
        for (Student regStudent : regsStudents) {
            if (retrieveStudentFinalGrade(regStudent) != null)
                finalGrade = String.format("%.1f", retrieveStudentFinalGrade(regStudent));
            else 
                finalGrade = "null";
            str += String.format("\t%s\n\t%s %s : %s\n", regStudent.userId, 
                    regStudent.getFname(), regStudent.getLname(), finalGrade);
        
        }
        return str;
    }
    
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getRegsStudents() {
        return regsStudents;
    }

    public void setRegsStudents(List<Student> regsStudents) {
        this.regsStudents = regsStudents;
    }

    public List<Double> getFinalScores() {
        return finalScores;
    }

    public void setFinalScores(List<Double> finalScores) {
        this.finalScores = finalScores;
    }   
}
