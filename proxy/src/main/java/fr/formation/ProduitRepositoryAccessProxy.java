package fr.formation;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProduitRepositoryAccessProxy extends ProduitRepository {
    private final ProduitRepository repository;

    @Override
    public List<Produit> findAll() {
        if (Application.hasAccess) {
            return this.repository.findAll();
        }

        return new ArrayList<>();
    }
}
