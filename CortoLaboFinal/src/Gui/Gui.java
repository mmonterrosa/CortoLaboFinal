/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Gui extends JFrame{
    JTextField txt1,txt2, txt3, txt4;
        JLabel lbl1,lbl2,lbl3,lbl4;
        JButton btn1,btn2,btn3,btn4,btn5;

    public Gui() {
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        txt4 = new JTextField();
        
        lbl1 = new JLabel("N Inscripcion");
        lbl2 = new JLabel("Nombre");
        lbl3 = new JLabel("Edad");
        lbl1 = new JLabel("Propietario");
        
        btn1 = new JButton("Buscar");
        btn1 = new JButton("Insertar");
        btn1 = new JButton("Actualizar");
        btn1 = new JButton("Eliminar");
    }
        
    
        
        
        


    
    public static void main(String[] args){
        Gui gui = new Gui();
    }
    
}
