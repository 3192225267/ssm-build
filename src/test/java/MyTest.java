import com.lzh.mapper.ProductMapper;
import com.lzh.pojo.Product;
import com.lzh.service.ProductService;
import com.lzh.service.impl.ProcutServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 刘振河
 * @create 2021--01--18 14:34
 */
public class MyTest {

    @Autowired
    private ProcutServiceImpl productMapper;
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProcutServiceImpl productMapper = context.getBean(ProcutServiceImpl.class);
        List<Product> productList = productMapper.queraAll();
        for (Product product:productList
             ) {
            System.out.println(product.getProductName());
        }
    }
    @Test
    public void test(){
            for (Product product:productMapper.queraAll()
                 ) {
                System.out.println();
            }
    }
}
