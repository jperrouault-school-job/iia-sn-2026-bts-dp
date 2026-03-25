package fr.formation;

public class RepositoryFactory {
    private RepositoryFactory() { }

    public static ProduitRepository creerProduitRepository() {
        ProduitRepository produitRepository = new ProduitRepository();

        // produitRepository = new ProduitRepositoryCacheProxy(produitRepository);
        produitRepository = ProduitRepositoryCacheProxy.getInstance(produitRepository);
        produitRepository = new ProduitRepositoryAccessProxy(produitRepository);

        return produitRepository;
    }
}
