package com.mycompany.s6_arreglos_joselobo;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author JoseLobo
 */
public class Figuras extends JPanel {

    public Figuras() {
        setBackground(Color.BLACK);
    }//backgroutn

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(200, 200, 300, 300);

        g.setColor(Color.white);
        g.fillOval(300, 300, 50, 50);
        g.fillOval(250, 250,50, 50);
        g.fillOval(230, 325,50, 50);
    }

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Bola de boliche");
        Figuras objecto = new Figuras();
        ventana.add(objecto);
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//figura definir
}//general
