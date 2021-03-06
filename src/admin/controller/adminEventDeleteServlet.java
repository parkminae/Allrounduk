package admin.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import event.model.service.EventService;

/**
 * Servlet implementation class adminEventDeleteServlet
 */
@WebServlet("/admin/eventdelete")
public class adminEventDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminEventDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int currentPage = 0;
		if (request.getParameter("currentPage") == null) {
			currentPage = 1;
		} else {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		int eventNo = Integer.parseInt(request.getParameter("eventNo"));
		String searchYn = request.getParameter("searchYn");
		String cate = null;
		String searchKeyword = null;
		
		int result = new EventService().deleteEvent(eventNo);
		if (result>0) {
			if(!searchYn.equals("Y")) {
				response.sendRedirect("/admin/eventlist?currentPage="+currentPage);
			}else {
				cate = request.getParameter("cate");
				searchKeyword = request.getParameter("searchKeyword");
				response.sendRedirect("/admin/eventsearch?cate=" + cate + "&searchKeyword=" + URLEncoder.encode(searchKeyword, "UTF-8") + "&currentPage=" + currentPage);
			}
		}else {
			RequestDispatcher view = request.getRequestDispatcher("#");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
