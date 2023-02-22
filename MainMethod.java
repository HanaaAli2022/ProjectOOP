/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classjamp;

import java.util.ArrayList;

/**
 *
 * @author CoNNect
 */
public class MainMethod {

    public static void main(String[] args) {
        ClassJamp ClassJamp = new ClassJamp();
        Teacher teacher1 = new Teacher("HanaaAli", "HanaaAli@gmail.com", "12345#");
        ClassJamp.registerTeacher(teacher1);
        Teacher teacher2 = new Teacher("HanaaAliMo", "HanaaAliMo@gmail.com", "12345#");
        ClassJamp.registerTeacher(teacher2);

        if ((ClassJamp.loginTeacher("HanaaAliMo", "HanaaAliMo@gmail.com", "12345#"))) {
            Course course1 = new Course("Java Fundamentals", "Learn the basics of Java programming");
            teacher1.addCourse(course1);
            Lecture lecture1 = new Lecture("Introduction to Java", " overview of Java language", "java_intro");
            course1.addLecture(lecture1);
            Sheet sheet1 = new Sheet("Java Basic Syntax", "Examples of Java syntax", "java_syntax.pdf");
            course1.addSheet(sheet1);
            System.out.println("Teacher: " + teacher1.getName());
            System.out.println("Courses:-" + course1.getName());

            System.out.println("Lectures:-"+ lecture1.getName());

            System.out.println("Sheets:-"+ sheet1.getDescription());

        } else {
            System.out.println("Login failed.");
        }
    }

}
