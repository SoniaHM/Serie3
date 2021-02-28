package exo8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class RegistreJoueurs  {
	
	//Table de hachage en champ privé
	private Map<Integer, ArrayList<String>> map = new HashMap<>();

	 void addJoueur(Joueur j) {
	 
		 //On cherche la décennie de naissance
		int annee=1960;
		if (j.getAnneeDeNaissance()<1980 & j.getAnneeDeNaissance()>=1970 )
		{
			annee=1970;
		}
		if (j.getAnneeDeNaissance()<1990 & j.getAnneeDeNaissance()>=1980 )
		{
			annee=1980;
		}
		if (j.getAnneeDeNaissance()>=1990)
		{
			annee=1990;
		}
		
		ArrayList<String> newlist = new ArrayList<String>();
		//Si la décennie est déjà présente dans la table
		if (map.containsKey(annee))
		{
			for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
				if (entry.getKey() == annee)
				{
					newlist = entry.getValue();
					newlist.add(j.getNom());
					map.put(annee, newlist);
				}
			}
		}
		
		//Si la décennie n'est pas présente dans la table
		else
		{
			newlist.add(j.getNom());
			map.put(annee, newlist);
		}
	
	}
	 
	 Map<Integer, ArrayList<String>> get(int decennie)
	 {
		Map<Integer, ArrayList<String>> newmap = new HashMap<>();
		
		//On parcourt les entrées de la table
		for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
			if (entry.getKey() == decennie)
			{
				newmap.put(decennie, entry.getValue());
			}
			
		}
		
		return newmap;
	 }
	 
	 int count(int decennie)
	 {
		 int nbr = 0;
		//On parcourt les entrées de la table
		for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
			if (entry.getKey() == decennie)
			{
				nbr = entry.getValue().size();
			}	
		}
		
		return nbr;
	 }
	 
	 int count()
	 {
		 int nbr = 0;
			//On parcourt les entrées de la table
			for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
				{
					nbr += entry.getValue().size();
				}	
			}
			return nbr;
	 }

	 public String toString()
	 {
		 
		 String liste = new String();
			for(Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
				liste += "\n" + "[" + entry.getKey() +  "] -> " + entry.getValue();
			}
			return "Equipe : " + liste; 
	 }
	 
	public Map<Integer, ArrayList<String>> getMap() {
		return map;
	}

	public void setMap(Map<Integer, ArrayList<String>> map) {
		this.map = map;
	}

}
