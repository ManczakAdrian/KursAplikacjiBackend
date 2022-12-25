package manczak.shop.product.controller;

import lombok.RequiredArgsConstructor;
import manczak.shop.product.model.Product;
import manczak.shop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")
    public List<Product> getProduct() {
        return productService.getProducts();



    }
}
