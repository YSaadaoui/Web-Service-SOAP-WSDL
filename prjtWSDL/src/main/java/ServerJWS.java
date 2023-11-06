import jakarta.xml.ws.Endpoint;
import ws.BanqueServvice;

public class ServerJWS
{
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8096/",new BanqueServvice());
        System.out.println("Web Service déployé sur  http://localhost:8096/ ");
    }
}
