package fr.formation;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ProduitRepository produitRepository = new ProduitRepository();
        MailSubscriber mailSubscriber = new MailSubscriber();
        LogSubscriber logSubscriber = new LogSubscriber();

        produitRepository = new ProduitRepositoryDecorator(produitRepository);

        ((Publisher)produitRepository).subscribe(logSubscriber);
        ((Publisher)produitRepository).subscribe(mailSubscriber);

        List<Produit> produits = produitRepository.findAll();

        System.out.println(produits);
    }
}
