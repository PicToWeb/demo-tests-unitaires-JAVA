package fr.diginamic.enumerations;

import static org.junit.Assert.*;



import org.junit.Test;

public class SaisonTest {
	

	@Test
	public void valueOfLibelleTestGoodParams() {

		Saison test = Saison.valueOfLibelle("Eté");
		assertEquals(Saison.ETE,test );
		
	}

	@Test
	public void valueOfLibelleTestNull() {

		Saison test = Saison.valueOfLibelle(null);
		assertNull(null, test);

	}
	@Test
	public void valueOfLibelleTestEmpty() {

		Saison test = Saison.valueOfLibelle("");
		assertNull(null, test);

	}
	@Test
	public void valueOfLibelleTestDefaultParams() {

		Saison test = Saison.valueOfLibelle("ETE");
		assertNull(null, test);

	}

}
