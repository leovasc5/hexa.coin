package leovasc5.hexa.coin.core.ports.out;

import leovasc5.hexa.coin.core.domain.Client;

public interface ClientRepository {
    Client save(Client client);

}
