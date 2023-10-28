package ru.taratonov.iistr2.service;

import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;
import ru.taratonov.iistr2.model.Bouquet;
import ru.taratonov.iistr2.model.InputDto;

@Service
public class FlowerServiceImpl implements FlowersService {

    private final KieSession kieSession = new DroolsBeanFactory().getKieSession();
    @Override
    public Bouquet getResultBouquet(InputDto inputDto) {
        return null;
    }
}
