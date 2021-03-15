package boot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.Book.book;
import boot.Dao.bookDao;
import boot.service.bookService;

@Service
public class bookSericeImpl implements bookService {

	@Autowired
	private bookDao dao;
	
	/* (non-Javadoc)
	 * @see boot.service.bookService#queryAllBook()
	 */
	@Override
	public List<book> queryAllBook() {
		// TODO Auto-generated method stub
		return this.dao.queryAllBook();
	}

	/* (non-Javadoc)
	 * @see boot.service.bookService#queryDuringBook(boot.Book.book)
	 */
	@Override
	public List<book> queryDuringBook(book bo) {
		// TODO Auto-generated method stub
		return this.dao.queryDuringBook(bo);
	}

	/* (non-Javadoc)
	 * @see boot.service.bookService#addNewBook(java.util.List)
	 */
	@Override
	public void addNewBook(List<book> bo) {
		// TODO Auto-generated method stub
              this.dao.addNewBook(bo);
	}

	/* (non-Javadoc)
	 * @see boot.service.bookService#deleteBook(java.util.List)
	 */
	@Override
	public void deleteBook(List<book> bo) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see boot.service.bookService#updateBook(java.util.List)
	 */
	@Override
	public void updateBook(List<book> bo) {
		// TODO Auto-generated method stub

	}

}
