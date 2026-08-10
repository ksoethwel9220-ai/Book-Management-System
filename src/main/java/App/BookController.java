package App;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v2/book")
public class BookController {
	
	private final BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping
	public List<Books> getBook(){
		return bookService.getBook();
	}
	
	@PostMapping
	public void addNewBook(@RequestBody Books books){
		bookService.addBook(books);
	}
	
	@PutMapping(path = "{id}")
	public void updateBook(@PathVariable("id") Long id,@RequestParam String name,@RequestParam Double price,@RequestParam Long quantity) {
		bookService.updateBook(id, name, price, quantity);
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteBook(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}

}
