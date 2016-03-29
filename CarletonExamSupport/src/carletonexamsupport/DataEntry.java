/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carletonexamsupport;

import java.util.List;

/**
 *
 * @author dominikschmidtlein
 */
public class DataEntry {
    
    private String date;
    private String time;
    private String course;
    private String section;
    private String room;
    
    public DataEntry(String date, String time, String course, String section, String room) {
        this.date = date;
        this.course = course;
        this.time = time;
        this.section = section;
        this.room = room;
    }

    public String getCourse() {
        return course;
    }

    public String getDate() {
        return date;
    }

    public String getRoom() {
        return room;
    }

    public String getSection() {
        return section;
    }

    public String getTime() {
        return time;
    }
    
}
