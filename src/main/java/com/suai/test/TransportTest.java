package com.suai.test;

import com.suai.server.Transport;
import com.suai.server.TransportService;
import lombok.var;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransportTest {
    private TransportService transportService;
    private Transport transport;

    @BeforeEach
    void setUp() {
        transportService = new TransportService();

        transport = new Transport();
        transport.setId(1);
        transport.setCarName("Lada Granda");
        transport.setNumber("123");
        transport.setPrice("2000000p");
        transport.setYear("2018");
        transport.setStateTransport("Хорошее");
        transport.setAvailability("Да");

        transportService.addTransport(transport);
    }

    @Test
    void testAddTransport() {
        transport = new Transport();
        transport.setId(2);
        transport.setCarName("BMW X6");
        transport.setNumber("13");
        transport.setPrice("5000000p");
        transport.setYear("2019");
        transport.setStateTransport("Хорошее");
        transport.setAvailability("Нет");
        transportService.addTransport(transport);

        var allTransports = transportService.getAllTransports();
        assertEquals(2, allTransports.size());

        var addedTransport = allTransports.get(1);
        assertEquals("BMW X6", addedTransport.getCarName());
        assertEquals("13", addedTransport.getNumber());
        assertEquals("5000000p", addedTransport.getPrice());
        assertEquals("2019", addedTransport.getYear());
        assertEquals("Хорошее", addedTransport.getStateTransport());
        assertEquals("Нет", addedTransport.getAvailability());
    }

    @Test
    void testDeleteTransport() {
        var allTransportsBefore = transportService.getAllTransports();
        assertTrue(allTransportsBefore.stream().anyMatch(transport -> transport.getId() == 1));

        transportService.deleteTransport(1);
        var allTransportsAfter = transportService.getAllTransports();
        assertFalse(allTransportsAfter.stream().anyMatch(transport -> transport.getId() == 1));
    }

    @Test
    void testUpdateAvailability() {
        transportService.updateAvailability(1);

        var updatedTransport = transportService.getAllTransports().get(0);
        assertEquals("Нет", updatedTransport.getAvailability());
    }

    @Test
    void testGetAllTransports() {
        var allTransports = transportService.getAllTransports();

        assertEquals(1, allTransports.size());
        assertEquals("Lada Granda", allTransports.get(0).getCarName());
    }
}
