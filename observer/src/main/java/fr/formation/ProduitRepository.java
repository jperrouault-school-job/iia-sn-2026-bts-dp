package fr.formation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProduitRepository implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public List<Produit> findAll() {
        List<Produit> produits = new ArrayList<>();

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

        this.publish();

        return produits;
    }

    @Override
    public void subscribe(Subscriber sub) {
        this.subscribers.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub) {
        this.subscribers.remove(sub);
    }

    @Override
    public void publish() {
        for (Subscriber sub : subscribers) {
            sub.update(this);
        }
    }
}
