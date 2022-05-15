package ru.geekbrains.spring_less_web.Repository;

import ru.geekbrains.spring_less_web.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> finAllByPriceBetween(Integer min, Integer max);


}
