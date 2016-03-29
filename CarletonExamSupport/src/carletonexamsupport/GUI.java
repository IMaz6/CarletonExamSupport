/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carletonexamsupport;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dominikschmidtlein
 */
public class GUI {
    
    private static final String CARD1 = "1";
    private static final String CARD2 = "2";
    
    
    JFrame frame = new JFrame("Hello");
    JPanel cards = new JPanel(new CardLayout());
    
    
    public GUI() {
        frame.setSize(400, 400);
        JPanel card1 = new JPanel();
        card1.setBackground(Color.red);
        JPanel card2 = new JPanel();
        card2.setBackground(Color.BLACK);
        
        JComboBox comboBox = new JComboBox(new String[]{CARD1, CARD2});
        comboBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                CardLayout cl = (CardLayout) cards.getLayout();
                cl.show(cards, (String) e.getItem());
            }
        });
        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.add(comboBox);
        frame.add(comboBoxPanel);
        
//        cards.add(card1, CARD1);
//        cards.add(card2, CARD2);
//        frame.add(cards);
        frame.setVisible(true);
    }
    
    public void updateGUI(String field, List<String> entries) {
        
    }
    
}
