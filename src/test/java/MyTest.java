import com.zhijie.pojo.Book;
import com.zhijie.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
      BookService bookService= (BookService) applicationContext.getBean("bookServiceimpl");
        for (Book book : bookService.FindAllBook()) {
            System.out.println(book);
        }

    }
}
