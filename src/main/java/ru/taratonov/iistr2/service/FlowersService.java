package ru.taratonov.iistr2.service;

import ru.taratonov.iistr2.model.Bouquet;
import ru.taratonov.iistr2.model.InputDto;

public interface FlowersService {
    Bouquet getResultBouquet(InputDto inputDto);
}
