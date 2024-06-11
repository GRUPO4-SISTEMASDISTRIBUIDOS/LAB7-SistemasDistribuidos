
package es.rosamarfil.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SOAPI", targetNamespace = "http://soap.rosamarfil.es/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SOAPI {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://soap.rosamarfil.es/", className = "es.rosamarfil.soap.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://soap.rosamarfil.es/", className = "es.rosamarfil.soap.AddUserResponse")
    @Action(input = "http://soap.rosamarfil.es/SOAPI/addUserRequest", output = "http://soap.rosamarfil.es/SOAPI/addUserResponse")
    public void addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @return
     *     returns java.util.List<es.rosamarfil.soap.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://soap.rosamarfil.es/", className = "es.rosamarfil.soap.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://soap.rosamarfil.es/", className = "es.rosamarfil.soap.GetUsersResponse")
    @Action(input = "http://soap.rosamarfil.es/SOAPI/getUsersRequest", output = "http://soap.rosamarfil.es/SOAPI/getUsersResponse")
    public List<User> getUsers();

}
