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
public class Sheet {
       private String number;
       private String discription;
       private String fileName;

    public Sheet(String sheetNumbers, String discription, String fileName) {
        this.number = sheetNumbers;
        this.discription = discription;
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getNumbers() {
        return number;
    }

    public void setNumbers(String sheetNumbers) {
        this.number = sheetNumbers;
    }

    public String getDescription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
       
       
}
