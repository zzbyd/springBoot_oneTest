package boot.Book;

public class book {
    /**
     * 书本id.
     */
    private int  bookId;
    /**
     * 书本名称.
     */
    private String name;
    /**
     * 书本编号
     */
    private int number;
	/**
	 * @return
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * @param bookId
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
    
}
