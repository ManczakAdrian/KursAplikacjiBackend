package manczak.shop.product.controller;

import manczak.shop.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/product")
    public List<Product> getProduct(){
        return List.of(
                new Product("Nowy product 1", "Nowa kategoria 1", "Nowy opis 1", new BigDecimal("8.99"),"PLN"),
                new Product("Nowy product 2", "Nowa kategoria 2", "Nowy opis 2", new BigDecimal("8.99"),"PLN"),
                new Product("Nowy product 3", "Nowa kategoria 3", "Nowy opis 3", new BigDecimal("8.99"),"PLN"),
                new Product("Nowy product 4", "Nowa kategoria 4", "Nowy opis 4", new BigDecimal("8.99"),"PLN")
        );


    }
}