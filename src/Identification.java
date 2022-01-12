import java.util.ArrayList;

public class Identification {
	private String nom;
	public int ID_utilisateur;
	public String Root;
	public String utilisateur;
	private final ArrayList<String> list;
	
	public Identification(String nom) {
		this.nom=nom;
		list = new ArrayList<String>();
		
	}
	public void Root(String Root) {
		this.Root=Root;
	}
	public void Utilisateur(String utilisateur) {
		this.utilisateur=utilisateur;
		list.add(utilisateur);
		
	}
	
	
	
	
	
	//Getter and Setter
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getID_utilisateur() {
		return ID_utilisateur;
	}
	public void setID_utilisateur(int iD_utilisateur) {
		ID_utilisateur = iD_utilisateur;
	}
	public String getRoot() {
		return Root;
	}
	public void setRoot(String root) {
		this.Root = root;
	}
	public String getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

}
