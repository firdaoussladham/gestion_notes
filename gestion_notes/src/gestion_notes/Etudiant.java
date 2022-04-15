package gestion_notes;

public class Etudiant {
	private int id;
	private String nom;
	private double note;
	public Etudiant(int id, String nom ) {
		this.id=id; this.nom=nom; this.note=10;
	}
	@Override
	public String toString() {
		return "("+this.nom+":"+this.note+")";
	}
	//Redéfinir la méthode equals ( public boolean equals(Object obj) ). Deux Etudiants
	//sans égaux si et seulement s’ils ont la même valeur de id.
	@Override
	public boolean equals(Object obj) {
		return ((Etudiant)obj).id==this.id;
	}
	
	
	
	
}
