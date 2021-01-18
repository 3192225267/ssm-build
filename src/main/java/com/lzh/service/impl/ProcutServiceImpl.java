package com.lzh.service.impl;

import com.lzh.mapper.ProductMapper;
import com.lzh.pojo.Product;
import com.lzh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘振河
 * @create 2021--01--18 15:27
 */
@Service
public class ProcutServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<Product> queraAll() {
        return productMapper.queraAll();
    }

}
