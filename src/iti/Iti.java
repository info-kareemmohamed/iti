/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iti;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac20
 */
public class Iti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mouse();
    }

    public static void mouse() {

        Robot r;
        try {
            r = new Robot();

            r.delay(300);//time

            for (int i = 0; i < 10000; i++) {

                //   r.mouseMove(1328, 673); //set location mouse
                
                r.mousePress(MouseEvent.BUTTON1_MASK);
                r.mouseRelease(MouseEvent.BUTTON1_MASK);
               
                r.delay(300);//time

            }
        } catch (AWTException ex) {
            Logger.getLogger(Iti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
