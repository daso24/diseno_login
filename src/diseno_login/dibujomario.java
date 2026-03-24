package diseno_login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class dibujomario extends JPanel {
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		// cielo
		g.setColor(new Color(135, 206, 235));
		g.fillRect(0, 0, 800, 600);

		// arbusto de la izquierda
		g.setColor(new Color(34, 139, 34));
		g.fillOval(40, 450, 60, 60);
		g.fillOval(80, 430, 70, 80);
		g.fillOval(130, 450, 60, 60);

		// bloque azul
		// sombra negra
		g.setColor(Color.BLACK);
		g.fillRect(365, 260, 140, 240);
		
		// bloque principal
		g.setColor(new Color(100, 170, 255)); 
		g.fillRect(340, 250, 140,250);
		g.setColor(Color.BLACK);
		g.drawRect(340, 250, 140, 250);
		
		// tornillos del bloque azul
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(345, 255, 12, 12); g.setColor(Color.BLACK); g.drawOval(345, 255, 12, 12);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(463, 255, 12, 12); g.setColor(Color.BLACK); g.drawOval(463, 255, 12, 12);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(345, 483, 12, 12); g.setColor(Color.BLACK); g.drawOval(345, 483, 12, 12);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(463, 483, 12, 12); g.setColor(Color.BLACK); g.drawOval(463, 483, 12, 12);

		// bloque rosa
		// sombra negra
		g.setColor(Color.BLACK);
		g.fillRect(215,360, 140, 140);
		
		// bloque principal
		g.setColor(new Color(255, 180, 170));
		g.fillRect(190, 350, 140, 150);
		g.setColor(Color.BLACK);
		g.drawRect(190, 350, 140, 150);
		
		// tornillos del bloque rosa
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(195, 355, 12, 12); g.setColor(Color.BLACK); g.drawOval(195, 355, 12, 12);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(313, 355, 12, 12); g.setColor(Color.BLACK); g.drawOval(313, 355, 12, 12);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(195, 483, 12, 12); g.setColor(Color.BLACK); g.drawOval(195, 483, 12, 12);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(313, 483, 12, 12); g.setColor(Color.BLACK); g.drawOval(313, 483, 12, 12);

		// tuberia verde
		g.setColor(new Color(0, 180, 0));
		g.fillRect(570, 410, 70, 90); 
		g.setColor(Color.BLACK);
		g.drawRect(570, 410, 70, 90);
		
		// borde superior de la tuberia
		g.setColor(new Color(0, 180, 0));
		g.fillRect(560, 380, 90, 30);
		g.setColor(Color.BLACK);
		g.drawRect(560,380, 90, 30);
		
		// brillos de la tuberia
		g.setColor(new Color(100, 255, 100));
		g.fillRect(570, 382, 10, 26);
		g.fillRect(580, 412,10, 88);

		// bloque verde de la derecha
		g.setColor(new Color(0, 200, 50));
		g.fillRect(720, 380, 80, 120);
		g.setColor(Color.BLACK);
		g.drawRect(720, 380, 80,120);
		
		// tornillos
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(725,385, 12, 12); g.setColor(Color.BLACK); g.drawOval(725, 385, 12, 12);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(725, 483, 12, 12); g.setColor(Color.BLACK); g.drawOval(725, 483, 12, 12);

		// bloques flotantes
		g.setColor(new Color(240, 130, 50));
		
		// bloque izquierdo
		g.fillRect(100, 220, 40, 40); 
		g.setColor(Color.BLACK); g.drawRect(100, 220, 40, 40);
		g.fillOval(103, 223, 4, 4); g.fillOval(133, 223, 4, 4); // Detalles esquinas
		
		// bloques arriba
		g.setColor(new Color(240, 130, 50));
		g.fillRect(200, 100, 40, 40); 
		g.setColor(Color.BLACK); g.drawRect(200, 100, 40, 40);
		
		g.setColor(new Color(240, 130, 50));
		g.fillRect(240, 100, 40, 40); 
		g.setColor(Color.BLACK); g.drawRect(240, 100, 40, 40);
		
		// bloque derecho
		g.setColor(new Color(240, 130, 50));
		g.fillRect(630,200, 40, 40); 
		g.setColor(Color.BLACK); g.drawRect(630, 200, 40, 40);

		// suelo
		g.setColor(new Color(200, 110, 60)); 
		g.fillRect(0, 500, 800, 100);
		
		// borde superior del piso
		g.setColor(Color.BLACK);
		g.fillRect(0, 500, 800, 4);
		
		// lineas para simular ladrillos
		g.setColor(new Color(130, 60, 20));
		g.fillRect(0, 520, 800, 4);
		g.fillRect(0, 550, 800, 4);
		g.fillRect(0, 580, 800, 4);
		
		g.fillRect(40, 500, 4, 100);
		g.fillRect(120, 500, 4, 100);
		g.fillRect(200,500, 4, 100);
		g.fillRect(280, 500, 4, 100);
		g.fillRect(360, 500, 4, 100);
		g.fillRect(440, 500, 4, 100);
		g.fillRect(520,500, 4, 100);
		g.fillRect(600, 500, 4, 100);
		g.fillRect(680, 500, 4,100);
		g.fillRect(760, 500, 4, 100);
	}

	public static void main(String[] args) {
		JFrame prueba = new JFrame("Escena de Mario Bros");
		dibujomario objeto = new dibujomario();
		
		prueba.add(objeto);
		prueba.setSize(800, 600); 
		prueba.setLocationRelativeTo(null);
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.setVisible(true);
	}
}
