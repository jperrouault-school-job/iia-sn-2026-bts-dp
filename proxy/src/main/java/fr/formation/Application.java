package fr.formation;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ProduitRepository produitRepository = new ProduitRepository();

        List<Produit> produits = produitRepository.findAll();

        System.out.println(produits);
    }
}
