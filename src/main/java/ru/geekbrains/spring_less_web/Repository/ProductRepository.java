package ru.geekbrains.spring_less_web.Repository;

import org.springframework.data.jpa.repository.Query;
import ru.geekbrains.spring_less_web.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

//    List<Product> findAllByPriceBetween(Integer min, Integer max);



    @Query("select p from Product p where  p.cost < 70")
    List<Product> findProductsWithLowPrices();

    @Query("select p from Product  p where  p.title = :title")
    Optional<Product> findProductByName(String title);


}
