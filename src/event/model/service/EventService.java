package event.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import event.model.dao.EventDAO;
import event.model.vo.Event;
import event.model.vo.PageData;

public class EventService {
	
	private JDBCTemplate factory;
	
	public EventService() {
		factory = JDBCTemplate.getConnection();
	}

	public PageData selectEventList(int currentPage) {
		Connection conn = null;
		PageData pd = new PageData();
		
		try {
			conn = factory.createConnection();
			pd.setEventList(new EventDAO().selectEventList(conn, currentPage));
			pd.setPageNavi(new EventDAO().getPageNavi(conn, currentPage));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pd;
	}

	public Event selectOneEvent(int eventNo) {
		Connection conn = null;
		Event event = null;
		
		try {
			conn = factory.createConnection();
			event = new EventDAO().selectOneEvent(conn, eventNo);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return event;
	}

}
