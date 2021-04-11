package market.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import market.model.dao.MarketDAO;
import market.model.vo.Market;
import market.model.vo.PageData;



public class MarketService {
	
	private JDBCTemplate factory;
	
	public MarketService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public PageData printAllMarketList(int currentPage) {
		Connection conn = null;
		PageData pd = new PageData();
		
		try {
			conn = factory.createConnection();
			pd.setMarketList(new MarketDAO().printAllMarketList(conn, currentPage));
			pd.setPageNavi(new MarketDAO().getPageNavi(conn, currentPage));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pd;
	}

}
