package thebigburd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "thebigburd")
public class ApplicationConfig {


    // Spring automatically creates Beans through class annotations such as @Component, @Repository and @Service
//    @Bean("BookRepository")
//    public BookRepository getBookRepository(){
//        return new BookRepository();
//    }
//
//    @Bean("BookService")
//    public BookService getBookService(){
//        return new BookService(getBookRepository());
//    }

}


