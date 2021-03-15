package boot.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import boot.Book.book;
import boot.Dao.bookDao;

@Repository
public class bookDaoImpl implements bookDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	/* (non-Javadoc)
	 * @see boot.Dao.bookDao#queryAllBook()
	 */
	@Override
	public List<book> queryAllBook() {
		
		final String querySql =" SELECT BOOK_ID , NAME , NUMBER FROM BOOK";
		
		final List<book> book = this.jdbc.query(querySql,new RowMapper<book>() {

			@Override
			public book mapRow(ResultSet arg0, int arg1) throws SQLException {
				book b = new book();
				b.setBookId(arg0.getInt("book_id"));
				b.setName(arg0.getString("name"));
				b.setNumber(arg0.getInt("number"));
				return b;
			}
			
		});
		
		return book;
	}

	/* (non-Javadoc)
	 * @see boot.Dao.bookDao#queryDuringBook(boot.Book.book)
	 */
	@Override
	public List<book> queryDuringBook(book bo) {
		final StringBuffer bookBuffer = new StringBuffer(
				" SELECT A.BOOK_ID , A.NAME , A.NUMBER FROM BOOK A WHERE 1=1 ");
		final List<String> bookList = new ArrayList<String>();
		if (!StringUtils.isEmpty(bo.getName())) {
			bookBuffer.append(" AND A.NAME LIKE '%?%'");
			bookList.add(bo.getName());
		}

		if (bo.getBookId()>0) {
			bookBuffer.append(" AND A.BOOK_ID =? ");
			bookList.add(Integer.valueOf(bo.getBookId()).toString());
		}

		if (bo.getNumber() > 0) {
			bookBuffer.append(" AND A.NUMBER =? ");
			bookList.add(Integer.valueOf(bo.getNumber()).toString());
		}

		final List<book> book = this.jdbc.query(bookBuffer.toString(),
				new BeanPropertyRowMapper<>(book.class),bookList.toArray());

		// TODO Auto-generated method stub
		return book;
	}

	/* (non-Javadoc)
	 * @see boot.Dao.bookDao#addNewBook(java.util.List)
	 */
	@Override
	public void addNewBook(final List<book> bo) {
		final String querySql = " INSERT INTO BOOK(NAME,NUMBER) VALUES(?,?) ";
		this.jdbc.batchUpdate(querySql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement arg0, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				arg0.setString(1, bo.get(arg1).getName());
				arg0.setInt(2, bo.get(arg1).getNumber());
			}
			
			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return bo.size();
			}
		});
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see boot.Dao.bookDao#deleteBook(java.util.List)
	 */
	@Override
	public void deleteBook(List<book> bo) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see boot.Dao.bookDao#updateBook(java.util.List)
	 */
	@Override
	public void updateBook(List<book> bo) {
		// TODO Auto-generated method stub

	}

}
