package com.vacuna.empleado.repository;

import com.vacuna.empleado.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{
}
