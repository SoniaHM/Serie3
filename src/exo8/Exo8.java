package exo8;

import java.util.ArrayList;

public class Exo8 {
	
	public static void main(String[] args) {
		
		//Initialisation de 10 joueurs
		Joueur j1 =  new Joueur("Laurent",  1965) ;
		Joueur j2 =  new Joueur("Marcel",  1968) ;
		Joueur j3 =  new Joueur("Patrick",  1976) ;
		Joueur j4 =  new Joueur("Alain",  1970) ;
		Joueur j5 =  new Joueur("Didier",  1968) ;
		Joueur j6 = new Joueur("Steve", 1980);
		Joueur j7 = new Joueur("Hugo", 1986);
		Joueur j8 = new Joueur("Djibril", 1992);
		Joueur j9 = new Joueur("Blaise", 1987);
		Joueur j10 = new Joueur("Paul", 1993);

	//Création des listes
		
		//Années 60
		ArrayList<String> list60 = new ArrayList<String>();
		list60.add(j1.getNom());
		list60.add(j2.getNom());
		list60.add(j5.getNom());

		//Années 70
		ArrayList<String> list70 = new ArrayList<String>();
		list70.add(j3.getNom());
		list70.add(j4.getNom());
		
		//Années 80
		ArrayList<String> list80 = new ArrayList<String>();
		list80.add(j6.getNom());
		list80.add(j7.getNom());
		list80.add(j9.getNom());
		
		
		//Années 90
		ArrayList<String> list90 = new ArrayList<String>();
		list90.add(j8.getNom());
		//list90.add(j10.getNom());

		//Création du registre
		RegistreJoueurs Registre = new RegistreJoueurs();
	

		//On initialise le registre
		Registre.getMap().put(1960, list60);
		Registre.getMap().put(1970, list70);
		Registre.getMap().put(1980, list80); 
		Registre.getMap().put(1990, list90); 
		
		//On ajoute 1 joueur avec la méthode addJoueur
		Registre.addJoueur(j10);

		
		  System.out.println("Joueurs nés en 1960 : " + Registre.get(1960) ) ;
		  System.out.println("Joueurs nés en 1970 : " + Registre.get(1970) ) ;
		  System.out.println("Joueurs nés en 1980 : " + Registre.get(1980) ) ;
		  System.out.println("Nombre de joueurs nés en 1990 : " + Registre.count(1990) ) ;
		  System.out.println("Nombre de joueurs dans le registre : " + Registre.count() ) ;
		  System.out.println("Contenu de la table de hachage : \n" + Registre.toString() ) ;

		
}

}
