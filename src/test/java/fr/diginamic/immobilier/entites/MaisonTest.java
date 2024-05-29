package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaisonTest {

	@Test
	void testAjouterPiece() {
		Maison maison1 = new Maison();

		Chambre chambre1 = new Chambre(1, 25);
		Cuisine cuisine = new Cuisine(0, 10);
		SalleDeBain salleDeBain = new SalleDeBain(1, 10);
		WC wc = new WC(0, 5);
		Salon salon = new Salon(0, -3);
		WC wc2 = new WC(-1, 5);

		maison1.ajouterPiece(chambre1);
		assertEquals(chambre1, maison1.getPieces()[0]);

		maison1.ajouterPiece(cuisine);
		assertEquals(cuisine, maison1.getPieces()[1]);

		maison1.ajouterPiece(salleDeBain);
		assertEquals(salleDeBain, maison1.getPieces()[2]);

		maison1.ajouterPiece(wc);
		assertEquals(wc, maison1.getPieces()[3]);

		// essai d'ajouter une piece qui a une superficie négative
		maison1.ajouterPiece(salon);

		// essai d'ajouter une piece qui a un étage négatif
		maison1.ajouterPiece(wc2);

		try {

			assertEquals(salon, maison1.getPieces()[4]);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}

		try {
			assertEquals(wc2, maison1.getPieces()[4]);

		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}

	}

	@Test
	void testNbPieces() {
		Maison maison1 = new Maison();

		Chambre chambre1 = new Chambre(1, 25);
		maison1.ajouterPiece(chambre1);
		Cuisine cuisine = new Cuisine(0, 10);
		maison1.ajouterPiece(cuisine);
		assertEquals(2, maison1.nbPieces());
	}

	@Test
	void testSuperficieEtage() {
		Maison maison1 = new Maison();

		Chambre chambre1 = new Chambre(1, 25);
		maison1.ajouterPiece(chambre1);
		Cuisine cuisine = new Cuisine(1, 10);
		maison1.ajouterPiece(cuisine);
		Cuisine cuisine2 = new Cuisine(1, 30);
		maison1.ajouterPiece(cuisine2);
		assertEquals(65, maison1.superficieEtage(1));

	}

	@Test
	void testSuperficieTypePiece() {
		Maison maison1 = new Maison();

		Chambre chambre1 = new Chambre(1, 25);
		maison1.ajouterPiece(chambre1);
		Cuisine cuisine = new Cuisine(1, 10);
		maison1.ajouterPiece(cuisine);
		Cuisine cuisine2 = new Cuisine(1, 30);
		maison1.ajouterPiece(cuisine2);
		assertEquals(40, maison1.superficieTypePiece("Cuisine"));
		assertEquals(40, maison1.superficieTypePiece("cuisine"));
		assertEquals(0, maison1.superficieTypePiece(""));
	}

	@Test
	void testCalculerSurface() {
		Maison maison1 = new Maison();

		Chambre chambre1 = new Chambre(1, 25);
		maison1.ajouterPiece(chambre1);
		Cuisine cuisine = new Cuisine(1, 10);
		maison1.ajouterPiece(cuisine);
		Cuisine cuisine2 = new Cuisine(1, 0);
		maison1.ajouterPiece(cuisine2);

		assertEquals(35, maison1.calculerSurface());

	}

}
