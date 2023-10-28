package ru.taratonov.iistr2.service;

import lombok.extern.slf4j.Slf4j;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;
import ru.taratonov.iistr2.model.BloodResultTransfusion;
import ru.taratonov.iistr2.model.Transfusion;

@Service
@Slf4j
public class BloodServiceImpl implements BloodService {

    public static final String positiveResult = "Переливание прошло успешно!";
    public static final String negativeResult = "Переливание невозможно!";

    private final KieSession kieSession = new DroolsBeanFactory().getKieSession();

    @Override
    public BloodResultTransfusion getResultTransfuse(Transfusion transfusion) {
        BloodResultTransfusion result = new BloodResultTransfusion();

        kieSession.insert(transfusion);
        kieSession.setGlobal("bloodResultTransfusion", result);
        kieSession.fireAllRules();

        log.info(result.getResult());
        return result;
    }
}
