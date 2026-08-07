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

}
