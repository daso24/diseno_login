package diseno_login;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class interfazg extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		
		// cielo
		g.setColor(new Color(135, 206, 235)); 
		g.fillRect(0, 0, 700, 400);
		
		// piso 
		g.setColor(new Color(34, 139, 34)); 
		g.fillRect(0, 400, 700, 300);
		
		// pared
		g.setColor(Color.ORANGE); 
		g.fillRect(250, 250, 200, 200); 
		g.drawRect(250, 250, 200, 200); 
		
		// techo
		g.setColor(Color.RED);
		int[] xTecho = {250, 350, 450}; 
		int[] yTecho = {250, 150, 250}; 
		g.fillPolygon(xTecho, yTecho, 3);
		g.drawLine(250, 250, 350, 150);
		g.drawLine(350, 150, 450, 250);
		
		// puerta
		g.setColor(new Color(139, 69, 19));
		g.fillRect(325, 350, 50, 100);
		g.drawRect(325, 350, 50, 100);
		
		// ventanas
		g.setColor(Color.CYAN);
		g.fillRect(270, 280, 40, 40);
		g.fillRect(390, 280, 40, 40);
		g.drawRect(270, 280, 40, 40);
		g.drawRect(390, 280, 40, 40);
		
		g.setColor(new Color(160, 82, 45));
		
		// dos lneas horizontales
		g.fillRect(0, 400, 700, 15); 
		g.fillRect(0, 420, 700, 15);
		
		// lineas verticales
		for (int i = 20; i < 700; i += 30) {
			g.fillRect(i, 380, 20, 100); 
			g.setColor(Color.BLACK); 
			g.drawRect(i, 380, 20, 100); 
			g.setColor(new Color(160, 82, 45));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame prueba = new JFrame("intro a graficos");
		interfazg objeto = new interfazg();
		prueba.add(objeto);
		prueba.setSize(700,700);
		prueba.setLocationRelativeTo(null);
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
