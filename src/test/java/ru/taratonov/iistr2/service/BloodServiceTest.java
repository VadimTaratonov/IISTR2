package ru.taratonov.iistr2.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.taratonov.iistr2.model.BloodResultTransfusion;
import ru.taratonov.iistr2.model.BloodType;
import ru.taratonov.iistr2.model.Transfusion;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BloodServiceTest {

    @Autowired
    private BloodService service;

    @Test
    void getResultTransfuseOtoO() {
        Transfusion transfusion = new Transfusion(BloodType.O, BloodType.O);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.positiveResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseOtoA() {
        Transfusion transfusion = new Transfusion(BloodType.O, BloodType.A);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.negativeResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseOtoB() {
        Transfusion transfusion = new Transfusion(BloodType.O, BloodType.B);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.negativeResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseOtoAB() {
        Transfusion transfusion = new Transfusion(BloodType.O, BloodType.AB);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.negativeResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseAtoA() {
        Transfusion transfusion = new Transfusion(BloodType.A, BloodType.A);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.positiveResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseAtoO() {
        Transfusion transfusion = new Transfusion(BloodType.A, BloodType.O);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.positiveResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseAtoAB() {
        Transfusion transfusion = new Transfusion(BloodType.A, BloodType.AB);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.negativeResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseAtoB() {
        Transfusion transfusion = new Transfusion(BloodType.A, BloodType.B);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.negativeResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseBtoO() {
        Transfusion transfusion = new Transfusion(BloodType.B, BloodType.O);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.positiveResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseBtoB() {
        Transfusion transfusion = new Transfusion(BloodType.B, BloodType.B);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.positiveResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseBtoAB() {
        Transfusion transfusion = new Transfusion(BloodType.B, BloodType.AB);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.negativeResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseBtoA() {
        Transfusion transfusion = new Transfusion(BloodType.B, BloodType.A);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.negativeResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseABtoA() {
        Transfusion transfusion = new Transfusion(BloodType.AB, BloodType.A);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.positiveResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseABtoB() {
        Transfusion transfusion = new Transfusion(BloodType.AB, BloodType.B);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.positiveResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseABtoO() {
        Transfusion transfusion = new Transfusion(BloodType.AB, BloodType.O);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.positiveResult, resultTransfuse.getResult());
    }

    @Test
    void getResultTransfuseABtoAB() {
        Transfusion transfusion = new Transfusion(BloodType.AB, BloodType.AB);
        BloodResultTransfusion resultTransfuse = service.getResultTransfuse(transfusion);

        assertEquals(BloodServiceImpl.positiveResult, resultTransfuse.getResult());
    }
}