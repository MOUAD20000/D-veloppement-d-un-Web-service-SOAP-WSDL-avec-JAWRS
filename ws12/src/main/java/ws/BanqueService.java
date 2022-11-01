package ws;

import java.util.Date;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

//pojo  Plain old java object

@WebService(serviceName = "BanqueWs")
public class BanqueService {

    @WebMethod(operationName = "Convert")
    public double conversion( @WebParam(name = "Montant") double mt){
        return mt*10.50 ;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*9888,new Date());
    }

    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                       new Compte(1,Math.random()*9888,new Date()),
                       new Compte(2,Math.random()*9888,new Date()),
                       new Compte(3,Math.random()*9888,new Date())
                 );
    }
}
