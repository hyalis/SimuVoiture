package applicationSimulateur;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class DessinVoiture extends JFrame implements KeyListener{

	public static final int TailleFenetreEnPixels = 500;
	
	private int xPixelVoiture;
	private int yPixelVoiture;
	private int angleEnDegre;

	public DessinVoiture() {
		super();
		this.setTitle("Simulateur de Voiture");
		this.setSize(TailleFenetreEnPixels, TailleFenetreEnPixels);
		this.setResizable(false);
		this.setVisible(true);
		this.xPixelVoiture = 0;
		this.yPixelVoiture = 0;
		this.angleEnDegre = 0;
		this.addKeyListener(this);
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		dessinerVoiture(this.xPixelVoiture, this.yPixelVoiture, graphics);

	}

	public void setyPixelVoiture(int yPixelVoiture) {
		this.yPixelVoiture = yPixelVoiture;
	}

	public void dessinerVoiture(int xPixelVoiture, int yPixelVoiture, Graphics graphics) {
		graphics.fillRect(xPixelVoiture, yPixelVoiture, 40, 20);

	}

	public void setXPixelVoiture(int xPixelVoiture) {
		this.xPixelVoiture = xPixelVoiture;
	}
	
	public void keyPressed(KeyEvent event) {
		switch(event.getKeyCode()){
			case 37: this.angleEnDegre = 180;
				break;
			case 38: this.angleEnDegre = 270;
				break;
			case 39: this.angleEnDegre = 0;
				break;
			case 40: this.angleEnDegre = 90;
				break;
		}
	}

	public int getAngleEnDegre() {
		return angleEnDegre;
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		//Rien à faire
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//Rien à faire
	}

}
