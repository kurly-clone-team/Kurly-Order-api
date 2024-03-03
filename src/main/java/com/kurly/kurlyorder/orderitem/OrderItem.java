package com.kurly.kurlyorder.orderitem;

import com.kurly.kurlyorder.order.Order;
import com.kurly.kurlyorder.order.OrderStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Order order;

    private Long itemId;

    private Long quantity;

    private OrderStatus orderItemStatus;

    private Long price;
}
