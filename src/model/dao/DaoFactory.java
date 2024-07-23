package model.dao;

import model.dao.impl.SellerDaoJBDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJBDBC();
	}
}
