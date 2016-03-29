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
public class GuiChangedEvent {
    
    private Object source;
    
    private String templateType;
    private List<String> dates;
    private List<String> times;
    private List<String> course;
    private List<String> section;
    private List<String> rooms;
    
    
    
    public GuiChangedEvent(Object source) {
        this.source = source;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public void setSection(List<String> section) {
        this.section = section;
    }

    public void setTimes(List<String> times) {
        this.times = times;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public List<String> getCourse() {
        return course;
    }

    public List<String> getDates() {
        return dates;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public List<String> getSection() {
        return section;
    }

    public List<String> getTimes() {
        return times;
    }

    public Object getSource() {
        return source;
    }

    public String getTemplateType() {
        return templateType;
    }
    
    
    
}
