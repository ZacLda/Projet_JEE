package Service;

import java.sql.SQLException;
import java.sql.ResultSet;
import Modele.Produit;
import DAO.ConnectionBase;

public class TraitementProduit {

	public void ajouterProduit(Produit pdt) {
		//connection a la bd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
		
		//ecrire la requete
		String req = "insert into produit(libelle, pu, description, dateFab, dateExp)"+
				"values('"+pdt.getLibelle()+"', '"+pdt.getPu()+"', '"+pdt.getDescription()+"', '"+pdt.getDateFab()+"', '"+pdt.getDateExp()+"')";
		
		//executer la requete
				try {
					cb.st.executeUpdate(req);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
	public void modifierProduit(Produit pdt) {
		//connexion a la bdd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "update produit set libelle='"+pdt.getLibelle()+"', prixu='"+pdt.getPu()+"', description='"+pdt.getDescription()+"', datefab='"+pdt.getDateFab()+"', dateexp='"+pdt.getDateExp()+"' where id='"+pdt.getId()+"' ";
				
		//executer
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void supprimerProduit(int id) {
		//connexion a la bdd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
		
		//ecrire la requete
		String req = "delete from produit where id='"+id+"' ";
		
		// executer
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet chercherProduit(int id) {
		ResultSet rs = null;
		
		//connexion a la bdd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "select * from produit where id='"+id+"' ";
				
		//executer
		try {
			rs = cb.st.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public ResultSet listerProduits() {
		ResultSet rs = null;
		
		//connexion a la bdd
		ConnectionBase cb = new ConnectionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "select * from produit";
				
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
	

