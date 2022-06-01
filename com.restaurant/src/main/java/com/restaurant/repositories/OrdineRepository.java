package com.restaurant.repositories;

import com.restaurant.entities.OrdineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineRepository extends JpaRepository<OrdineEntity, Integer>{

}
