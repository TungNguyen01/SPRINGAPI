package com.taco.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taco.model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}
