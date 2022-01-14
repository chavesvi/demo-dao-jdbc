package model.dao;

import jdbc.connector.ConexaoUtil;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao(String url, String user, String password) {
		return new SellerDaoJDBC(ConexaoUtil.getConnection(url, user, password));
	}

}
