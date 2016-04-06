/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examservice;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class holds a List of DataEntries, this is the main database class, an object of this class can hold all information from a CSV file
 * @author dominikschmidtlein
 */
public class ExamDB {
    
    private final List<DataEntry> db;
    
    private Set<String> dates = new TreeSet<>();
    private Set<String> times = new TreeSet<>();
    private Set<String> courses = new TreeSet<>();
    private Set<String> sections = new TreeSet<>();
    private Set<String> location = new TreeSet<>();
    
    /**
     *The constructor takes any list of type DataEntry and stores them into a TreeSet. So that they're organized and have no duplicates
     * @param db
     */
    
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
    /**
     *Returns all the the underlying database file
     * @return 
     */
    public List<DataEntry> getList() {
        return  db;
    }
    
    /**
     *Returns all the courses in the database (all courses in a CSV file)
     * @return 
     */
    public Set<String> getCourse() {
        return  courses;
    }

    /**
     *Returns all the Dates in the database (all dates in a CSV file)
     * @return 
     */
    public Set<String> getDates() {
        return dates;
    }

    /**
     *Returns all the Rooms in the database (all the Rooms in a CSV file)
     * @return 
     */
    public Set<String> getRooms() {
        return location;
    }

    /**
     *Returns all the Sections in the database (all the Sections in a CSV file)
     * @return 
     */
    public Set<String> getSection() {
        return sections;
    }

    /**
     *Returns all the Times in the database (all the Times in a CSV file)
     * @return 
     */
    public Set<String> getTimes() {
        return times;
    }
    
}