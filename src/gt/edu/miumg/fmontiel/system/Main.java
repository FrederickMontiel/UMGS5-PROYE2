/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gt.edu.miumg.fmontiel.system;

import gt.edu.miumg.fmontiel.controllers.OrtogonalMatrix;
import gt.edu.miumg.fmontiel.models.Vehicle;
import gt.edu.miumg.fmontiel.views.MainView;

/**
 *
 * @author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        /*OrtogonalMatrix matrix = new OrtogonalMatrix();

        matrix.insert(0, 0, new Vehicle("P123ABC", "Red", "Sedan", "2020", "Luis"));
        matrix.insert(0, 1, new Vehicle("P321DEF", "Blue", "Pickup", "2018", "Carlos"));

        System.out.println("Search: " + matrix.search("Pickup"));
        matrix.display();

        matrix.delete("P123ABC");
        System.out.println("After deletion:");
        matrix.display();*/
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainView view = new MainView();
            view.setLocationRelativeTo(null); // Centrar ventana
            view.setVisible(true);
        });
    }
    
}
