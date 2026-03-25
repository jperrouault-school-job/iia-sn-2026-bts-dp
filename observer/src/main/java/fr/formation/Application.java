package fr.formation;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ProduitRepository produitRepository = new ProduitRepository();
        MailSubscriber mailSubscriber = new MailSubscriber();
        LogSubscriber logSubscriber = new LogSubscriber();

        produitRepository.subscribe(logSubscriber);
        produitRepository.subscribe(mailSubscriber);

        List<Produit> produits = produitRepository.findAll();

        System.out.println(produits);
    }
}
