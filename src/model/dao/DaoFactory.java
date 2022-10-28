package model.dao;

import db.DB;
import model.dao.impl.copy.SellerDaoJDBC;

public class DaoFactory {
     
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
