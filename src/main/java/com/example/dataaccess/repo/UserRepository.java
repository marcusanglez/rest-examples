package com.example.dataaccess.repo;

import com.example.dataaccess.entities.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
public interface UserRepository extends CrudRepository<User, Integer> {
}
