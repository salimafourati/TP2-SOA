package serveur;

import javax.xml.ws.Endpoint;
import service.Calculatrice;

public class ServeurJWS {

    public static void main(String[] args) {
        String url = "http://localhost:8080/calculatrice";

        Endpoint.publish(url, new Calculatrice());

        System.out.println("Service SOAP publié !");
        System.out.println("WSDL : " + url + "?wsdl");
    }
}

