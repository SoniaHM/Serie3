package exo7;

import java.util.ArrayList;
import java.util.Collection;

public class Equipe {

	
	Collection<Joueur> equipe = new ArrayList<Joueur>();
	
	
	public void addJoueur(Joueur nouveau) {
        this.equipe.add(nouveau);
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
		
		this.equipe.retainAll(nouvelle_equipe.equipe);
		this.equipe.addAll(nouvelle_equipe.equipe);
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

