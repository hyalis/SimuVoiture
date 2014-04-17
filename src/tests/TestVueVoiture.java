package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domaineConduite.Voiture;

import applicationSimulateur.DessinVoiture;
import applicationSimulateur.VueVoiture;



public class TestVueVoiture {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testTransformationMetrePixels(){
		
		VueVoiture triangle = new VueVoiture();
		
		assertEquals(400, triangle.transformerMetrePixel(800));	
		assertEquals(100, triangle.transformerMetrePixel(201));	
		assertEquals(50, triangle.transformerMetrePixel(100));
	}
	
	@Test
	public void testConstructeurAvecVoiture(){
		VueVoiture triangle = new VueVoiture(new Voiture(0,0));
		
		assertNotNull(triangle);
	}
	
	@Test
	public void testConstructeurAvecVoitureEtDessinVoiture(){
		VueVoiture triangle = new VueVoiture(new Voiture(0,0), new DessinVoiture());
		
		assertNotNull(triangle);
	}
	
	@Test
	public void testUpdate(){
		Voiture voiture = new Voiture(0,0);
		VueVoiture triangle = new VueVoiture(voiture, new DessinVoiture());
		triangle.update(voiture, new Object());
		
		assertEquals(90, voiture.getAngleEnDegre());
	}
	

}
