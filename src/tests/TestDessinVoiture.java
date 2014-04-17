package tests;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.Test;

import applicationSimulateur.DessinVoiture;

public class TestDessinVoiture {

	@Test
	public void testKeyPressedHaut() {
		DessinVoiture dessinVoiture = new DessinVoiture();
		KeyEvent toucheHaut = new KeyEvent(dessinVoiture, 0, 0, 0, 38, 'a');
		dessinVoiture.keyPressed(toucheHaut);
		assertEquals(270, dessinVoiture.getAngleEnDegre());
	}
	
	@Test
	public void testKeyPressedBas() {
		DessinVoiture dessinVoiture = new DessinVoiture();
		KeyEvent toucheBas = new KeyEvent(dessinVoiture, 0, 0, 0, 40, 'a');
		dessinVoiture.keyPressed(toucheBas);
		assertEquals(90, dessinVoiture.getAngleEnDegre());
	}
	
	
	@Test
	public void testKeyPressedDroite() {
		DessinVoiture dessinVoiture = new DessinVoiture();
		KeyEvent toucheDroite = new KeyEvent(dessinVoiture, 0, 0, 0, 39, 'a');
		dessinVoiture.keyPressed(toucheDroite);
		assertEquals(0, dessinVoiture.getAngleEnDegre());
	}
	
	@Test
	public void testKeyPressedGauche() {
		DessinVoiture dessinVoiture = new DessinVoiture();
		KeyEvent toucheGauche = new KeyEvent(dessinVoiture, 0, 0, 0, 37, 'a');
		dessinVoiture.keyPressed(toucheGauche);
		assertEquals(180, dessinVoiture.getAngleEnDegre());
	}
	
	

}
