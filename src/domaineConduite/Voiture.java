package domaineConduite;

import java.util.Observable;

public class Voiture extends Observable {

	private int coordXEnMetres;
	private int coordYEnMetres;
	private int vitesseMetreParSecondes;
	private int angleEnDegre;

	public static final int largeurDomaine = 1000;

	public Voiture(int coordXEnMetres, int coordYEnMetres) {
		this.coordXEnMetres = coordXEnMetres;
		this.coordYEnMetres = coordYEnMetres;
		this.vitesseMetreParSecondes = 0;
		this.angleEnDegre = 90;
	}

	public Voiture(int coordXEnMetres, int coordYEnMetres, int vitesseMetreParSecondes) {
		this.coordXEnMetres = coordXEnMetres;
		this.coordYEnMetres = coordYEnMetres;
		this.vitesseMetreParSecondes = vitesseMetreParSecondes;
		this.angleEnDegre = 90;
	}

	public int getCoordXEnMetres() {
		return coordXEnMetres;
	}

	public int getCoordYEnMetres() {
		return coordYEnMetres;
	}

	public int getVitesseMetreParSecondes() {
		return vitesseMetreParSecondes;
	}

	public void avancerEnFonctionDeLaVitesseEtDeLAngle() {
		double angleEnRadian = Math.toRadians(angleEnDegre);

		double coefficientDirecteurSurX = Math.cos(angleEnRadian);
		double coefficientDirecteurSurY = Math.sin(angleEnRadian);

		coordXEnMetres += coefficientDirecteurSurX*vitesseMetreParSecondes;
		coordYEnMetres += coefficientDirecteurSurY*vitesseMetreParSecondes;

		if(coordXEnMetres > largeurDomaine)
		{
			coordXEnMetres = 0;
		} else if (coordXEnMetres < 0){
			coordXEnMetres = largeurDomaine;
		}

		if(coordYEnMetres > largeurDomaine)
		{
			coordYEnMetres = 0;
		} else if (coordYEnMetres < 0) {
			coordYEnMetres = largeurDomaine;
		}

		notificationObservateurs();
	}

	public void setAngleEnDegre(int angleEnDegre) {
		this.angleEnDegre = angleEnDegre;
	}

	private void notificationObservateurs() {
		this.setChanged();
		this.notifyObservers();
	}

	public int getAngleEnDegre() {
		return angleEnDegre;
	}
}
