/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author dejan
 *
 */
public class TwitterPorukaTest {
	private TwitterPoruka twitterPoruka;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		twitterPoruka = new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	twitterPoruka = null;
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		twitterPoruka.setKorisnik("dejan626");
		
		assertEquals("dejan626", twitterPoruka.getKorisnik());
	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		twitterPoruka.setKorisnik(null);
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikEmptyString() {
		twitterPoruka.setKorisnik("");
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		twitterPoruka.setPoruka("Predlog za 1. maj - Konferencija #NovaEnergija");
		assertEquals("Predlog za 1. maj - Konferencija #NovaEnergija", twitterPoruka.getPoruka());
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		twitterPoruka.setPoruka(null);	
	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaOutOfBounds() {
		String poruka = "";
		for (int i=0;i<5;i++){
			poruka = poruka+"Ovde ce biti vise od 140 karaktera ";
		}
		twitterPoruka.setPoruka(poruka);	
	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		twitterPoruka.setKorisnik("Pera");
		twitterPoruka.setPoruka("Helou vrld");
		String actual = twitterPoruka.toString();
		assertEquals("KORISNIK:Pera PORUKA:Helou vrld", actual);
	}

}
