package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import models.*;

@Service
public class EmployeeService {
		@Autowired
		employeeDAO pdao;
	
		public List<Employee> getAllEmployee()
		{
			return pdao.getAllEmployees();
		}
}
