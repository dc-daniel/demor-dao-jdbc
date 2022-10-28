package application;



import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "books");
		
		Seller sl = new Seller(21,"daniel","daniel@gmail.com", new Date(),3000.00,obj);
		
		System.out.println(sl);

	}

}
