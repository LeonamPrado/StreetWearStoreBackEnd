package com.leoproject.StreetWearStoreBackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoproject.StreetWearStoreBackEnd.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
	User findByPasswordAndEmail(String password, String email);
}
