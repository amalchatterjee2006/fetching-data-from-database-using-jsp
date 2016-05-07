package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import models.*;

@Repository
@Transactional
public class employeeDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Employee> getAllEmployees()
	{
		Session session=sessionFactory.getCurrentSession();
		List<Employee> empList=session.createQuery(" from Employee").list();
		return empList;
	}
	
}
