package com.generation.integratorProject.SkateNation.repository;

import com.generation.integratorProject.SkateNation.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String Username);
}
