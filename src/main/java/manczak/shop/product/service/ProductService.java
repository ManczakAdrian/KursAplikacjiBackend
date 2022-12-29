package manczak.shop.product.service;

import lombok.RequiredArgsConstructor;
import manczak.shop.product.model.Product;
import manczak.shop.product.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Page<Product> getProducts(Pageable pageable){
        return productRepository.findAll(pageable);
    }
}
