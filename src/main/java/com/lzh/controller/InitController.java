package com.lzh.controller;

import com.lzh.pojo.Product;
import com.lzh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 刘振河
 * @create 2021--01--18 10:03
 */
@Controller
public class InitController {
    @Autowired
    private ProductService productService;
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
    
    @RequestMapping("/index")
    public String init(HttpSession session){
        List<Product> productList = productService.queraAll();
        Product product = null;
        for (int i = 0; i < productList.size(); i++) {
            product=productList.get(i);
        }
        session.setAttribute("haha",product);
        System.out.println(product.getProductName());
        return "hello";
    }
}
