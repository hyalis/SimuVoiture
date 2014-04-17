package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import domaineConduite.Voiture;



public class TestVoiture {
	
	@Test
	public void testGetX(){
		Voiture voiture = new Voiture(20,20) ;
		
		int xVoiture = voiture.getCoordXEnMetres() ;
		
		assertEquals(20, xVoiture);
		
	}
	
	@Test
	public void testGetY(){
		Voiture voiture = new Voiture(20,20) ;
		
		int yVoiture = voiture.getCoordYEnMetres() ;
		
		assertEquals(20, yVoiture);
		
	}
	
	@Test
	public void testVitesse() {
		Voiture voiture = new Voiture(20,20,150);
		
		assertEquals(150,voiture.getVitesseMetreParSecondes());
	}
	
	@Test
	public void testAngle(){
		Voiture voiture = new Voiture(20,20,150);
		assertEquals(90,voiture.getAngleEnDegre());
	}
	
	@Test
	public void testMiseAjourPositionEnFonctionVitesse() {
		Voiture voiture = new Voiture(20,20,100);
		voiture.avancerEnFonctionDeLaVitesseEtDeLAngle();
		assertEquals(20, voiture.getCoordXEnMetres());
	}
	
	@Test
	public void testAvancerEnFonctionDeLaVitesseDansLeMurADroiteAvecX() {
		Voiture voiture = new Voiture(901,30,100);
		voiture.setAngleEnDegre(0);
		voiture.avancerEnFonctionDeLaVitesseEtDeLAngle();
		assertEquals(30, voiture.getCoordYEnMetres());
		assertEquals(0, voiture.getCoordXEnMetres());
	}
	
	@Test
	public void testAvancerEnFonctionDeLaVitesseDansLeMurAGaucheAvecX() {
		Voiture voiture = new Voiture(0,50,100);
		voiture.setAngleEnDegre(180);
		voiture.avancerEnFonctionDeLaVitesseEtDeLAngle();
		assertEquals(50, voiture.getCoordYEnMetres());
		assertEquals(1000, voiture.getCoordXEnMetres());
	}
	
	@Test
	public void testAvancerEnFonctionDeLaVitesseDansLeMurEnBasAvecY() {
		Voiture voiture = new Voiture(50,999,100);
		voiture.setAngleEnDegre(90);
		voiture.avancerEnFonctionDeLaVitesseEtDeLAngle();
		assertEquals(0, voiture.getCoordYEnMetres());
		assertEquals(50, voiture.getCoordXEnMetres());
	}
	
	@Test
	public void testAvancerEnFonctionDeLaVitesseDansLeMurEnHautAvecY() {
		Voiture voiture = new Voiture(50,1,100);
		voiture.setAngleEnDegre(-90);
		voiture.avancerEnFonctionDeLaVitesseEtDeLAngle();
		assertEquals(1000, voiture.getCoordYEnMetres());
		assertEquals(50, voiture.getCoordXEnMetres());
	}
	
	@Test
	public void testAvancerEnFonctionDeLaVitesseEtDeLAngle(){
		Voiture voiture = new Voiture(20,50,100);
		voiture.setAngleEnDegre(45);
		voiture.avancerEnFonctionDeLaVitesseEtDeLAngle();
		assertEquals(90, voiture.getCoordXEnMetres());
		assertEquals(120, voiture.getCoordYEnMetres());
	}

	
}
