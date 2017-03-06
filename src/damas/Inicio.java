/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damas;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author cris_
 */

public class Inicio {
    
    
    static Queue<JButton> cola = new LinkedList();
    static JButton [][] tablero = new JButton[8][8];
    
    public static void main(String args[]){
         System.out.print("MMMMMM");
        Damas ventana = new Damas();
        ventana.setVisible(true);
        JOptionPane.showMessageDialog(null, "Fichas blancas inician primiero");
          System.out.print("MMMMMM");
        ventana.iniciarTablero(tablero);
        cola = ventana.bloquearTablero(tablero, cola);
        ventana.comprobarFichasMovimiento(cola);
        System.out.print("MMMMMM");
        
    }
    
}
