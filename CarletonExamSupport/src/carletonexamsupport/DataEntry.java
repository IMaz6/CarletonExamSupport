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
    String   time;
    float  duration;
    String building;
    int    roomNum;
    int    firstRow;
    int    lastRow;
    int    studentCount;
    int    firstStudent;
    int    lastStudent;
    
    public DataEntry(String department,
                String course,
                String section,
                String date,
                String   time,
                float  duration,
                String building,
                int    roomNum,
                int    firstRow,
                int    lastRow,
                int    studentCount,
                int    firstStudent,
                int    lastStudent) {
            
        this.department   = department;
        this.course       = course;
        this.section      = section;
        this.date         = date;
        this.time         = time;
        this.duration     = duration;
        this.building     = building;
        this.roomNum      = roomNum;
        this.firstRow     = firstRow;
        this.lastRow      = lastRow;
        this.studentCount = studentCount;
        this.firstStudent = firstStudent;
        this.lastStudent  = lastStudent;
    }

    public String getCourse() {
        return course;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return building;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public String getSection() {
        return section;
    }

    public String getTime() {
        return time;
    }
    
    
}
