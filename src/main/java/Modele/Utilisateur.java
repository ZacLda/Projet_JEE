package Modele;

public class Utilisateur {
	public Utilisateur(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	private int id;
	private String prenom;
	private String nom;
	private String login;
	private String password;
	
	//Constructeur avec tous les arg
	public Utilisateur(int id, String prenom, String nom, String login, String password) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}

	//Constructeur avec tous les arg sauf id
	public Utilisateur(String prenom, String nom, String login, String password) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}

	//Constructeur sans arg
	public Utilisateur() {
		super();
	}

	//Getters et setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
