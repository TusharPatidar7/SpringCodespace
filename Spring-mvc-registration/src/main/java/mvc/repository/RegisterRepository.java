package mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import mvc.entity.UserDetails;

@Component
public interface RegisterRepository extends JpaRepository<UserDetails, String>
{

	@Query(value = "select * from userdetails where email = ?1 and password = ?2", nativeQuery = true)
	public List<UserDetails> checkCredentials(String email, String password);


}
