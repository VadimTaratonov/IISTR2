package ru.taratonov.iistr2.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.taratonov.iistr2.model.BloodResultTransfusion;
import ru.taratonov.iistr2.model.Transfusion;

public interface BloodApi {
    @PostMapping("/transfuse")
    ResponseEntity<BloodResultTransfusion> getResultTransfusion(@RequestBody @Valid Transfusion transfusion);
}
