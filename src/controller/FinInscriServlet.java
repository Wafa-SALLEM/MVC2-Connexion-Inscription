package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Candidat;

/**
 * Servlet implementation class FinInscriServlet
 */
public class FinInscriServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinInscriServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		System.out.println("nom: "+ nom +", prénom = "+ prenom +", adresse = "+ adresse);
		Candidat candidat = new Candidat(nom, prenom, adresse);
		
		/**
		 * chemin commence par / ==> fichier existe sous WebContent
		 */
		if(candidat.getNom().isEmpty() || candidat.getPrenom().isEmpty() || candidat.getAdresse().isEmpty()){
			String msg="Champs vides";
			request.setAttribute("monMsg", msg);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/inscription.jsp").forward(request, response);
		}else{
			request.setAttribute("monCandidat", candidat);
			this.getServletContext().getRequestDispatcher("/FinInscription.jsp").forward(request, response);
		}
		
	}

}
