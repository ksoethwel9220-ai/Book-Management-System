package Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Books;

public interface BookRepository extends JpaRepository<Books,Long>{

}
