package fr.formation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProduitRepository {
    public List<Produit> findAll() {
        List<Produit> produits = new ArrayList<>();

        System.out.println("Chargement des données ...");

        produits.add(Produit.builder()
            .nom("Parachute de France")
            .prix(new BigDecimal("9500"))
            .build()
        );

        produits.add(Produit.builder()
            .nom("Casque de moto")
            .prix(new BigDecimal("499.95"))
            .build()
        );

        return produits;
    }
}
