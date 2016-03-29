/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carletonexamsupport;

/**
 *
 * @author dominikschmidtlein
 */
public class Controller implements GuiChangedListener {
    
    public static final String MASTER_SEATING_PLAN = "master seating plan";
    public static final String ENVELOPE_LABEL = "envelope label";
    public static final String EXAMINATION_SIGNING_SHEET = "examination signing sheet";
    public static final String SEATING_PLAN = "seating plan";
    
    private ExamDB examDB;

    @Override
    public void onGuiChanged(GuiChangedEvent event) {
        GUI gui = (GUI) event.getSource();
        switch(event.getTemplateType().toLowerCase()) {
            case MASTER_SEATING_PLAN:
                
                break;
            case ENVELOPE_LABEL:
                
                break;
            case EXAMINATION_SIGNING_SHEET:
                
                break;
            case SEATING_PLAN:
                
                break;
            default:
                
        }
    }
    
}
