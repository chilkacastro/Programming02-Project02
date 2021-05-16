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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A School System
 * @author Chilka Castro
 */
public class VanierSchoolSystem {
    protected static final Admin admin = new Admin("Chilka", "Castro");
    protected static ArrayList<User> users;
    protected static ArrayList<Student> students;
    protected static ArrayList<Teacher> teachers;
    protected static ArrayList<Course> courses;
    
    /**
     * Initializes students, admins, courses, and teachers. Calls de-serialize 
     * method when there is already a file created for each Array list in the 
     * given path. On the other hand, it creates an ArrayList if no file is 
     * found in the given path.
     */
    public static void initData() {
        String usersPath = "data\\users.ser";                       
        String studentsPath = "data\\students.ser";                       
        String teachersPath = "data\\teachers.ser";                                           
        String coursesPath = "data\\courses.ser";                      

        File usersFile = new File(usersPath);                  
        File teachersFile = new File(teachersPath);                  
        File studentsFile = new File(studentsPath);                             
        File coursesFile = new File(coursesPath);                  
        
        // Users
        if (usersFile.isFile())
            users = (ArrayList<User>) deserializeData(usersPath);
        else  // A001 pass : 1234
            users = new ArrayList(Arrays.asList(admin));     
        
        // Students
        if (studentsFile.isFile())
            students = (ArrayList<Student>) deserializeData(studentsPath);
        else
            students = new ArrayList<>();
        
        // Teachers
        if (teachersFile.isFile())
            teachers = (ArrayList<Teacher>) deserializeData(teachersPath);
        else
            teachers = new ArrayList<>();
        
        // Courses 
        if (coursesFile.isFile())
            courses = (ArrayList<Course>) deserializeData(coursesPath);
        else
            courses = new ArrayList<>();
    }
    
    /**
     * De-serialize data from a file
     * @param path the path of the file
     * @return the data de-serialized from the file
     */
    public static Object deserializeData(String path) {
        try ( FileInputStream fis = new FileInputStream(path)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            return ois.readObject();
        } catch (Exception e) {
        }
        return null;
    }
   
    /**
     * Serialize data into a file
     * @param path the path of the file
     * @param object the object to be serialized
     */
    public static void serializeData(String path, Object object) {
        try ( FileOutputStream fos = new FileOutputStream(path)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
        } catch (Exception e) {
        }
    }

    /**
     * Serialize students, teachers, admins, and courses
     */
    public static void serializeAllData() {
        serializeData("data\\users.ser", users);     
        serializeData("data\\students.ser", students);     
        serializeData("data\\teachers.ser", teachers);        
        serializeData("data\\courses.ser", courses);     
    }
    
    /**
     * Generates an ID depending on the type
     * @param type the type that requires ID : admin, teacher, student, course
     * @return a generated ID
     */
    public static String generateId(char type) {
        type = Character.toLowerCase(type);
        try {
            switch (type) {
                case 's':   // student
                    return String.format("S%03d", students.size() + 1);
                case 't':   // teachers
                    return String.format("T%03d", teachers.size() + 1);
                default :  // courses
                    return String.format("C%03d", courses.size() + 1);
            }
        } 
        catch (NullPointerException e) {
            initData();
        }
        return "";
    }
    
    /**
     * Adds a student to the students collection
     * @param student a new Student
     */
    public static void addStudent(Student student) {
        try {
            students.add(student);
            users.add(student);
        } 
        catch (NullPointerException e) {
            initData();
        } 
        serializeAllData();
    }
    
    /**
     * Adds a teacher to the teachers collection
     * @param teacher a new teacher
     */
    public static void addTeacher(Teacher teacher) {
        try {
            teachers.add(teacher);
            users.add(teacher);
        } 
        catch (NullPointerException e) {
            initData();
        }
        serializeAllData();
    }
   
    /**
     * Adds a course to the courses collection
     * @param course a new course
     */
    public static void addCourse(Course course) {
        try {
            courses.add(course); 
        } 
        catch (NullPointerException e) {
            initData();
        }
        serializeAllData();
    }
}
