package thebigburd.service;

import org.springframework.stereotype.Service;
import thebigburd.model.Book;
import thebigburd.repository.BookRepository;

import java.util.List;
import java.util.Optional;


// Business Service Logic
@Service("BookService")
public class BookService implements CrudService<Book>{

    private BookRepository repository;

    public BookService(BookRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Book> list() {
        return repository.findAll();
    }

    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public Optional<Book> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(int id) {

    }

    @Override
    public void delete(int id) {

    }
}
