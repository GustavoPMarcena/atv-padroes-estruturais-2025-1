package br.edu.ifpb.padroes.atv3.questao2.itens;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Combo implements Item{
    private List<Item> itens = new ArrayList<>();

    public void addItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    @Override
    public String getDescription() {
        return itens.stream().map(Item::getDescription).collect(Collectors.joining(", "));
    }

    @Override
    public BigDecimal getPrice() {
        return itens.stream().map(Item::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
