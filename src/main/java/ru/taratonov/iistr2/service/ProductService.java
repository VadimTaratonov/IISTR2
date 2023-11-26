package ru.taratonov.iistr2.service;

import ru.taratonov.iistr2.model.InformationForCustomer;
import ru.taratonov.iistr2.model.ProductDto;

public interface ProductService {
    InformationForCustomer getResult(ProductDto productDto);
}
