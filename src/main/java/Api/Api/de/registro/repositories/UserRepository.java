package Api.Api.de.registro.repositories;

import Api.Api.de.registro.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
