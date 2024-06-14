package leovasc5.hexa.coin.adapters.out;

import leovasc5.hexa.coin.core.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    default Client save(Client client) {
        return save(client);
    }
}
