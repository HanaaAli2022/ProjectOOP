/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classjamp;

/**
 *
 * @author CoNNect
 */
public class Lecture {
    private String name;
    private String discription;
    private String fileName;

    public Lecture(String lectureName, String discription, String fileName) {
        this.name = lectureName;
        this.discription = discription;
        this.fileName = fileName;
    }
   
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String lectureName) {
        this.name = lectureName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
    
    
    
}
