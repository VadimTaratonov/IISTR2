package ru.taratonov.iistr2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.taratonov.iistr2.model.Bouquet;
import ru.taratonov.iistr2.model.InputDto;
import ru.taratonov.iistr2.service.FlowersService;

@RestController
@RequiredArgsConstructor
public class FlowersController implements FlowersApi {

    private final FlowersService flowersService;

    @Override
    public ResponseEntity<Bouquet> getResultBouquet(InputDto inputDto) {
        return ResponseEntity.ok(flowersService.getResultBouquet(inputDto));
    }
}
