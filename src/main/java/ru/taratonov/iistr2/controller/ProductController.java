package ru.taratonov.iistr2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.taratonov.iistr2.model.InformationForCustomer;
import ru.taratonov.iistr2.model.ProductDto;
import ru.taratonov.iistr2.service.ProductService;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductApi {

    private final ProductService productService;

    @Override
    public ResponseEntity<InformationForCustomer> getResult(ProductDto productDto) {
        return ResponseEntity.ok(productService.getResult(productDto));
    }
}
