package com.suai.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class TransportService {

    private final List<Transport> transports = new ArrayList<>();

    @WebMethod
    public List<Transport> getAllTransports() {
        return transports;
    }

    @WebMethod
    public Transport addTransport(Transport transport) {
        transports.add(transport);
        return transport;
    }

    @WebMethod
    public void deleteTransport(long id) {
        transports.removeIf(transport -> transport.getId() == id);
    }

    @WebMethod
    public void updateAvailability(long id) {
        for (Transport transport : transports) {
            if (transport.getId() == id) {
                String currentAvailability = transport.getAvailability();
                String newAvailability = "Да".equals(currentAvailability) ? "Нет" : "Да";
                transport.setAvailability(newAvailability);
                break;
            }
        }
    }
}
