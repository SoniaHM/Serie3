package exo7;

import java.util.ArrayList;
import java.util.Collection;

public class Equipe_limitee {
	
	
	
	public Equipe_limitee(int nombre_max) {
		this.nombre_max = nombre_max;
	}

	private int nombre_max;
	
	
	public int getNombre_max() {
		return nombre_max;
	}

	public void setNombre_max(int nombre_max) {
		this.nombre_max = nombre_max;
	}

	Collection<Joueur> equipe = new ArrayList<Joueur>();
	
	
	public void addJoueur(Joueur nouveau) {
		if (this.equipe.size()<nombre_max)
			this.equipe.add(nouveau);
		else 
			System.out.println("impossible d'ajouter le joueur " + nouveau.getNom() + " car l'equipe est complete");
    }
	
	public boolean removeJoueur(Joueur nouveau) {
		return this.equipe.remove(nouveau);
	}
	
	public boolean isJoueurPresent(Joueur joueur) {
		return this.equipe.contains(joueur);
	}


	@Override
	public String toString() {
		String liste = new String();
		for(Joueur element : equipe) {
			liste += "\n" + element.toString();
		}
		return "Equipe : " +equipe.size() + liste; 
	}
	
	
	public void addAllEquipe(Equipe nouvelle_equipe) {
		
		if (this.equipe.size()<=nombre_max) {
			this.equipe.retainAll(nouvelle_equipe.equipe);
			this.equipe.addAll(nouvelle_equipe.equipe);
		}
		else 
			System.out.println("impossible d'ajouter plus de joueurs car l'equipe est complete");
	}
	
	public void clear() {
		this.equipe.clear();
	}
	
	public int getNombreJoueur() {
		return this.equipe.size();
	}
	
	public double getMoyenneAge() {
		int moyenne=0;
		for(Joueur element : this.equipe) {
			moyenne += element.getAge();
		}
		
		return moyenne/this.equipe.size();
	}
	
	
}
