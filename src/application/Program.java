package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao("jdbc:mysql://localhost:3306/teste?useSSL=false", "root", "1234567");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
