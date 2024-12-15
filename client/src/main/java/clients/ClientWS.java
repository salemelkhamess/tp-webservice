package clients;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService banqueService = new BanqueWS().getBanqueServicePort();
        System.out.println(banqueService.conersionEuroToFh(600));
       System.out.println("-----------------------------");
        Compte cp = banqueService.getCOmpte(3);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
        System.out.println("------------------------------");
        List<Compte> compteList = banqueService.compteList();
        System.out.println("------------------------------");
        compteList.forEach(compte -> {
            System.out.println(compte.getCode());
            System.out.println(compte.getSolde());
            System.out.println(compte.getDateCreation());

        });

        System.out.println("------------------------------");



    }
}
