/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examservice;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * @author ihtishammazhar
 */
public class CSVParser {
    
    File file;
    public CSVParser(File csv){
        this.file = csv;
    }
    
    public ExamDB getDB() throws FileNotFoundException{
        Scanner scan = new Scanner(file);
        ArrayList<DataEntry> dataList = new ArrayList<>();
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            Scanner lineScan = new Scanner(line);
            DataEntry d = getEntry(lineScan);
            dataList.add(d);
           }
        return new ExamDB(dataList);
        }
    
    
    public DataEntry getEntry(Scanner lineScan){
        
        lineScan.useDelimiter(",");
        String arr[] = new String[13];
        for(int i = 0; lineScan.hasNext(); i++){
            arr[i] = lineScan.next();
          }
        
        return new DataEntry(arr[0],arr[1],arr[2],arr[3],arr[4],Float.parseFloat(arr[5]),arr[6],Integer.parseInt(arr[7]),Integer.parseInt(arr[8]),Integer.parseInt(arr[9]),Integer.parseInt(arr[10]),Integer.parseInt(arr[11]),Integer.parseInt(arr[12]));
    }
    
}
