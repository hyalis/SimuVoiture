package applicationSimulateur;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DessinVoiture extends JFrame implements KeyListener{
	final int TOUCHE_GAUCHE = 37;
	final int TOUCHE_HAUT = 38;
	final int TOUCHE_DROITE = 39;
	final int TOUCHE_BAS = 40;

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
		this.angleEnDegre = 90;
		this.addKeyListener(this);
	}

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
		int codeDeLaTouche = event.getKeyCode();
		switch(codeDeLaTouche){
			case TOUCHE_GAUCHE: this.angleEnDegre = 180;
				break;
			case TOUCHE_HAUT: this.angleEnDegre = 270;
				break;
			case TOUCHE_DROITE: this.angleEnDegre = 0;
				break;
			case TOUCHE_BAS: this.angleEnDegre = 90;
				break;
		}
	}

	public int getAngleEnDegre() {
		return angleEnDegre;
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}
}
