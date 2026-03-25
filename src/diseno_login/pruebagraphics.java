package diseno_login;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class pruebagraphics extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 

        g.setColor(Color.RED);
        
        int[] puntosX = {150, 100, 200}; 
        int[] puntosY = {50, 150, 150};  
        
        g.drawPolygon(puntosX, puntosY, 3);
        g.setColor(Color.BLUE); 
        g.fillOval(250, 50, 100, 100); 
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("triangulo y circulo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1200, 700); 
        ventana.add(new pruebagraphics());
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
