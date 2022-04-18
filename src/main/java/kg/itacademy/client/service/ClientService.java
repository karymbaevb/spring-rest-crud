package kg.itacademy.client.service;

import kg.itacademy.client.model.ClientModel;

public interface ClientService {
    ClientModel createClient(ClientModel clientModel);

    boolean deleteClient(Long clientId);

    boolean updateClient(ClientModel clientModel);

    ClientModel getClient(Long clientId);
}
