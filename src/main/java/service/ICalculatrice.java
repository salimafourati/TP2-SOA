package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ICalculatrice {

    @WebMethod
    int somme(
            @WebParam(name = "a") int a,
            @WebParam(name = "b") int b
    );

    @WebMethod
    int multiplication(
            @WebParam(name = "a") int a,
            @WebParam(name = "b") int b
    );

    @WebMethod
    int soustraction(
            @WebParam(name = "a") int a,
            @WebParam(name = "b") int b
    );

    @WebMethod
    double division(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );
}

