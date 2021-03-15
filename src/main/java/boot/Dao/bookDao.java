package boot.Dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import boot.Book.book;

public interface bookDao {
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
	public List<book> queryDuringBook(@RequestBody final book bo);
	
	
	/**
	 * @param bo
	 * 新增书本.
	 */
	public void addNewBook(@RequestBody final List<book> bo) ;
	
	
	/**
	 * @param bo
	 * 删除书本.
	 */
	public void deleteBook (@RequestBody final List<book> bo) ;
	
	
	/**
	 * @param bo
	 * 修改书本.
	 */
	public void updateBook(@RequestBody final List<book> bo) ;
}
