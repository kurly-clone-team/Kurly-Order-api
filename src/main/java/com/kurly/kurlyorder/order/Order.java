package com.kurly.kurlyorder.order;

import com.kurly.kurlyorder.orderitem.OrderItem;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItemList;

    private OrderStatus orderStatus;

    private Long totalPrice;
}
