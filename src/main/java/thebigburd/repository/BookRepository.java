package thebigburd.repository;

import org.springframework.stereotype.Repository;
import thebigburd.model.Book;
import java.util.ArrayList;
import java.util.List;

// Data Storage / Persistence

@Repository
public class BookRepository implements CrudRepository<Book> {

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();

        return books;
    }
}
