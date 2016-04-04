/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examservice;
/**
 * This class is 'an entry' of a CSV file line, it has all fields necessary to create an object with all the available information from one line of a CSV file
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
    
    /**
     *The constructor is created in the order that the CSV file is expected to be
     * @param department
     * @param course
     * @param section
     * @param date
     * @param time
     * @param duration
     * @param building
     * @param roomNum
     * @param firstRow
     * @param lastRow
     * @param studentCount
     * @param firstStudent
     * @param lastStudent
     */
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

    /**
     *Returns the course of this DataEntry line
     * @return String
     */
    public String getCourse() {
        return course;
    }

    /**
     *Returns the date of this DataEntry line
     * @return String
     */
    public String getDate() {
        return date;
    }

    /**
     *Returns the location of this DataEntry line
     * @return String
     */
    public String getLocation() {
        return building;
    }

    /**
     *Returns the room number of this DataEntry line
     * @return int 
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     *Returns the section of this DataEntry line
     * @return String
     */
    public String getSection() {
        return section;
    }

    /**
     *Returns the time of this DataEntry line
     * @return String
     */
    public String getTime() {
        return time;
    }
    
    
}