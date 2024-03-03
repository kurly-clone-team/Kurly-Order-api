package com.kurly.kurlyorder.order.repository;

import com.kurly.kurlyorder.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
