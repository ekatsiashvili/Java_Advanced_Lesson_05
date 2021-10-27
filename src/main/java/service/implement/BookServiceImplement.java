package service.implement;

import java.sql.SQLException;

import dao.BookDao;
import dao.implement.BookDaoImplement;
import domain.Book;
import service.BookService;
import java.util.List;

public class BookServiceImplement implements BookService {

	private BookDao bookDao;

	public BookServiceImplement() {
		try {
			bookDao = new BookDaoImplement ();
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
	public Book create(Book t) {
		return bookDao.create(t);
	}

	@Override
	public Book read(int id) {
		return bookDao.read(id);
	}

	@Override
	public Book update(Book t) {
		return bookDao.update(t);
	}

	@Override
	public void delete(int id) {
		bookDao.delete(id);
	}

	@Override
	public List<Book> readAll() {
		return bookDao.readAll();
	}

}