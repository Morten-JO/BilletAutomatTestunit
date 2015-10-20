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
		fail("Not yet implemented");
	}

	@Test
	public void testUdskrivBillet() {
		fail("Not yet implemented");
	}

	@Test
	public void testReturpenge() {
		fail("Not yet implemented");
	}

	@Test
	public void testControllerLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotal() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAntalBilletterSolgt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBilletpris() {
		fail("Not yet implemented");
	}

	@Test
	public void testNulstil() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAntalBilletterSolgt() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsController() {
		fail("Not yet implemented");
	}

}
