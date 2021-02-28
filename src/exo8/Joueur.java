package exo8;

public class Joueur {

	
	
	private int anneeDeNaissance;
	private String nom;

	public Joueur(String nom, int anneeDeNaissance) {
		this.setNom(nom);
		this.setAnneeDeNaissance(anneeDeNaissance);
	}

	public int getAnneeDeNaissance() {
		return anneeDeNaissance;
	}

	public void setAnneeDeNaissance(int anneeDeNaissance) {
		this.anneeDeNaissance = anneeDeNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
