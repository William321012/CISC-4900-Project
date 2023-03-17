package com.example.store.controller;

import com.example.store.pojo.Order;
import com.example.store.service.IOrderService;
import com.example.store.util.JsonResult;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController extends BaseController{

    @Resource
    private IOrderService orderService;

    @RequestMapping("/createOrder")
    public JsonResult<Order> createOrder(Integer aid, HttpServletRequest request, Integer[] checkId){
        JsonResult<Order> jsonResult = new JsonResult<>();
        Integer cid = (Integer)request.getSession().getAttribute("cid");
        String username = (String)request.getSession().getAttribute("username");

        Order order = orderService.createOrder(aid, username, cid, checkId);

        jsonResult.setState(200);
        jsonResult.setMessage("success");
        jsonResult.setData(order);

        return jsonResult;

    }

    @RequestMapping("/getOrderByOid")
    public JsonResult<Order> getOrderByOid(HttpServletRequest request, Integer oid){
        JsonResult<Order> jsonResult = new JsonResult<>();
        Integer cid = (Integer)request.getSession().getAttribute("cid");
        Order order = orderService.getOrder(oid, cid);
        jsonResult.setState(200);
        jsonResult.setMessage("success");
        jsonResult.setData(order);

        return jsonResult;

    }

    @RequestMapping("/updateOrderStatus")
    public JsonResult<Void> updateOrderStatus(HttpServletRequest request, Integer oid){
        JsonResult<Void> jsonResult = new JsonResult<>();
        Integer cid = (Integer)request.getSession().getAttribute("cid");
        String username = (String)request.getSession().getAttribute("username");

        orderService.updateOrder(cid,oid,username);
        jsonResult.setState(200);
        jsonResult.setMessage("success");

        return jsonResult;
    }
}
