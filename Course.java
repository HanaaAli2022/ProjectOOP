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
public class Course {
   private String name;
   private String discription;
    private ArrayList<Lecture>Lectures;
     private ArrayList<Sheet>Sheets;

    public Course() {
    }

    public Course(String courseName, String discription) {
        this.name = courseName;
        this.discription = discription;
        this.Lectures = new ArrayList();
        this.Sheets = new ArrayList();
    }

    public Course(String courseName, String discription, ArrayList<Lecture> Lectures, ArrayList<Sheet> Sheets) {
        this.name = courseName;
        this.discription = discription;
        this.Lectures = new ArrayList();
        this.Sheets = new ArrayList();
    }
    public void addLecture(Lecture lecture){
    
     Lectures.add(lecture);
    }
     public void deleteLecture(String lecturName){
         for (Lecture lecture:Lectures) {
             if(lecture.getName().equals( lecturName)){
                 Lectures.remove(lecture);
                 break;
             
             }   
         }
     }
     public void addSheet(Sheet sheet){
    
               Sheets.add(sheet);
    }
     public void deleteSheet(String sheetNumber){
         for (Sheet sheet:Sheets) {
             if(sheet.getNumbers().equals(sheetNumber)){
                 Sheets.remove(sheet);
                 break;
             
             }   
         }
     }

   

    public ArrayList<Lecture> getLectures() {
        return Lectures;
    }

    public void setLectures(ArrayList<Lecture> Lectures) {
        this.Lectures = Lectures;
    }

    public ArrayList<Sheet> getSheets() {
        return Sheets;
    }

    public void setSheets(ArrayList<Sheet> Sheets) {
        this.Sheets = Sheets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

     
    
}
