package exo7;

public class Exo7 {

	public static void main(String[] args) {
		
		Joueur José = new Joueur();
		José.setNom("José");
		José.setAge(40); //je devine votre age
		
		Joueur Fabien = new Joueur();
		Fabien.setNom("Fabien");
		Fabien.setAge(26); 
		
		Joueur Lilian = new Joueur();
		Lilian.setNom("Lilian");
		Lilian.setAge(26);
		
		Joueur Bixente = new Joueur();
		Bixente.setNom("Bixente");
		Bixente.setAge(28);
		
		Joueur Youri = new Joueur();
		Youri.setNom("Youri");
		Youri.setAge(30);
		
		
		Equipe_limitee equipe = new Equipe_limitee(3);
		equipe.addJoueur(José);
		equipe.addJoueur(Fabien);
		equipe.addJoueur(Lilian);
		equipe.addJoueur(Bixente);
		equipe.addJoueur(Youri);

		
		equipe.removeJoueur(José);
		System.out.println("José present ? " + equipe.isJoueurPresent(José));
		System.out.println(equipe);
		
	}

}
