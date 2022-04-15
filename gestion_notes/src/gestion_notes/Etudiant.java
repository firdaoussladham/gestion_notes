package gestion_notes;

public class Etudiant {
	int id;
	String nom;
	double note;
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}
	public Etudiant(int id, String nom) {
		this.id=id; this.nom=nom; this.note=10;
	}
	@Override
	public String toString() {
		return (this.nom+":"+this.note);
	}
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
}
