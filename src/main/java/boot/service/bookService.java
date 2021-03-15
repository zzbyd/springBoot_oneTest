package boot.service;

import java.util.List;

import boot.Book.book;

public interface bookService {

	/**
	 * @return
	 * 查询所有书本.
	 */
	public List<book> queryAllBook();
	
	/**
	 * @param bo
	 * @return
	 * 查询部分书本.
	 */
	public List<book> queryDuringBook( final book bo);
	
	
	/**
	 * @param bo
	 * 新增书本.
	 */
	public void addNewBook( final List<book> bo) ;
	
	
	/**
	 * @param bo
	 * 删除书本.
	 */
	public void deleteBook ( final List<book> bo) ;
	
	
	/**
	 * @param bo
	 * 修改书本.
	 */
	public void updateBook( final List<book> bo) ;
}
