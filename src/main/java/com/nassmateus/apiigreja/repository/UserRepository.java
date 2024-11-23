package com.nassmateus.apiigreja.repository;

import com.nassmateus.apiigreja.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
