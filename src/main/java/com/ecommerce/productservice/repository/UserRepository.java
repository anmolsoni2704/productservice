package com.ecommerce.productservice.repository;

import com.ecommerce.productservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long aLong);

    Optional<User> findByName(String name);

    List<User> findAllByNameEndingWith(String suffix);

    @Override
    User save(User entity);
}
