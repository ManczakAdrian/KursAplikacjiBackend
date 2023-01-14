package manczak.shop.admin.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import manczak.shop.admin.model.AdminProductCurrency;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;

@Getter
public class AdminProductDto {

    @NotBlank
    @Length (min=4)
    private String name;
    @NotBlank
    @Length (min=4)
    private String category;
    @NotBlank
    @Length (min=4)
    private String description;
    @NonNull
    @Min(0)
    private BigDecimal price;

    private AdminProductCurrency currency;
}
