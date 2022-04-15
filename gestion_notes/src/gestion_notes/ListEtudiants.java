package gestion_notes;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiants extends ArrayList<Etudiant> {
	//Si il existe un étudiant avec le même id que e, on le remplace avec le 
	//nouveau étudiant e.
	@Override
	public boolean add(Etudiant e) {
		if (this!=null)
			if (this.contains(e)==true)
				set(indexOf(e), e);
		return super.add(e);
	}
	
	public List<Etudiant> filtrer(Condition c){
		ListEtudiants l=new ListEtudiants();
		for(Etudiant e : this)
			if (c.estVrai(e)==true) 
				l.add(e);
		return l;
	}
	
}
