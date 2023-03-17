package com.example.store.service;

import com.example.store.pojo.Order;

import java.util.List;

public interface IOrderService {

    Order createOrder(Integer aid, String username, Integer cid, Integer[] pds);

    Order getOrder(Integer oid, Integer cid);

    void updateOrder(Integer cid, Integer orderId, String username);
}
