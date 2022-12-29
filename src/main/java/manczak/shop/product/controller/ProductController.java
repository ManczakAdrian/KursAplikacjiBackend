package manczak.shop.product.controller;

import lombok.RequiredArgsConstructor;
import manczak.shop.product.model.Product;
import manczak.shop.product.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")

    public Page<Product> getProduct(@PageableDefault(size=10) Pageable pageable) {
        return productService.getProducts(pageable);

    }
}
