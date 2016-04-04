/*

*/
package examservice;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *This class handles the parsing of a CSV file, The CSV file is read line by line, from which data is pulled into a DataEntry type (see class),
 *The class is meant to run by passing a file on construction, and then calling getDB to get a type ExamDB (see class). 
 * @author ihtishammazhar
 */
public class CSVParser {
    
    File file;

    /**
     *Constructor takes in a parameter of CSV file, the assurance that this is only
     * a CSV file is handled on the instantiating side
     * @param csv
     */
    public CSVParser(File csv){
        this.file = csv;
    }
    
    /**
     * This method reads line-by-line from CSV file (till end), and calls getEntry to fill up and return an ExamDB full of DataEntry
     * @return ExamDB (list of DataEntry) parsed from this CSV file
     * @throws FileNotFoundException
     */
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
    
    /**
     * This method is called to pull a DataEntry from one line of info in the CSV file
     * @param lineScan - The line being currently read from the CSV file is passed in
     * @return DataEntry - get one complete DataEntry from one line of the CSV file
     */
    public DataEntry getEntry(Scanner lineScan){
        
        lineScan.useDelimiter(",");
        String arr[] = new String[13];
        for(int i = 0; lineScan.hasNext(); i++){
            arr[i] = lineScan.next();
          }
        
        return new DataEntry(arr[0],arr[1],arr[2],arr[3],arr[4],Float.parseFloat(arr[5]),arr[6],Integer.parseInt(arr[7]),Integer.parseInt(arr[8]),Integer.parseInt(arr[9]),Integer.parseInt(arr[10]),Integer.parseInt(arr[11]),Integer.parseInt(arr[12]));
    }
    
}
