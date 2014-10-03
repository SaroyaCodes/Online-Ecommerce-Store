
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vaham.ws.orderprocessor;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-20T00:38:55.298-04:00
 * Generated source version: 2.7.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderProcessorWebServiceImplService",
                      portName = "OrderProcessorWebServiceImplPort",
                      targetNamespace = "http://orderprocessor.ws.vaham.com/",
                      wsdlLocation = "http://localhost:8080/MusicZoneBackend/OrderProcessorWebService?wsdl",
                      endpointInterface = "com.vaham.ws.orderprocessor.OrderProcessorWebService")
                      
public class OrderProcessorWebServiceImpl implements OrderProcessorWebService {

    private static final Logger LOG = Logger.getLogger(OrderProcessorWebServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vaham.ws.orderprocessor.OrderProcessorWebService#createAccount(com.vaham.ws.orderprocessor.Account  account )*
     */
    public boolean createAccount(Account account) { 
        LOG.info("Executing operation createAccount");
        System.out.println(account);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vaham.ws.orderprocessor.OrderProcessorWebService#confirmOrder(com.vaham.ws.orderprocessor.PurchaseOrder  shoppingCart ,)com.vaham.ws.orderprocessor.PaymentInfo  paymentInfo )*
     */
    public com.vaham.ws.orderprocessor.PurchaseOrder confirmOrder(PurchaseOrder shoppingCart,PaymentInfo paymentInfo) { 
        LOG.info("Executing operation confirmOrder");
        System.out.println(shoppingCart);
        System.out.println(paymentInfo);
        try {
            com.vaham.ws.orderprocessor.PurchaseOrder _return = new com.vaham.ws.orderprocessor.PurchaseOrder();
            _return.setCdIdListString("CdIdListString-300556438");
            _return.setErrorString("ErrorString-1961990042");
            _return.setPurchaseOrderID(3950252539145878792l);
            com.vaham.ws.orderprocessor.Address _returnShippingAddress = new com.vaham.ws.orderprocessor.Address();
            _returnShippingAddress.setAddrID(-5408532451300497375l);
            _returnShippingAddress.setCountry("Country-527945575");
            _returnShippingAddress.setDetails("Details1031518030");
            _returnShippingAddress.setPhone("Phone595755723");
            _returnShippingAddress.setPostalCode("PostalCode63304651");
            _returnShippingAddress.setProvince("Province2014077498");
            _return.setShippingAddress(_returnShippingAddress);
            _return.setTotalPrice(0.44060913626427733);
            _return.setUsername("Username2139698328");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vaham.ws.orderprocessor.OrderProcessorWebService#createOrder(com.vaham.ws.orderprocessor.PurchaseOrder  purchaseOrder )*
     */
    public com.vaham.ws.orderprocessor.PurchaseOrder createOrder(PurchaseOrder purchaseOrder) { 
        LOG.info("Executing operation createOrder");
        System.out.println(purchaseOrder);
        try {
            com.vaham.ws.orderprocessor.PurchaseOrder _return = new com.vaham.ws.orderprocessor.PurchaseOrder();
            _return.setCdIdListString("CdIdListString-504424910");
            _return.setErrorString("ErrorString1620333929");
            _return.setPurchaseOrderID(3441987441331284934l);
            com.vaham.ws.orderprocessor.Address _returnShippingAddress = new com.vaham.ws.orderprocessor.Address();
            _returnShippingAddress.setAddrID(2904000509740356536l);
            _returnShippingAddress.setCountry("Country119815437");
            _returnShippingAddress.setDetails("Details-143916322");
            _returnShippingAddress.setPhone("Phone-1939795605");
            _returnShippingAddress.setPostalCode("PostalCode1578853262");
            _returnShippingAddress.setProvince("Province-1614590914");
            _return.setShippingAddress(_returnShippingAddress);
            _return.setTotalPrice(0.9133012438806033);
            _return.setUsername("Username-263775544");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vaham.ws.orderprocessor.OrderProcessorWebService#getAccount(java.lang.String  username ,)java.lang.String  password )*
     */
    public com.vaham.ws.orderprocessor.Account getAccount(java.lang.String username,java.lang.String password) { 
        LOG.info("Executing operation getAccount");
        System.out.println(username);
        System.out.println(password);
        try {
            com.vaham.ws.orderprocessor.Account _return = new com.vaham.ws.orderprocessor.Account();
            com.vaham.ws.orderprocessor.Address _returnAddress = new com.vaham.ws.orderprocessor.Address();
            _returnAddress.setAddrID(3383273426719074245l);
            _returnAddress.setCountry("Country1668738794");
            _returnAddress.setDetails("Details276786068");
            _returnAddress.setPhone("Phone-479881914");
            _returnAddress.setPostalCode("PostalCode331137033");
            _returnAddress.setProvince("Province-381458162");
            _return.setAddress(_returnAddress);
            _return.setEmail("Email-1069337837");
            _return.setFirstName("FirstName-668309477");
            _return.setLastName("LastName-1794501786");
            _return.setPassword("Password405303110");
            _return.setUsername("Username1874464314");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
