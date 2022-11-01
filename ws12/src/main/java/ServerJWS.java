import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

import java.time.Clock;

public class ServerJWS {
    public static void main(String[] args){
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("web service deployed sur \"http://0.0.0.0:9191\"  ");
    }
}
