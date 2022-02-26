package web.dao;

import org.springframework.data.repository.CrudRepository;
import web.model.User;

import java.util.List;

public interface UserDao extends CrudRepository<User, Long> {
    List<User> findAll();
    User findUserById(Long id);
}