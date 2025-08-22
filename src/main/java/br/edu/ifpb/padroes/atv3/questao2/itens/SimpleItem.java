package br.edu.ifpb.padroes.atv3.questao2.itens;

import java.math.BigDecimal;

public class SimpleItem implements Item{

    private String description;
    private BigDecimal price;

    public SimpleItem(String description, BigDecimal price) {
        this.description = description;
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
