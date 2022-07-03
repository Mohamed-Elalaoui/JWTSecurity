package ma.emsi.securityjwt.sec.repositories;

import ma.emsi.securityjwt.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String userName);
}
