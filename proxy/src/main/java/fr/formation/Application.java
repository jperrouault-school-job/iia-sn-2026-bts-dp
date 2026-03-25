package fr.formation;

import java.util.List;

public class Application {
    public static boolean hasAccess = true;

    public static void main(String[] args) {
        ProduitRepository produitRepository = RepositoryFactory.creerProduitRepository();

        List<Produit> produits = produitRepository.findAll();

        System.out.println(produits);

        Application.hasAccess = false;
        produits = produitRepository.findAll();
        System.out.println(produits);

        Application.hasAccess = true;
        produits = produitRepository.findAll();
        System.out.println(produits);
    }
}
