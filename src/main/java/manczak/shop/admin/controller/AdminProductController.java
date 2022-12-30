package manczak.shop.admin.controller;

import lombok.RequiredArgsConstructor;
import manczak.shop.admin.model.AdminProduct;
import manczak.shop.admin.service.AdminProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminProductController {

    private final AdminProductService productService;

    @GetMapping("/admin/products")
    public Page<AdminProduct> getProduct(Pageable pageable){
        return productService.getProducts(pageable);

    }
}
