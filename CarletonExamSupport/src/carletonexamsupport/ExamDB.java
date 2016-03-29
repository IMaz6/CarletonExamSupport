/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carletonexamsupport;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author dominikschmidtlein
 */
public class ExamDB {
    
    private final List<DataEntry> db;
    
    private Set<String> dates = new TreeSet<>();
    private Set<String> times = new TreeSet<>();
    private Set<String> courses = new TreeSet<>();
    private Set<String> sections = new TreeSet<>();
    private Set<String> location = new TreeSet<>();
    
    public ExamDB(List<DataEntry> db) {
        this.db = db;
        
        for (DataEntry entry : db) {
            dates.add(entry.getDate());
            times.add(entry.getTime());
            courses.add(entry.getCourse());
            sections.add(entry.getSection());
            location.add(entry.getLocation());
        }
    }
    
    public Set<String> getCourse() {
        return  courses;
    }

    public Set<String> getDates() {
        return dates;
    }

    public Set<String> getRooms() {
        return location;
    }

    public Set<String> getSection() {
        return sections;
    }

    public Set<String> getTimes() {
        return times;
    }
    
}

