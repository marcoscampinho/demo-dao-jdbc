package application;

import java.util.List;

import mode.entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		 
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(1);
		
		System.out.println("===== findById =====");
		System.out.println(department);
		
		System.out.println("\n===== findAll =====");
		List<Department> list = departmentDao.findAll();
		list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n===== department insert =====");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Department ID: " + newDepartment.getId());
		
		System.out.println("\n===== department update =====");
		department = departmentDao.findById(1);
		department.setName("Game");
		departmentDao.update(department);
		System.out.println("Update complete");

		
		System.out.println("\n===== department delete =====");
		int id = 5;
		departmentDao.deleteById(id);
		System.out.println("Delete complete");
	}

}
