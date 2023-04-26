package Controler;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Service.TraitementUtilisateur;
import Modele.Utilisateur;

/**
 * Servlet implementation class userServelet
 */
public class userServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String pren =  request.getParameter("pren");
		String nom =  request.getParameter("nom");
		String log =  request.getParameter("log");
		String pass =  request.getParameter("pass");
		Utilisateur util = new Utilisateur(pren, nom, log, pass);
		TraitementUtilisateur tutil = new TraitementUtilisateur();
		tutil.ajouterUtilisateur(util);
		PrintWriter pw = response.getWriter();
		pw.println("Prenom: " +pren+ "\nNom: " +nom+ "\nLogin: " +log);
	}

}
