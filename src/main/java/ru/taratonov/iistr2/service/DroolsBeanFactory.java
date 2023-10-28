package ru.taratonov.iistr2.service;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroolsBeanFactory {
    private final KieServices kieServices = KieServices.Factory.get();

    private KieFileSystem getKieFileSystem() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        List<String> rules = List.of("rules/bloodRules.drl");
        for (String rule : rules) {
            kieFileSystem.write(ResourceFactory.newClassPathResource(rule));
        }
        return kieFileSystem;
    }

    public KieSession getKieSession() {
        KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
        kb.buildAll();

        KieRepository kieRepository = kieServices.getRepository();
        ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();
        KieContainer kieContainer = kieServices.newKieContainer(krDefaultReleaseId);

        return kieContainer.newKieSession();
    }

}
