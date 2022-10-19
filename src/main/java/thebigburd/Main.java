package thebigburd;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import thebigburd.config.ApplicationConfig;
import thebigburd.service.BookService;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BookService service = applicationContext.getBean("BookService", BookService.class);

        System.out.print(service.list());
    }

}