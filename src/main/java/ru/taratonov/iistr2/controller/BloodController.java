package ru.taratonov.iistr2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.taratonov.iistr2.model.BloodResultTransfusion;
import ru.taratonov.iistr2.model.Transfusion;
import ru.taratonov.iistr2.service.BloodService;

@RestController
@RequiredArgsConstructor
public class BloodController implements BloodApi {

    private final BloodService bloodService;

    @Override
    public ResponseEntity<BloodResultTransfusion> getResultTransfusion(Transfusion transfusion) {
        return ResponseEntity.ok(bloodService.getResultTransfuse(transfusion));
    }
}
