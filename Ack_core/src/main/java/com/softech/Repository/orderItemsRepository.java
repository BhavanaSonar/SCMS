package com.softech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.orderItems;

@Repository
public interface orderItemsRepository extends JpaRepository<orderItems, Long> {

}
