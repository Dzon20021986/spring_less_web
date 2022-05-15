package ru.geekbrains.spring_less_web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAllProducts() {  // вернуть все продукты
		return productRepository.findAll();
	}

	public Product findById(Long id) {  //
		return productRepository.findById(id).orElseThrow();
	}

	public List<Product> findByPrice(Integer min, Integer max) {
		return productRepository.finAllByPriceBetween(min, max);
	}

//	public void changeCost(Long id, Integer cost) {
//		Product product = productRepository.findById(id);
//		product.setCost(product.getCost() + cost);
//		// repository.save(product);
//
//	}
}
