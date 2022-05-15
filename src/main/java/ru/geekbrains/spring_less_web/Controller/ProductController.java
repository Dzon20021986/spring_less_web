package ru.geekbrains.spring_less_web.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;;
import ru.geekbrains.spring_less_web.Service.ProductService;
import ru.geekbrains.spring_less_web.Model.Product;

import java.util.List;

//@Controller
@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;

    }

    @GetMapping("/products")  // вернуть все продукты
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/find/id")  // поиск продукта по id
    public Product findById(@PathVariable Long id) {
         return productService.findById(id);
    }



    @GetMapping("/products/between")
    public List<Product> findByPrice(@RequestParam(defaultValue = "0") Integer min, @RequestParam(defaultValue = "150") Integer max) {
        return productService.findByPrice(min, max);
    }
}
