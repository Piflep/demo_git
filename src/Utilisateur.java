
/**
 * 
 * @author pifle
 *
 */
public class Utilisateur {
	
	/*_____________________ props _____________________*/
	private int id;
	private String nom;
	private String prenom;
	
	/*_____________________ ctors _____________________*/
	
	public Utilisateur() {
	}

	public Utilisateur(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/* ________________ getters/setters ________________ */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
}//end class
