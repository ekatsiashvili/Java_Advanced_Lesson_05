package service.implement;

import java.sql.SQLException;

import dao.BucketOrderDao;
import dao.implement.BucketOrderDaoImplement;
import domain.BucketOrder;
import service.BucketOrderService;
import java.util.List;

public class BucketOrderServiceImplement implements BucketOrderService {
	
	private BucketOrderDao bucketOrderDao;
	
	public BucketOrderServiceImplement() {
		try {
			bucketOrderDao = new BucketOrderDaoImplement();
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
	public BucketOrder create(BucketOrder t) {
		return bucketOrderDao.create(t);
	}

	@Override
	public BucketOrder read(int id) {
		return bucketOrderDao.read(id);
	}

	@Override
	public BucketOrder update(BucketOrder t) {
		return bucketOrderDao.update(t);
	}

	@Override
	public void delete(int id) {
		bucketOrderDao.delete(id);
	}

	@Override
	public List<BucketOrder> readAll() {
		return bucketOrderDao.readAll();
	}

}