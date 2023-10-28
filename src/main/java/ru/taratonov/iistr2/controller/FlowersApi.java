package ru.taratonov.iistr2.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.taratonov.iistr2.model.Bouquet;
import ru.taratonov.iistr2.model.InputDto;

public interface FlowersApi {
    @PostMapping("/bouquet")
    ResponseEntity<Bouquet> getResultBouquet(@RequestBody @Valid InputDto inputDto);
}
