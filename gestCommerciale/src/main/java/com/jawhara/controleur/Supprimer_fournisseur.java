package com.jawhara.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jawhara.dao.FournisseurDao;
import com.jawhara.dao.ProduitDao;

/**
 * Servlet implementation class Supprimer_fournisseur
 */
@WebServlet("/Supprimer_fournisseur")
public class Supprimer_fournisseur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Supprimer_fournisseur() {
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
		try {
			int id=Integer.parseInt(request.getParameter("id"));
			new FournisseurDao().delete(id);
			
			response.setContentType("text/plain");
	        response.getWriter().write("OK");
		} catch (Exception e) {
			response.setContentType("text/plain");
	        response.getWriter().write("NO");
		}
	}
	
	

}
