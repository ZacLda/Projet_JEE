package Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import DAO.ConnectionBase;
import Modele.Utilisateur;

public class TraitementUtilisateur {
	
	public void ajouterUtilisateur(Utilisateur util) {
		//connexion a la bdd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
		
		//ecrire la requete
		String req = "insert into utilisateur(prenom, nom, login, password) values('"+util.getPrenom()+"', '"+util.getNom()+"', '"+util.getLogin()+"', '"+util.getPassword()+"')";
		
		//executer la requete
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modifierUtilisateur(Utilisateur util) {
		//connexion a la bdd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "update utilisateur set prenom='"+util.getPrenom()+"', nom='"+util.getNom()+"', login='"+util.getLogin()+"', password='"+util.getPassword()+"' where id='"+util.getId()+"' ";
				
		//executer
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void supprimerUtilisateur(int id) {
		//connexion a la bdd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
		
		//ecrire la requete
		String req = "delete from utilisateur where id='"+id+"' ";
		
		// executer
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet chercherUtilisateur(int id) {
		ResultSet rs = null;
		
		//connexion a la bdd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "select * from utilisateur where id='"+id+"' ";
				
		//executer
		try {
			rs = cb.st.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public ResultSet listerUtilisateurs() {
		ResultSet rs = null;
		
		//connexion a la bdd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "select * from utilisateur";
				
		//executer
		try {
			rs = cb.st.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public ResultSet testlogin(String login, String password) {
		ResultSet rs = null;
		
		//connection a la bd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
		
		//requete
		String req = "select * from utilisateur where login='"+login+"' and password = '"+password+"' ";
		
		//executer
		try {
			rs = cb.st.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	
}