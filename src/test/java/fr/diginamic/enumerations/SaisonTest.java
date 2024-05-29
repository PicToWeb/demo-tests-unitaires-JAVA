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

		Saison test2 = Saison.valueOfLibelle(null);
		assertNull(null, test2);

	}
	@Test
	public void valueOfLibelleTestDefaultParams() {

		Saison test3 = Saison.valueOfLibelle("ETE");
		assertNull(null, test3);

	}

}
