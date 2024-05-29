package fr.diginamic.immobilier.entites;

import java.util.Arrays;

/** Représente une maison avec toutes ses pièces
 * @author DIGINAMIC
 *
 */
public class Maison {
	
	/** pieces : tableau de pièces de la maison */
	private Piece[] pieces;
	
	/**
	 * Constructeur
	 */
	public Maison(){
		// Initialisation du tableau de pièces
		pieces = new Piece[0];
	}

	/** Ajoute une pièce à la maison
	 * @param nvPiece nouvelle pièce à ajouter
	 * @throws MessageErreur 
	 */
	public void ajouterPiece(Piece nvPiece) {
		
		if (nvPiece == null || nvPiece.getSuperficie() < 0 || nvPiece.getNumEtage() < 0) {
			
		} else {
			pieces = Arrays.copyOf(pieces, pieces.length + 1);
			pieces[pieces.length - 1] = nvPiece;
		}
	}
	
	public int nbPieces() {
		return pieces.length;
	}

	/** Retourne la superficie d'un étage
	 * @param choixEtage choix de l'étage
	 * @return double
	 */
	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (choixEtage == this.pieces[i].getNumEtage()) {
				superficieEtage += this.pieces[i].getSuperficie();
			}
		}

		return superficieEtage;
	}
	
	/** Retourne la superficie total pour un type de pièce donné
	 * @param typePiece type de pièce
	 * @return double
	 */
	public double superficieTypePiece(String typePiece) {
		double superficie = 0;
		if(typePiece != "")
			typePiece = capitalize(typePiece);
		for (int i = 0; i < pieces.length; i++) {
			if (typePiece!=null && typePiece.equals(this.pieces[i].getType())) {
				superficie = superficie + this.pieces[i].getSuperficie();
			}
		}

		return superficie;
	}

	/** Retourne la surface totale
	 * @return double
	 */
	public double calculerSurface() {
		double superficieTot = 0;

		for (int i = 0; i < pieces.length; i++) {
			superficieTot = superficieTot + this.pieces[i].getSuperficie();
		}

		return superficieTot;
	}
	
	
	/**
	 * Méthode permettant de transformer la première lettre d'une string en majuscule
	 * @param inputString
	 * @return inputString avec la premiere lettre en majuscule
	 */
	public static String capitalize(String inputString) {

		char firstLetter = inputString.charAt(0);
		char capitalFirstLetter = Character.toUpperCase(firstLetter);

		return inputString.replace(inputString.charAt(0), capitalFirstLetter);
	}
	

	/** Getter pour l'attribut pieces
	 * @return the pieces
	 */
	public Piece[] getPieces() {
		return pieces;
	}

}