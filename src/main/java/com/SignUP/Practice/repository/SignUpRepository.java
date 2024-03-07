package com.SignUP.Practice.repository;

import com.SignUP.Practice.entity.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignUpRepository extends JpaRepository<SignUp, Long> {
}
