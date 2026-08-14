package tw.edu.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.edu.cust.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
