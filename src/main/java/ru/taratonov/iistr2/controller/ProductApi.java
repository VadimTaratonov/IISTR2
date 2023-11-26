package ru.taratonov.iistr2.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.taratonov.iistr2.model.InformationForCustomer;
import ru.taratonov.iistr2.model.ProductDto;

public interface ProductApi {
    @PostMapping("/product")
    ResponseEntity<InformationForCustomer> getResult(@RequestBody @Valid ProductDto productDto);
}
