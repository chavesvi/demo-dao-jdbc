package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao("jdbc:mysql://localhost:3306/teste?useSSL=false", "root", "1234567");
		
		System.out.println("===  Test 1: department insert ===");
		Department dp = new Department(null, "Food");
		departmentDao.insert(dp);
		System.out.println("Inserted! New id = " + dp.getId());
		
		System.out.println("===  Test 2: department update ===");
		dp = departmentDao.findById(5);
		dp.setName("Course");
		departmentDao.update(dp);
		System.out.println("Update completed!");
		
		System.out.println("===  Test 3: department daleteById ===");
		departmentDao.deleteById(10);
		System.out.println("Delete completed!");
		
		System.out.println("===  Test 4: department findById ===");
		dp = departmentDao.findById(2);
		System.out.println(dp);
		
		System.out.println("===  Test 5: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

	}

}
