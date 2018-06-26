/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;


import Dao.AlumnoDao;
import Modelo.Alumno;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        AlumnoDao ad = new AlumnoDao();

    public Gui() {
        super("Inventario");
        setLayout(null);
        setSize(600,600);
        Container container = getContentPane();
        
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        txt4 = new JTextField();
        
        lbl1 = new JLabel("N Inscripcion");
        lbl2 = new JLabel("Nombre");
        lbl3 = new JLabel("Edad");
        lbl4 = new JLabel("Propietario");
        
        btn1 = new JButton("Buscar");
        btn2 = new JButton("Insertar");
        btn3 = new JButton("Actualizar");
        btn4 = new JButton("Eliminar");
        
        container.add(lbl1);
        container.add(lbl2);
        container.add(lbl3);
        container.add(lbl4);
        container.add(txt1);
        container.add(txt2);
        container.add(txt3);
        container.add(txt4);
        container.add(btn1);
        container.add(btn2);
        container.add(btn3);
        container.add(btn4);
        
        
        lbl1.setBounds(10, 10, 10, 10);
        txt1.setBounds(25, 10, 25, 25);
        
        lbl2.setBounds(10, 25, 10, 10);
        txt2.setBounds(25, 25, 25, 25);
        lbl4.setBounds(75, 25, 10, 10);
        txt3.setBounds(100, 25, 25, 25);
        
        lbl3.setBounds(10, 50, 10, 10);
        txt4.setBounds(25, 50, 25, 25);
        System.out.println("");
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumno a = ad.readByCartnet(txt1.getText());
                
               }
            
        });
        
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumno a = new Alumno();
                ad.insert(a);
                
               }
            
        });
        
        
        
    }
        
    
        
        
        


    
    public static void main(String[] args){
        Gui gui = new Gui();
    }
    
}
