import proxy.BanqueServvice;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueServvice stub=new BanqueWS().getBanqueServvicePort();
        System.out.println(stub.convert(7600));
        Compte cp=stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
