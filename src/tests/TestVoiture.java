package tests;

import static org.junit.Assert.*;

import org.junit.Before;
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
		assertEquals(120, voiture.getCoordXEnMetres());
	}
	
	@Test
	public void testAvancerEnFonctionDeLaVitesseDansLeMurAvecX() {
		Voiture voiture = new Voiture(901,30,100);
		voiture.avancerEnFonctionDeLaVitesseEtDeLAngle();
		assertEquals(130, voiture.getCoordYEnMetres());
		assertEquals(0, voiture.getCoordXEnMetres());
	}
	
	@Test
	public void testAvancerEnFonctionDeLaVitesseDansLeMurAvecY() {
		Voiture voiture = new Voiture(50,999,100);
		voiture.avancerEnFonctionDeLaVitesseEtDeLAngle();
		assertEquals(0, voiture.getCoordYEnMetres());
		assertEquals(150, voiture.getCoordXEnMetres());
	}

	
}
