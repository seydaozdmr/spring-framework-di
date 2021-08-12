package example.springframework.di.Controller.ProductController;

import example.springframework.di.Model.Product;
import example.springframework.di.Service.ProductService.ProductService;
import org.springframework.stereotype.Controller;

import java.util.List;

/***
 * Without this annotation, Spring will not bring this class into the context,
 * and will not inject an instance of the service into the class.
 */
@Controller
public class ProductController {
    private final ProductService productService;

    //Constructor injection -> way of dependency injection
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getProducts(){
        return productService.listProducts();
    }
}
