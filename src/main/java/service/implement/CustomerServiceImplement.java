package service.implement;

import java.sql.SQLException;
import java.util.List;

import dao.CustomerDao;
import dao.implement.CustomerDaoImplement;
import domain.Customer;
import service.CustomerService;
import java.util.List;

public class CustomerServiceImplement implements CustomerService {

	private CustomerDao customerDao;

	public CustomerServiceImplement() {
		try {
			customerDao = new CustomerDaoImplement ();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Customer create(Customer t) {
		return customerDao.create(t);
	}

	@Override
	public Customer read(int id) {
		return customerDao.read(id);
	}

	@Override
	public Customer update(Customer t) {
		return customerDao.update(t);
	}

	@Override
	public void delete(int id) {
		customerDao.delete(id);
	}

	@Override
	public List<Customer> readAll() {
		return customerDao.readAll();
	}

}