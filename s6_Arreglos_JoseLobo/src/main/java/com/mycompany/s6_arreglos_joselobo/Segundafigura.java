package com.mycompany.s6_arreglos_joselobo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author JoseLobo
 */
public class Segundafigura extends JPanel {
    static Random random = new Random();

    public Segundafigura() {
        setBackground(Color.BLACK);
    }//backgroutn

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillArc(300, 300, 150, 150, 0, 180);
        g.setColor(Color.white);
        g.fillArc(300, 300, 150, 150, 180, 180);
        g.setColor(Color.BLACK);
        g.fillOval(355, 355, 35, 35);
        g.setColor(Color.white);
        g.drawOval(354, 354, 36, 36);
    }

    public static void main(String[] args) {

        JFrame ventana = new JFrame("pokemon");
        Figuras objecto = new Figuras();
        ventana.add(objecto);
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//figura definir
}//general