package testunit;

import static org.junit.Assert.*;

import org.junit.Test;

import automat.Billetautomat;

/**
 * Date: 20/10/2015
 *
 * Project: BenytBilletautomatV3
 *
 * File: BilletautomatTest.java
 *
 * Created by: Morten Jørvad
 */

public class BilletautomatTest {

	//GIT IS: https://github.com/Mortenbaws/BilletAutomatTestunit
	
	@Test
	public void testBilletautomat() {
	}

	@Test
	public void testGetBilletpris() {
		Billetautomat b = new Billetautomat();
		assertEquals(10, b.getBilletpris());
	}

	@Test
	public void testPutMoney() {
		Billetautomat b = new Billetautomat();
		b.putMoney(200);
		assertEquals(200, b.getBalance());
	}

	@Test
	public void testGetBalance() {
		Billetautomat b = new Billetautomat();
		assertEquals(0, b.getBalance());
	}

	@Test
	public void testUdskrivBillet() {
		Billetautomat b = new Billetautomat();
		b.putMoney(b.getBilletpris());
		b.udskrivBillet();
		b.controllerLogin("1234");
		assertEquals(1, b.getAntalBilletterSolgt());
	}

	@Test
	public void testReturpenge() {
		Billetautomat b = new Billetautomat();
		b.putMoney(10);
		assertEquals(10, b.returpenge());
	}

	@Test
	public void testControllerLogin() {
		Billetautomat b = new Billetautomat();
		b.controllerLogin("1234");
		assertEquals(true, b.isController());
	}

	@Test
	public void testGetTotal() {
		Billetautomat b = new Billetautomat();
		b.putMoney(100);
		assertEquals(100, b.getTotal());
	}

	@Test
	public void testGetAntalBilletterSolgt() {
		Billetautomat b = new Billetautomat();
		b.putMoney(100);
		while(b.getBalance() >= b.getBilletpris()){
			b.udskrivBillet();
		}
		b.controllerLogin("1234");
		assertEquals(10, b.getAntalBilletterSolgt());
	}

	@Test
	public void testSetBilletpris() {
		Billetautomat b = new Billetautomat();
		b.controllerLogin("1234");
		b.setBilletpris(500);
		assertEquals(500, b.getBilletpris());
	}

	@Test
	public void testNulstil() {
		Billetautomat b = new Billetautomat();
		b.putMoney(100);
		while(b.getBalance() >= b.getBilletpris()){
			b.udskrivBillet();
		}
		b.controllerLogin("1234");
		b.nulstil();
		assertEquals(0, b.getAntalBilletterSolgt());
	}

	@Test
	public void testSetAntalBilletterSolgt() {
		Billetautomat b = new Billetautomat();
		b.controllerLogin("1234");
		b.setAntalBilletterSolgt(200);
		assertEquals(200, b.getAntalBilletterSolgt());
	}

	@Test
	public void testIsController() {
		Billetautomat b = new Billetautomat();
		b.controllerLogin("1234");
		assertEquals(true, b.isController());
	}

}
