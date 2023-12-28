package org.sid;


import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    BanqueService banqueService = new BanqueWS().getBanqueServicePort();
    System.out.println(banqueService.convertDHToEuro(200));
    System.out.println(banqueService.conversionEutoToDH(200));
    Compte compte=banqueService.getCompte(9);
    System.out.println("---------");
    System.out.println(compte.getCode());
    System.out.println(compte.getSolde());
    List<Compte> comptes=banqueService.listComptes();
    comptes.forEach (cp->{
    System.out.println("----------");
    System.out.println(cp.getCode());
    System.out.println(cp.getSolde());
    });
    }
}

