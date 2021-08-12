package example.springframework.di.Service.ProductService;

import example.springframework.di.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> listProducts() {
        List<Product> list=new ArrayList<>();
        list.add(new Product("Product 1 description"));
        list.add(new Product("Product 2 description"));
        return list;
    }
}
