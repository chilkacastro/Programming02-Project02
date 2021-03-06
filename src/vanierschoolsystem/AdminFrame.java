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

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 * An AdminFrame Class
 * @author Chilka Castro
 */
public class AdminFrame extends javax.swing.JFrame implements Serializable {
    private Admin admin;
    
    /**
     * Creates new form AdminFrame
     */
    public AdminFrame(Admin admin) {
        initComponents();
        this.admin = admin;
        ImageIcon adminImg = new ImageIcon("imgs\\admin.png");
        imgL.setIcon(adminImg);
        welcomeL.setText(String.format("Welcome, %s %s", admin.fname, admin.lname));
        teacherTF.setVisible(false);        
        teacherL.setVisible(false);
        displayWindowTA.setFocusable(false);
        VanierSchoolSystem.initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeBG = new javax.swing.ButtonGroup();
        welcomeL = new javax.swing.JLabel();
        choiceP = new javax.swing.JPanel();
        studentRB = new javax.swing.JRadioButton();
        teacherRB = new javax.swing.JRadioButton();
        courseRB = new javax.swing.JRadioButton();
        nameL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        teacherL = new javax.swing.JLabel();
        teacherTF = new javax.swing.JTextField();
        addB = new javax.swing.JButton();
        addMsgL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayWindowTA = new javax.swing.JTextArea();
        displayWindowL = new javax.swing.JLabel();
        addElementsL = new javax.swing.JLabel();
        displayB = new javax.swing.JButton();
        imgL = new javax.swing.JLabel();
        logOutB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        welcomeL.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        welcomeL.setForeground(new java.awt.Color(0, 0, 102));

        choiceP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        typeBG.add(studentRB);
        studentRB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        studentRB.setForeground(new java.awt.Color(0, 0, 0));
        studentRB.setSelected(true);
        studentRB.setText("Student");
        studentRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRBActionPerformed(evt);
            }
        });

        typeBG.add(teacherRB);
        teacherRB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        teacherRB.setForeground(new java.awt.Color(0, 0, 0));
        teacherRB.setText("Teacher");
        teacherRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRBActionPerformed(evt);
            }
        });

        typeBG.add(courseRB);
        courseRB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        courseRB.setForeground(new java.awt.Color(0, 0, 0));
        courseRB.setText("Course");
        courseRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseRBActionPerformed(evt);
            }
        });

        nameL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameL.setForeground(new java.awt.Color(0, 0, 0));
        nameL.setText("Name:");

        nameTF.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTFKeyReleased(evt);
            }
        });

        teacherL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        teacherL.setForeground(new java.awt.Color(0, 0, 0));
        teacherL.setText("Teacher:");

        teacherTF.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        addB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addB.setForeground(new java.awt.Color(0, 0, 0));
        addB.setText("Add");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        addMsgL.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        javax.swing.GroupLayout choicePLayout = new javax.swing.GroupLayout(choiceP);
        choiceP.setLayout(choicePLayout);
        choicePLayout.setHorizontalGroup(
            choicePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choicePLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(choicePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addMsgL, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(choicePLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(choicePLayout.createSequentialGroup()
                        .addGroup(choicePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentRB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherRB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseRB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(choicePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(choicePLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(teacherL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(choicePLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(choicePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTF)
                            .addComponent(teacherTF))))
                .addGap(18, 18, 18))
        );
        choicePLayout.setVerticalGroup(
            choicePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choicePLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(choicePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentRB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(choicePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(choicePLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teacherRB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(courseRB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(choicePLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(choicePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teacherTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addMsgL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        displayWindowTA.setColumns(20);
        displayWindowTA.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        displayWindowTA.setForeground(new java.awt.Color(0, 51, 102));
        displayWindowTA.setRows(5);
        jScrollPane1.setViewportView(displayWindowTA);

        displayWindowL.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        displayWindowL.setForeground(new java.awt.Color(0, 0, 0));
        displayWindowL.setText("Display window");

        addElementsL.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addElementsL.setForeground(new java.awt.Color(0, 0, 0));
        addElementsL.setText("Add new elements");

        displayB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        displayB.setForeground(new java.awt.Color(0, 0, 0));
        displayB.setText("Display");
        displayB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBActionPerformed(evt);
            }
        });

        logOutB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        logOutB.setForeground(new java.awt.Color(0, 0, 0));
        logOutB.setText("Log Out");
        logOutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addElementsL, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choiceP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(displayWindowL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logOutB))))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutB))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addElementsL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayWindowL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(choiceP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(imgL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(displayB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * An AdminFrame class
     * @param evt the event
     */
    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        addMsgL.setForeground(Color.BLACK);
        addElement();
    }//GEN-LAST:event_addBActionPerformed
    
    /**
     * Add a teacher, a course, a student in the school system
     */
    public void addElement() {
        if (studentRB.isSelected()) 
            addStudent();
        
        else if (teacherRB.isSelected())
            addTeacher();
        
        else 
            addCourse();
    }

    /**
     * Adds a teacher in the school system
     */
    public void addTeacher() {
        try {
            String input = nameTF.getText();
            int spaceIdx = input.indexOf(' ');
            String fname = input.substring(0, spaceIdx);
            String lname = input.substring(spaceIdx + 1); 
            
            // Add Teacher
            Teacher teacher = new Teacher(fname, lname);
            VanierSchoolSystem.addTeacher(teacher);   
        } 
        catch (StringIndexOutOfBoundsException e) {
            addMsgL.setForeground(Color.RED);
            addMsgL.setText("Adding teacher failed");
        }
        addMsgL.setForeground(Color.GREEN);
        addMsgL.setText("Teacher successfully added");
        setVisibility();        
    }

    /**
     * Adds a course to the system as long as the teacher of that course exist
     */
    public void addCourse() {
        setVisibility();                            // shows teacher text field
        String input = nameTF.getText();
        String teacherUserId = teacherTF.getText();
        boolean teacherValid = false;
        
        // Check if teacher exist
        for (Teacher existTeacher : VanierSchoolSystem.teachers) 
            if (existTeacher.userId.equalsIgnoreCase(teacherUserId)) {
                teacherValid = true;
                Course course;
                course = new Course(input, existTeacher);
                // The teacher also gets that course in his/her list of courses
                existTeacher.updateCourse(course);
                // Adds and serializes the new course to the Vanier School System
                VanierSchoolSystem.addCourse(course); 
                addMsgL.setForeground(Color.GREEN);
                addMsgL.setText("Course successfully added");
            }        
        if (!teacherValid) {
            addMsgL.setForeground(Color.RED);
            addMsgL.setText("The teacher does not exist.");
        }    
    }

    /**
     * Adds a student in the school system
     */
    public void addStudent() {
        try { 
            String input = nameTF.getText();
            int spaceIdx = input.indexOf(' ');
            String fname = input.substring(0, spaceIdx);
            String lname = input.substring(spaceIdx + 1); 

            // Create a student
            Student student = new Student(fname, lname);
            // Add student to system
            VanierSchoolSystem.addStudent(student);
        }
        catch (StringIndexOutOfBoundsException e) {
            addMsgL.setForeground(Color.RED);
            addMsgL.setText("Adding student failed");
        }
        addMsgL.setForeground(Color.GREEN);
        addMsgL.setText("Student successfully added");
        setVisibility();
    }
    
    /**
     * When the display button is pressed, it would display information
     * relating to the radio button selected.
     * @param evt the event
     */
    private void displayBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBActionPerformed
        addMsgL.setText("");
        String str = "";
        // STUDENT DISPLAY
        if (studentRB.isSelected()) {
            str += String.format("%s\n\n", "STUDENTS"); 
            for (User user : VanierSchoolSystem.users) {
                if (user.userId.charAt(0) == 's' || user.userId.charAt(0) == 'S') {
                    str += String.format("%s : %s\n", "ID", user.userId);
                    str += String.format("%s : %s %s\n", "Name", user.fname, user.lname);
                    str += String.format("\t%s :\n", "Registered Courses");
                    for (Course course : ((Student)user).getRegCourses()) {
                        str += String.format("\t%s\n", course.getCourseName());
                    }
                }
            } 
            displayWindowTA.setText(str); 
        }
        
        // TEACHER DISPLAY
        if (teacherRB.isSelected()) {
            str += String.format("%s\n\n", "TEACHERS");
            // Each Vanier Teacher
            for (Teacher teacher : VanierSchoolSystem.teachers) {
                str += String.format("%s\n", teacher);
            }
            displayWindowTA.setText(str); 
        }

        //COURSE DISPLAY
        if (courseRB.isSelected()) {
            str += String.format("%s\n\n", "COURSES");
            for (Course course : VanierSchoolSystem.courses) {
                str += String.format("%-25s : %s\n", "Course", course.getCourseName());
                str += String.format( "%-25s : %s %s\n", "Teacher", course.getTeacher().fname,
                        course.getTeacher().lname);
                str += String.format( "%-22s : %s\n", "Max Student", course.getMaxStudent());
                str += String.format("\n%s :\n", "Course Students");
                for (Student regStudent : course.getRegsStudents()) {
                    str += String.format("%-25s :  %s\n", "ID", regStudent.userId);
                    str += String.format("%-20s : %s %s\n", "Name", 
                            regStudent.fname, regStudent.lname);
                    str += "\n\n";
                }
            }
            displayWindowTA.setText(str);
        }
    }//GEN-LAST:event_displayBActionPerformed

    /**
     * When the student radio button is clicked, the information would be removed
     * by calling the cleanInfor() method
     * @param evt the event
     */
    private void studentRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRBActionPerformed
        setVisibility();
        cleanInfor();
    }//GEN-LAST:event_studentRBActionPerformed

    /**
     * When the teacher radio button is clicked, the previous information would
     * be removed.
     * @param evt the event
     */
    private void teacherRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherRBActionPerformed
        setVisibility();
        cleanInfor();
    }//GEN-LAST:event_teacherRBActionPerformed

    /**
     * When the course radio button is clicked, the previous information would
     * be removed
     * @param evt the event
     */
    private void courseRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseRBActionPerformed
        if (courseRB.isSelected() && nameTF.isFocusable() && nameTF.getText().length() == 0)
            cleanInfor();
        
        setVisibility();
        cleanInfor();
    }//GEN-LAST:event_courseRBActionPerformed

    /**
     * Allows ENTER key to add teacher, course, student instead of clicking 
     * the ADD button
     * @param evt the event 
     */
    private void nameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (studentRB.isSelected() || teacherRB.isSelected())
                addElement();
            
            if (courseRB.isSelected()) {
                if (nameTF.getText().length() != 0 && teacherTF.getText().length() != 0)
                    addElement();
            }   
        }
    }//GEN-LAST:event_nameTFKeyReleased

    /**
     * When the logout button is used, a new loginFrame will be opened while
     * disposing the current frame
     * @param evt the event
     */
    private void logOutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutBActionPerformed

    /**
     * Removes information
     */
    public void cleanInfor(){
        nameTF.setText("");
        teacherTF.setText("");
        displayWindowTA.setText("");
        addMsgL.setText("");
    }

    /**
     * Edits the visibility of the teacher label and text field 
     * depending on the radio button picked.
     */
    public void setVisibility() {
        if (teacherRB.isSelected() || studentRB.isSelected()) {
            teacherTF.setVisible(false);
            teacherL.setVisible(false);
        }
        if (courseRB.isSelected()) {
            teacherL.setVisible(true);
            teacherTF.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addB;
    private javax.swing.JLabel addElementsL;
    private javax.swing.JLabel addMsgL;
    private javax.swing.JPanel choiceP;
    private javax.swing.JRadioButton courseRB;
    private javax.swing.JButton displayB;
    private javax.swing.JLabel displayWindowL;
    private javax.swing.JTextArea displayWindowTA;
    private javax.swing.JLabel imgL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutB;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JRadioButton studentRB;
    private javax.swing.JLabel teacherL;
    private javax.swing.JRadioButton teacherRB;
    private javax.swing.JTextField teacherTF;
    private javax.swing.ButtonGroup typeBG;
    private javax.swing.JLabel welcomeL;
    // End of variables declaration//GEN-END:variables
}
