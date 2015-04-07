package com.twitter.poruke;
/**
 * Predstavlja jednu poruku na Twitteru.
 * @author dejan
 *
 */
public class TwitterPoruka {
	
	/**
	 * Korisnicko ime osobe koja postavlja poruku
	 */
	private String korisnik;
	
	/**
	 * Poslata poruka.
	 */
	private String poruka;
	
	/**
	 * Metoda vraca korisnicko ime (vrednost atributa korisnik)
	 * @return korisnicko ime kao String
	 */
	public String getKorisnik() {
	return korisnik;
	}
	
	/**
	 * Metoda postavlja vrednost parametra korisnika na unetu String vrednost 
	 * @param korisnik 
	 * @throws java.lang.RuntimeException ako je uneta vrednost parametra null ili prazan string
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik==null || korisnik.equals(""))
			throw new RuntimeException(
					"Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	
	/**
	 * Metoda vraca unetu poruku (vrednost atributa poruka)
	 * @return poruka kao String
	 */
	public String getPoruka() {
	return poruka;
	}
	
	/**
	 * Metoda postavlja tekst poruke na unetu vrednost.
	 * @param poruka
	 * @throws java.RuntimeException ako je uneta poruka null ili ima vise od 140 karaktera
	 */
	public void setPoruka(String poruka) {
		if (poruka==null || poruka.length()>140)
			throw new RuntimeException(
				"Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	
	/**
	 * Vraca vrednost atributa korisnik i poruka u vidu Stringa
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	} 

}
