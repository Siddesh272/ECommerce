package com.siddesh.ecommerce.dto;

import com.siddesh.ecommerce.entity.Address;
import com.siddesh.ecommerce.entity.Customer;
import com.siddesh.ecommerce.entity.Order;
import com.siddesh.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
