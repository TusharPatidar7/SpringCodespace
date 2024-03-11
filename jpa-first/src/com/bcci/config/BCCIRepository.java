package com.bcci.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BCCIRepository extends JpaRepository<Team, Integer>{

}
