package leovasc5.hexa.coin.core.services;

import leovasc5.hexa.coin.adapters.out.ClientRepository;
import leovasc5.hexa.coin.core.domain.Client;
import leovasc5.hexa.coin.core.ports.in.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }
}
