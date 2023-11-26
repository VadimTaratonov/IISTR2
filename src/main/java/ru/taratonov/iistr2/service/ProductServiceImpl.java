package ru.taratonov.iistr2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.taratonov.iistr2.model.InformationForCustomer;
import ru.taratonov.iistr2.model.ProductDto;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final DroolsBeanFactory droolsBeanFactory;
    @Value("${potato.acceptable.amount.nitrates}")
    private Integer acceptableAmountOfNitratesPotato;
    @Value("${cabbage.acceptable.amount.nitrates}")
    private Integer acceptableAmountOfNitratesCabbage;
    @Value("${carrot.acceptable.amount.nitrates}")
    private Integer acceptableAmountOfNitratesCarrot;
    @Value("${cucumber.acceptable.amount.nitrates}")
    private Integer acceptableAmountOfNitratesCucumber;
    @Value("${tomato.acceptable.amount.nitrates}")
    private Integer acceptableAmountOfNitratesTomato;
    @Value("${beet.acceptable.amount.nitrates}")
    private Integer acceptableAmountOfNitratesBeet;
    @Value("${melon.acceptable.amount.nitrates}")
    private Integer acceptableAmountOfNitratesMelon;
    @Value("${watermelon.acceptable.amount.nitrates}")
    private Integer acceptableAmountOfNitratesWatermelon;
    @Value("${onion.acceptable.amount.nitrates}")
    private Integer acceptableAmountOfNitratesOnion;



    @Override
    public InformationForCustomer getResult(ProductDto productDto) {
        KieSession kieSession = droolsBeanFactory.getKieSession();
        InformationForCustomer informationForCustomer = new InformationForCustomer();

        kieSession.insert(productDto);
        kieSession.setGlobal("informationForCustomer", informationForCustomer);
        kieSession.setGlobal("acceptableAmountOfNitratesPotato", acceptableAmountOfNitratesPotato);
        kieSession.setGlobal("acceptableAmountOfNitratesCabbage", acceptableAmountOfNitratesCabbage);
        kieSession.setGlobal("acceptableAmountOfNitratesCarrot", acceptableAmountOfNitratesCarrot);
        kieSession.setGlobal("acceptableAmountOfNitratesCucumber", acceptableAmountOfNitratesCucumber);
        kieSession.setGlobal("acceptableAmountOfNitratesTomato", acceptableAmountOfNitratesTomato);
        kieSession.setGlobal("acceptableAmountOfNitratesBeet", acceptableAmountOfNitratesBeet);
        kieSession.setGlobal("acceptableAmountOfNitratesMelon", acceptableAmountOfNitratesMelon);
        kieSession.setGlobal("acceptableAmountOfNitratesWatermelon", acceptableAmountOfNitratesWatermelon);
        kieSession.setGlobal("acceptableAmountOfNitratesOnion", acceptableAmountOfNitratesOnion);
        kieSession.fireAllRules();

        log.info(String.valueOf(informationForCustomer.getAnswer()));
        return informationForCustomer;
    }
}
