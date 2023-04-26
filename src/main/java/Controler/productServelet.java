package Controler;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Modele.Produit;
import Service.TraitementProduit;

/**
 * Servlet implementation class productServelet
 */
public class productServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productServelet() {
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
		String lib =  request.getParameter("lib");
		int pu =  Integer.parseInt(request.getParameter("pu"));
		String desc =  request.getParameter("desc");
		String dateF =  request.getParameter("dateF");
		String dateEx =  request.getParameter("dateEx");
		Produit pdt = new Produit(lib, pu, desc, dateF, dateEx);
		TraitementProduit tpdt = new TraitementProduit(); 
		tpdt.ajouterProduit(pdt);
		PrintWriter pw = response.getWriter();
		pw.println("Libelle: " +lib+ "\nPU: " +pu+ "\nDescription: " +desc+ "\nDate Fabrication" +dateF+ "\nDate Expiration" +dateEx);
	}

}
