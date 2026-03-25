package fr.formation;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProduitRepositoryDecorator extends ProduitRepository implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private final ProduitRepository repository;

    // public ProduitRepositoryDecorator(ProduitRepository repository) {
    //     this.repository = repository;
    // }

    @Override
    public List<Produit> findAll() {
        this.publish();

        return this.repository.findAll();
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
