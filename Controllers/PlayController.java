package mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.GameBean;

@WebServlet("/mvc/PlayController")
public class PlayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//Your play controller is responsible for updating your game bean with new moves from the player. 
//Once it's work is done, there is nothing for it to display, so it makes sense to have it 
//redirect to your game page (Game Controller).
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GameBean game = (GameBean) request.getSession().getAttribute("game");
		if (!game.getGameWinningStatus())
			game.move(Integer.parseInt(request.getParameter("row")), Integer.parseInt(request.getParameter("col")));
		if (game.getGameWinningStatus())
			request.setAttribute("gameOver", true);


		request.getRequestDispatcher("GameController").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
