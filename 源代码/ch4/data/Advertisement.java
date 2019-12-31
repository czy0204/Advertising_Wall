package ch4.data; 
import java.io.File;
import java.awt.Image;
public class Advertisement {
    String ID;         
    String content;   
    File pictureFile; 
    Image image;      
    String serialNumber;
    public void setID(String id){
       ID = id;
    }
    public String getID(){
       return ID;
    }
    public void setImage(Image image){
       this.image = image;
    }
    public Image getImage(){
       return image;
    }
    public void setContent(String s) {
       content = s;
    }
    public void setPictureFile(File file) {
       pictureFile = file;
    }
    public String getContent() {
       return content;
    }
    public File getPictureFile() {
       return pictureFile;
    }
    public void setSerialNumber(String serialNumber){
       this.serialNumber = serialNumber;
    }
    public String getSerialNumber(){
       return serialNumber;
    }
}