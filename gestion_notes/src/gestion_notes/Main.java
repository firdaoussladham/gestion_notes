package gestion_notes;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Etudiant e1,e2,e3;
		e1=new Etudiant (5,"Hamid"); e2=new Etudiant(2,"Driss"); e3=new Etudiant(1,"Youssef");
		e1.setNote(15); e2.setNote(12); e3.setNote(16);
		ListEtudiants  mesEtudiants  = new ListEtudiants() ;
		mesEtudiants.add(e1);
		mesEtudiants.add(e2);
		mesEtudiants.add(e3);
		System.out.println(mesEtudiants);
		Collections.sort(mesEtudiants);
		Condition condition;
		condition =new Condition() {
			@Override
			public boolean estVrai(Etudiant e) {
				
			}
		};
		
		
		
	}

	

}
