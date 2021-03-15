package boot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.Book.book;
import boot.service.bookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private bookService books;
	
	@RequestMapping("/queryAllBook")
	public List<book> queryAllBook(){
		return this.books.queryAllBook();
	}
	
	
	@PostMapping("/queryDuringBook")
	public List<book> queryDuringBook(@RequestBody final book bo){
		return this.books.queryDuringBook(bo);
	}
	
	@PostMapping("/addNewBook")
	public void addNewBook(@RequestBody final List<book> bo) {
		this.books.addNewBook(bo);
	}
	
	@PostMapping("/deleteBook")
	public void deleteBook (@RequestBody final List<book> bo) {
		
	}
	
	@PostMapping("/updateBook")
	public void updateBook(@RequestBody final List<book> bo) {
		
	}
	
	
}
