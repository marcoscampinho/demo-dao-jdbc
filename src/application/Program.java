package application;

import java.util.Date;
import java.util.List;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		 
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println("===== findById =====");
		System.out.println(seller);

		System.out.println("\n===== findByIdDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		list.forEach(System.out::println);
		
		System.out.println("\n===== findAll =====");
		list = sellerDao.findAll();
		
		list.forEach(System.out::println);
		
		System.out.println("\n===== seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Seller ID: " + newSeller.getId());
		

	}

}
