package manczak.shop.admin.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name="product")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String description;
    private BigDecimal price;
    @Enumerated (EnumType.STRING)
    private AdminProductCurrency currency;
    private String image;



}

