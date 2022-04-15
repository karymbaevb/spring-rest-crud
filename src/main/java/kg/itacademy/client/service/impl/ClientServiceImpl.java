package kg.itacademy.client.service.impl;

import kg.itacademy.client.model.ClientModel;
import kg.itacademy.client.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ClientServiceImpl implements ClientService {
    private Map<Integer, ClientModel> storages = new HashMap<>();

    @Override
    public ClientModel createClient(ClientModel clientModel) {
        return storages.put(clientModel.getClientId(), clientModel);
    }

    @Override
    public boolean deleteClient(Integer clientId) {
        return storages.remove(clientId, storages.get(clientId));
    }

    @Override
    public boolean updateClient(ClientModel clientModel) {
        return storages.put(clientModel.getClientId(), clientModel) != null;
    }

    @Override
    public ClientModel getClient(Integer clientId) {
        return storages.get(clientId);
    }
}
