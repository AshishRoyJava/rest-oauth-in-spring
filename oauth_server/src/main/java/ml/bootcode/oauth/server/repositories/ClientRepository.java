package ml.bootcode.oauth.server.repositories;

import ml.bootcode.oauth.server.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByClientId(String clientId);
}
