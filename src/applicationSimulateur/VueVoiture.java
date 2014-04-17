package applicationSimulateur;

import java.util.Observable;
import java.util.Observer;

import domaineConduite.Voiture;


public class VueVoiture implements Observer {
	
	private Voiture voiture;

	private DessinVoiture dessinDeLaVoiture;

	public VueVoiture() {
		this.voiture = null;
	}

	public VueVoiture(Voiture voiture) {
		this.voiture = voiture;
		this.voiture.addObserver(this);
	}

	public VueVoiture(Voiture voiture, DessinVoiture ihm) {
		this.voiture = voiture;
		this.voiture.addObserver(this);
		this.dessinDeLaVoiture = ihm;
	}

	public int transformerMetrePixel(int coordonneeXEnMetre) {

		int ratioDomaineFenetre = Voiture.largeurDomaine / DessinVoiture.TailleFenetreEnPixels;

		int coordonneeXEnPixels = coordonneeXEnMetre / ratioDomaineFenetre;

		return coordonneeXEnPixels;
	}

	public void update(Observable arg0, Object arg1) {

		int xVoiture = this.voiture.getCoordXEnMetres();
		int xPixelVoiture = this.transformerMetrePixel(xVoiture);
		dessinDeLaVoiture.setXPixelVoiture(xPixelVoiture);
		
		int yVoiture = this.voiture.getCoordYEnMetres();
		int yPixelVoiture = this.transformerMetrePixel(yVoiture);
		dessinDeLaVoiture.setyPixelVoiture(yPixelVoiture);
		
		this.voiture.setAngleEnDegre(dessinDeLaVoiture.getAngleEnDegre());
		
		dessinDeLaVoiture.repaint();

	}

}
