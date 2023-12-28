package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversionEutoToDH")
    public double convertEuroToDH(@WebParam(name = "montant") double euroMT){
        return euroMT*10.9;
    }
    @WebMethod(operationName = "convertDHToEuro")
    public double convertDHToEuro(@WebParam(name = "montant") double dhMT){
        return dhMT*(1 /10.9 );
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, Math.random()*97000, new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, Math.random()*97000, new Date()),
                new Compte(2, Math.random()*97000, new Date()),
                new Compte(3, Math.random()*97000, new Date())
        );
    }
}
