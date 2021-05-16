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

/**
 * A StudentFrame class
 * @author Chilka Castro
 */
public class StudentFrame extends javax.swing.JFrame implements Serializable{
    private User user;
        
    /**
     * StudentFrame constructor with a user data member
     * @param user the user
     */
    public StudentFrame(User user) {
        initComponents();
        displayTA.setFocusable(false);
        this.user = user;
        welcomeL.setText(String.format("Welcome, %s", user.fname));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeL = new javax.swing.JLabel();
        registerCourseP = new javax.swing.JPanel();
        courseL = new javax.swing.JLabel();
        courseTF = new javax.swing.JTextField();
        courseInforB = new javax.swing.JButton();
        registerB = new javax.swing.JButton();
        msgL = new javax.swing.JLabel();
        registerCourseL = new javax.swing.JLabel();
        displayL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        displayScoreB = new javax.swing.JButton();
        logOutB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student");

        welcomeL.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        welcomeL.setForeground(new java.awt.Color(0, 0, 102));

        registerCourseP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        courseL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        courseL.setForeground(new java.awt.Color(0, 0, 0));
        courseL.setText("Course :");

        courseTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseTFActionPerformed(evt);
            }
        });
        courseTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                courseTFKeyReleased(evt);
            }
        });

        courseInforB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        courseInforB.setForeground(new java.awt.Color(0, 0, 0));
        courseInforB.setText("Check Course Infor");
        courseInforB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseInforBActionPerformed(evt);
            }
        });

        registerB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        registerB.setForeground(new java.awt.Color(0, 0, 0));
        registerB.setText("Register");
        registerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerCoursePLayout = new javax.swing.GroupLayout(registerCourseP);
        registerCourseP.setLayout(registerCoursePLayout);
        registerCoursePLayout.setHorizontalGroup(
            registerCoursePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerCoursePLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(registerCoursePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(msgL, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerB)
                    .addGroup(registerCoursePLayout.createSequentialGroup()
                        .addComponent(courseL)
                        .addGap(18, 18, 18)
                        .addGroup(registerCoursePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(courseInforB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseTF, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        registerCoursePLayout.setVerticalGroup(
            registerCoursePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerCoursePLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(registerCoursePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseL)
                    .addComponent(courseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(courseInforB)
                .addGap(18, 18, 18)
                .addComponent(registerB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(msgL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        registerCourseL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        registerCourseL.setForeground(new java.awt.Color(0, 0, 0));
        registerCourseL.setText("Register a course");

        displayL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        displayL.setForeground(new java.awt.Color(0, 0, 0));
        displayL.setText("Display");

        displayTA.setColumns(20);
        displayTA.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        displayScoreB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        displayScoreB.setForeground(new java.awt.Color(0, 0, 0));
        displayScoreB.setText("Display Score");
        displayScoreB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayScoreBActionPerformed(evt);
            }
        });

        logOutB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        logOutB.setForeground(new java.awt.Color(0, 0, 0));
        logOutB.setText("Log Out");
        logOutB.setFocusable(false);
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
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerCourseL, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerCourseP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayL)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(displayScoreB)
                            .addComponent(logOutB))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutB))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerCourseL)
                    .addComponent(displayL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerCourseP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayScoreB)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * If Check Course Infor button is clicked then it will show the course
     * name, the teacher, the max student amount, and the remaining position
     * in the text depending on what course is chosen
     * @param evt the event
     */
    private void courseInforBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseInforBActionPerformed
        checkCourseInfo();
    }//GEN-LAST:event_courseInforBActionPerformed
    
    /**
     * If the check course info button is used then it will show the 
     * information of that specific input course
     */
    public void checkCourseInfo() {
        String inputCourseName = courseTF.getText();
        boolean courseValid = false;
        
        // Checks if the input course is available at the school
        for (Course course : VanierSchoolSystem.courses) {
            // If yes, prints the information
            if (course.getCourseName().equalsIgnoreCase(inputCourseName)) {
                displayCourseInfor(course);
                courseValid = true;
                break;
            }
        }
        // If not, prints a message saying course is not available
        if (!courseValid) {
            msgL.setForeground(Color.RED);
            msgL.setText("The course does not exist");
        }
    }
    
    /**
     * Displays the course information when the check course information
     * button is used
     * @param course the course information to be displayed
     */
    public void displayCourseInfor(Course course) {
        String str = "";
        
        str += String.format("%-20s : %s\n", "Course", course.getCourseName());
        str += String.format("%-20s : %s %s\n", "Teacher", course.getTeacher().fname, 
                course.getTeacher().lname);
        str += String.format("%-20s : %d\n", "Max Students", course.getMaxStudent());
        str += String.format("%-20s : %d\n", "Remaining Position", 
                course.getMaxStudent() - course.getRegsStudents().size());
        displayTA.setText(str);
    }
    
    /**
     * If the register button is used, a student can register or not register 
     * for the specific course
     * @param evt the event
     */
    private void registerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBActionPerformed
        String inputCourseName = courseTF.getText();        
        if (user instanceof Student ) {
            int choice = ((Student)user).registerCourse(inputCourseName);

            if (choice == 1) {
                msgL.setForeground(Color.RED);
                msgL.setText("You have registered this course already.");
            }
            
            if (choice == 2) {    
                msgL.setForeground(Color.RED);
                msgL.setText("The course is already full");
            }

            if (choice == 3) {
                msgL.setForeground(Color.GREEN);
                msgL.setText("Course registered successfully");
                VanierSchoolSystem.serializeAllData();
            } 

            if (choice == 4) {
                msgL.setForeground(Color.RED);
                msgL.setText("The course does not exist");
            }
        }
    }//GEN-LAST:event_registerBActionPerformed
    
    /**
     * Displays scores when the Display Score button is used. 
     * @param evt the event
     */
    private void displayScoreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayScoreBActionPerformed
        displayScore();
    }//GEN-LAST:event_displayScoreBActionPerformed

    /**
     * Displays the score of the student user
     */
    public void displayScore() {
        String str = "";
        if (user instanceof Student) {
            Student student = (Student) user;
            for (Course course : student.getRegCourses()) {
                str += String.format("%s :", course.getCourseName());
                int idx = course.getRegsStudents().indexOf(student);
                try {
                Double grade = course.getFinalScores().get(idx);
                str += String.format("%s\n", grade);
                }
                catch (IndexOutOfBoundsException e) {
                    str += String.format("%s\n", "null");
                }
            }
        }
        displayTA.setText(str);
    }
        
    /**
     * When the logout button is used, a new login frame is created
     * and the current teacher frame will be disposed
     * @param evt the event
     */
    private void logOutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutBActionPerformed

    /**
     * When the course text field is clicked, the previous written words in the
     * text field will be removed.
     * @param evt the event
     */
    private void courseTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseTFActionPerformed
        cleanInfor();
    }//GEN-LAST:event_courseTFActionPerformed

    /**
     * When the course text field is empty, there is no visible previous information on 
     * display. But if the course
     * @param evt the event
     */
    private void courseTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_courseTFKeyReleased
        if (courseTF.isFocusable()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER && displayTA.getText().length() == 0
                    && courseTF.getText().length() > 0) {
                checkCourseInfo();
            }
            if (courseTF.getText().length() == 0) 
                cleanInfor();
        }
    }//GEN-LAST:event_courseTFKeyReleased
    
    /**
     * Cleans the text field
     */
    public void cleanInfor() {
       msgL.setText("");
       displayTA.setText("");
       courseTF.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton courseInforB;
    private javax.swing.JLabel courseL;
    private javax.swing.JTextField courseTF;
    private javax.swing.JLabel displayL;
    private javax.swing.JButton displayScoreB;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutB;
    private javax.swing.JLabel msgL;
    private javax.swing.JButton registerB;
    private javax.swing.JLabel registerCourseL;
    private javax.swing.JPanel registerCourseP;
    private javax.swing.JLabel welcomeL;
    // End of variables declaration//GEN-END:variables
}
