package ru.taratonov.iistr2.service;

import ru.taratonov.iistr2.model.BloodResultTransfusion;
import ru.taratonov.iistr2.model.Transfusion;

public interface BloodService {
    BloodResultTransfusion getResultTransfuse(Transfusion transfusion);
}
