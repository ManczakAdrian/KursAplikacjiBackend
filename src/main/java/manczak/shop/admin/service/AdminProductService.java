package manczak.shop.admin.service;


import lombok.RequiredArgsConstructor;
import manczak.shop.admin.model.AdminProduct;
import manczak.shop.admin.repository.AdminProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminProductService {

    private final AdminProductRepository productRepository;

    public Page <AdminProduct> getProducts (Pageable pageable){

        return productRepository.findAll(pageable);
    }

    public AdminProduct getProduct(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public AdminProduct createProduct(AdminProduct product) {
        return productRepository.save(product);

    }

    public AdminProduct updateProduct(AdminProduct product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
