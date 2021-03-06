package admin.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import event.model.service.EventService;
import event.model.vo.Event;
import event.model.vo.PageData;
import market.model.service.MarketService;
import market.model.vo.MPageData;
import market.model.vo.Market;

/**
 * Servlet implementation class adminEventSearchServlet
 */
@WebServlet("/admin/marketsearch")
public class adminMarketSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminMarketSearchServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int currentPage = 0;
		if (request.getParameter("currentPage") == null) {
			currentPage = 1;
		}else {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		String selectOption = request.getParameter("selectOption");
		String searchKeyword = request.getParameter("searchKeyword");
		MPageData pageData = new MarketService().printMarketSearchToAdmin(searchKeyword, currentPage, selectOption);
		ArrayList<Market> mList = pageData.getMarketList();
		String pageNavi = pageData.getPageNavi();
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		if (!mList.isEmpty()) {
			request.setAttribute("mList", mList);
			request.setAttribute("pageNavi", pageNavi);
			request.setAttribute("selectOption", selectOption);
			request.setAttribute("currentPage", currentPage);
			request.setAttribute("searchKeyword", searchKeyword);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/admin/adminMarketSearchList.jsp");
			view.forward(request, response);
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
