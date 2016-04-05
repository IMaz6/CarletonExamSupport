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

    ExamDB db;
    
    public FileGen(ExamDB db){
        this.db = db;
}
    public void getMasterSeatingPlan(){
        try{
        File output = new File("MasterSeatingPlan.txt");
        if (!output.exists()) {
	     output.createNewFile();
	  }
        FileWriter fw = new FileWriter(output);
        BufferedWriter b = new BufferedWriter(fw);
        List<DataEntry> de = db.getList();
        b.write(getSpace(10) + "Master Seating Plan");
        b.newLine();
        for(DataEntry e : de){
            b.write(e.getCourse() + getSpace(3) + e.getSection() + getSpace(3) + e.getDate() + getSpace(7) + e.getTime() + getSpace(4) + e.getLocation() + getSpace(6) + e.getRoomNum() + getSpace(5) + e.getRows() + e.getStudent());
            b.newLine();
        }
        b.close();
        }
        catch(IOException e){}
    
    }
    
    public void getSeatingPlan(){
        try{
        File output = new File("SeatingPlan.txt");
        if (!output.exists()) {
	     output.createNewFile();
	  }
        FileWriter fw = new FileWriter(output);
        BufferedWriter b = new BufferedWriter(fw);
        List<DataEntry> de = db.getList();
        b.write(getSpace(10) + "Seating Plan");
        b.newLine();
        for(DataEntry e : de){
            b.write(e.getCourse() + getSpace(3) + e.getSection() + getSpace(3) + e.getDate() + getSpace(7) + e.getTime() + getSpace(4) + e.getLocation());
            b.newLine();
        }
        b.close();
        }
        catch(IOException e){}
    }
    
    public void getExamSignInSheet(){
        try{
        File output = new File("ExamSignInSheet.txt");
        if (!output.exists()) {
	     output.createNewFile();
	  }
        FileWriter fw = new FileWriter(output);
        BufferedWriter b = new BufferedWriter(fw);
        List<DataEntry> de = db.getList();
        b.write(getSpace(10) + "Exam Sign in Sheet");
        b.newLine();
        b.newLine();
        b.write("Name" + getSpace(25) + "Student Number" + getSpace(25) + "Signature");
        b.close();
        }
        catch(IOException e){}
    }
    
    public void getEnvelope(){
        try{
        File output = new File("Envelope.txt");
        if (!output.exists()) {
	     output.createNewFile();
	  }
        FileWriter fw = new FileWriter(output);
        BufferedWriter b = new BufferedWriter(fw);
        List<DataEntry> de = db.getList();
     
        for(DataEntry e : de){
            b.write(e.getCourse() + getSpace(3) + e.getSection() + getSpace(3) + e.getTime() + getSpace(4));
            b.newLine();
            b.write(e.getLocation() + getSpace(3) + e.getDate());
            b.newLine();
            b.newLine();
        }
        b.close();
        }
        catch(IOException e){}
        
    }
    
    public String getSpace(int n){
        String s = "";
        for(int i=0; i < n; i++){
            s += " ";
        }
        return s;
    }
    
    }

