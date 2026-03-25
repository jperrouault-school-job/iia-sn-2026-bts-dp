package fr.formation;

import java.util.List;

public class ProduitRepositoryCacheProxy extends ProduitRepository {
    private static ProduitRepositoryCacheProxy instance;

    private final ProduitRepository repository;
    private List<Produit> cache;

    private ProduitRepositoryCacheProxy(ProduitRepository repository) {
        this.repository = repository;
    }

    public static ProduitRepositoryCacheProxy getInstance(ProduitRepository repository) {
        if (instance == null) {
            instance = new ProduitRepositoryCacheProxy(repository);
        }

        return instance;
    }

    @Override
    public List<Produit> findAll() {
        if (this.cache == null) {
            System.out.println("Mise en cache ...");
            this.cache = this.repository.findAll();
        }

        return this.cache;
    }
}
