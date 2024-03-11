package rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.app.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
