/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carletonexamsupport;

/**
 *
 * @author aaronhill2
 */
public class DataEntry {
    
    String department;
    String course;
    String section;
    String date;
    Enum   time;
    float  duration;
    String location;
    int    firstRow;
    int    lastRow;
    int    studentCount;
    int    firstStudent;
    int    lastStudent;
    
    public DataEntry(String department,
                String course,
                String section,
                String date,
                Enum   time,
                float  duration,
                String location,
                int    firstRow,
                int    lastRow,
                int    studentCount,
                int    firstStudent,
                int    lastStudent) {
            
        this.department = department;
        this.course = course;
        this.section = section;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.location = location;
        this.firstRow = firstRow;
        this.lastRow = lastRow;
        this.studentCount = studentCount;
        this.firstStudent = firstStudent;
        this.lastStudent = lastStudent;
    }
}
