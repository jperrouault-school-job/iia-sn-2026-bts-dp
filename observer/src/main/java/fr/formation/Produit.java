package fr.formation;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@Builder
public class Produit {
    private String nom;
    private BigDecimal prix;
}
