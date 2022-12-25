package manczak.shop.product.service;

import lombok.RequiredArgsConstructor;
import manczak.shop.product.model.Product;
import manczak.shop.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }
}
