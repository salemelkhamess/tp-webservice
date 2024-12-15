package org.example.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "conersionEuroToFh")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*11;
    }

    @WebMethod
    public Compte getCOmpte(int code){
        return new Compte(code, 2000 + Math.random()*99000, new Date());
    }

    @WebMethod
    public List<Compte> compteList(){
        return  List.of(
                new Compte(1, 2000 +Math.random()*9000, new Date()),
                new Compte(2, 2000 +Math.random()*9000, new Date()),
                new Compte(3, 2000 +Math.random()*9000, new Date()),

                new Compte(4, 2000 +Math.random()*9000, new Date())

                );

    }


}
