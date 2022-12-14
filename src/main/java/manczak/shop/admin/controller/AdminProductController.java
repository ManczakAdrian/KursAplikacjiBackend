package manczak.shop.admin.controller;

import lombok.RequiredArgsConstructor;
import manczak.shop.admin.controller.dto.AdminProductDto;
import manczak.shop.admin.model.AdminProduct;
import manczak.shop.admin.service.AdminProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequiredArgsConstructor
public class AdminProductController {

    private static final Long EMPTY_ID =null ;
    private final AdminProductService productService;

    @GetMapping("/admin/products")
    public Page<AdminProduct> getProduct(Pageable pageable) {
        return productService.getProducts(pageable);

    }

    @GetMapping("/admin/products/{id}")
    public AdminProduct getProduct(@PathVariable Long id) {
        return productService.getProduct(id);

    }

    @PostMapping("/admin/products")
    public AdminProduct createProduct(@RequestBody AdminProductDto adminProductDto) {
        return productService.createProduct(mapAdminProduct(adminProductDto, EMPTY_ID));

    }

    @PutMapping("/admin/products/{id}")
    public AdminProduct updateProduct(@RequestBody AdminProductDto adminProductDto, @PathVariable Long id) {
        return productService.updateProduct(mapAdminProduct(adminProductDto, id)
        );

    }

    private AdminProduct mapAdminProduct(AdminProductDto adminProductDto, Long id) {
        return AdminProduct.builder()
                .id(id)
                .name(adminProductDto.getName())
                .description(adminProductDto.getDescription())
                .category(adminProductDto.getCategory())
                .price(adminProductDto.getPrice())
                .currency(adminProductDto.getCurrency().toUpperCase(Locale.ROOT))
                .build();
    }
}
