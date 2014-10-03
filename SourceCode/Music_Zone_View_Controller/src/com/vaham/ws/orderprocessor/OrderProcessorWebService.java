package com.vaham.ws.orderprocessor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-20T00:38:55.314-04:00
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "http://orderprocessor.ws.vaham.com/", name = "OrderProcessorWebService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface OrderProcessorWebService {

    @WebResult(name = "return", targetNamespace = "http://orderprocessor.ws.vaham.com/", partName = "return")
    @Action(input = "http://orderprocessor.ws.vaham.com/OrderProcessorWebService/createAccountRequest", output = "http://orderprocessor.ws.vaham.com/OrderProcessorWebService/createAccountResponse")
    @WebMethod
    public boolean createAccount(
        @WebParam(partName = "account", name = "account")
        Account account
    );

    @WebResult(name = "return", targetNamespace = "http://orderprocessor.ws.vaham.com/", partName = "return")
    @Action(input = "http://orderprocessor.ws.vaham.com/OrderProcessorWebService/confirmOrderRequest", output = "http://orderprocessor.ws.vaham.com/OrderProcessorWebService/confirmOrderResponse")
    @WebMethod
    public PurchaseOrder confirmOrder(
        @WebParam(partName = "shoppingCart", name = "shoppingCart")
        PurchaseOrder shoppingCart,
        @WebParam(partName = "paymentInfo", name = "paymentInfo")
        PaymentInfo paymentInfo
    );

    @WebResult(name = "return", targetNamespace = "http://orderprocessor.ws.vaham.com/", partName = "return")
    @Action(input = "http://orderprocessor.ws.vaham.com/OrderProcessorWebService/createOrderRequest", output = "http://orderprocessor.ws.vaham.com/OrderProcessorWebService/createOrderResponse")
    @WebMethod
    public PurchaseOrder createOrder(
        @WebParam(partName = "purchaseOrder", name = "purchaseOrder")
        PurchaseOrder purchaseOrder
    );

    @WebResult(name = "return", targetNamespace = "http://orderprocessor.ws.vaham.com/", partName = "return")
    @Action(input = "http://orderprocessor.ws.vaham.com/OrderProcessorWebService/getAccountRequest", output = "http://orderprocessor.ws.vaham.com/OrderProcessorWebService/getAccountResponse")
    @WebMethod
    public Account getAccount(
        @WebParam(partName = "username", name = "username")
        java.lang.String username,
        @WebParam(partName = "password", name = "password")
        java.lang.String password
    );
}