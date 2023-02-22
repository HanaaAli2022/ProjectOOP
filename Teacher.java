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
public class Teacher {
      private  String name;
      private  String email;
      private String passWord;
      private ArrayList<Course>Courses;

   
    public Teacher(String name, String email, String passWord) {
        this.name = name;
        this.email = email;
        this.passWord = passWord;
         this.Courses = new ArrayList();
       
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public ArrayList<Course> getCourses() {
        return Courses;
    }

    public void setCourses(ArrayList<Course> Courses) {
        this.Courses = Courses;
    }
     
   public void addCourse(Course course){
              Courses.add(course);
   
   }
    public void deleteCourse(String courseName){
         for (Course course:Courses) {
             if(course.getName().equals(courseName)){
                 Courses.remove(course);
                 break;
             
             }   
         }
     }
}
