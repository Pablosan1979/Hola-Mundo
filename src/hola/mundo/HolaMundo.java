package hola.mundo;

import javax.swing.*;

public class HolaMundo  extends JFrame{
    
    private JLabel label1;
    public HolaMundo(){
        setLayout(null);
        label1=new JLabel("Hola Mundo");
        label1.setBounds(10, 20, 200, 30);
        add(label1);    
    }
     private JLabel label2;
     {
        setLayout(null);
        label2=new JLabel("<html>Bienvenido al curso de Desarrollo de Aplicaciones con Interfaz Gráfica, <p>  Manejo de Eventos, Clases y Objetos: Java<html>");
        label2.setBounds(10, 50, 500, 30);
        add(label2);    
    }
     private JLabel label3;
     {
        setLayout(null);
        label3=new JLabel("<html>Pedro Pablo Santacruz, <p>Cedula de Ciudadania xxxxxxx<html>");
        label3.setBounds(10, 90, 500, 30);
        add(label3);    
    }

    public static void main(String[] args) {
        HolaMundo formulario1 = new HolaMundo();
        formulario1.setBounds(10, 20, 500, 300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
