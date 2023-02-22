/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classjamp;

import java.util.ArrayList;

public class ClassJamp {
    private ArrayList<Teacher> teachers;

    public ClassJamp() {
        this.teachers = new ArrayList<Teacher>();
    }

    public void registerTeacher(Teacher teacher) {
        for (Teacher t : teachers) {
            if (t.getName().equalsIgnoreCase(teacher.getName()) &&
                t.getEmail().equalsIgnoreCase(teacher.getEmail())) {
                System.out.println("Teacher already exists");
                break;
            }
        }
        this.teachers.add(teacher);
    }

    public boolean loginTeacher(String name, String email, String password) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equalsIgnoreCase(name) &&
                teacher.getEmail().equalsIgnoreCase(email) &&
                teacher.getPassWord().equals(password)) {
                return true;
            }
        }
        
        return false;
    }

    public ArrayList<Teacher> getTeachers() {
        return this.teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
}

