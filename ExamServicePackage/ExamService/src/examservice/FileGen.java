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
        File output = new File("aaron is gay.txt");
        if (!output.exists()) {
	     output.createNewFile();
	  }
        FileWriter fw = new FileWriter(output);
        BufferedWriter b = new BufferedWriter(fw);
        b.write("3============================D");
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

