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
		voiture.avancerEnFonctionDeLaVitesse();
		assertEquals(120, voiture.getCoordXEnMetres());
	}

	
}
