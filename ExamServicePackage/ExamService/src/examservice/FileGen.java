/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examservice;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
/**
 * This class handles creation of output files.
 * @author Ihtisham
 */
public class FileGen {

    List<DataEntry> db;
    
    public FileGen(List<DataEntry> db){
        this.db = db;
}
    public void getMasterSeatingPlan(String date, String time){
        try{
        File output = new File("master.csv");
        if (!output.exists()) {
	     output.createNewFile();
	  }
        FileWriter fw = new FileWriter(output);
        BufferedWriter b = new BufferedWriter(fw);
        b.write(date+" "+time+"\n");
        b.write("Course,Same As,Section,Duration,Location,Enrolled,Rows,Room,Student Number\n");
        for(DataEntry e : db){
        	if(e.getDate().equals(date) && e.getTime().equals(time)){
        		b.write(
        	 e.getCourse()+","
        	+","	//same as
        	+e.getSection()+","
        	+e.getDuration()+","
        	+e.getLocation()+","
        	+e.getStudentCount()+","
        	+e.getRow()+","
        	+e.getRoomNum()+","
        	+e.getFirstStudent()+"-"+e.getLastStudent()+"\n");
        	}
        }
        b.close();
        }
        catch(IOException e){}
    
    }
    
    public void getSeatingPlan(){
    }
    
    public void getExamSignInSheet(){
    }
    
    public void getEnvelope(){
    }
    
    public void insertSpace(int n){
    }
    
    }

