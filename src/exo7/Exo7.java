package exo7;

public class Exo7 {

	public static void main(String[] args) {
		
		Joueur Jos� = new Joueur();
		Jos�.setNom("Jos�");
		Jos�.setAge(40); //je devine votre age
		
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
		equipe.addJoueur(Jos�);
		equipe.addJoueur(Fabien);
		equipe.addJoueur(Lilian);
		equipe.addJoueur(Bixente);
		equipe.addJoueur(Youri);

		
		equipe.removeJoueur(Jos�);
		System.out.println("Jos� present ? " + equipe.isJoueurPresent(Jos�));
		System.out.println(equipe);
		
	}

}
