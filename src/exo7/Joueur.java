package exo7;

public class Joueur implements Comparable<Joueur> {
	
	public Joueur() {
	}
	
	public Joueur(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}



	private String nom;
	private int age;
	
	
	public void getNom(String nom) {
		this.nom = nom;
	}
	
	
	@Override
	public String toString() {
		return "Joueur : nom=" + nom + ", age=" + age;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	public int compareTo(Joueur o) {
		return this.nom.compareTo(o.nom);
	}
	
	
}
	

