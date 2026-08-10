package App;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookService{

	private final BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<Books> getBook(){
		return bookRepository.findAll();
	}

	public void addBook(Books books) {
		bookRepository.save(books);
	}

	public void deleteBook(Long id) {
		boolean exit = bookRepository.existsById(id);
		if(!exit) {
			throw new IllegalStateException("This id " + id + " is not exited.");
		}
		bookRepository.deleteById(id);
	}

	public void updateBook(Long id, String name, Double price, Long quantity) {
		Books books = bookRepository.findById(id).orElseThrow (()-> new IllegalStateException("This id ;" + id + " is not exited."));
		if(name != null && name.length() > 0) {
			books.setName(name);
		}
		if(price != null && (price !=0 || price > 0)){
			books.setPrice(price);
		}
		if(quantity > 0) {
			books.setQuantity(quantity);
		}
		bookRepository.save(books);
	}

}
