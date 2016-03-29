/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carletonexamsupport;

import java.util.ArrayList;

/**
 *
 * @author aaronhill2
 */
public class ExamDB {
    
    private ArrayList<DataEntry> entries;
    
    public ExamDB() {
        entries = new ArrayList<DataEntry>();
    }
    
   // public void append(Course course, Section section, Date date, Time time) {
    public void append(String course, String section, String date, String time) {
        DataEntry entry = new DataEntry(course, section, date, time);
        entries.add(entry);
    }
}