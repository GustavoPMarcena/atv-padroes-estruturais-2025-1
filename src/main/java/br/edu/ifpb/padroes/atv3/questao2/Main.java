package br.edu.ifpb.padroes.atv3.questao2;

import br.edu.ifpb.padroes.atv3.questao2.itens.Combo;
import br.edu.ifpb.padroes.atv3.questao2.itens.SimpleItem;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        SimpleItem item = new SimpleItem("Arroz com tapioca de bolo", BigDecimal.valueOf(12.50));
        SimpleItem bebida = new SimpleItem("Suco de Laranja com sal", BigDecimal.valueOf(5.00));
        SimpleItem sobremesa = new SimpleItem("Pudim", BigDecimal.valueOf(6.00));

        Combo lunchCombo = new Combo();
        lunchCombo.addItem(item);
        lunchCombo.addItem(bebida);

        Combo completeCombo = new Combo();
        completeCombo.addItem(lunchCombo);
        completeCombo.addItem(sobremesa);


        System.out.println("Preço do prato: " + item.getPrice());
        System.out.println("Preço do almoço: " + lunchCombo.getPrice());
        System.out.println("Preço do combo completo " + completeCombo.getPrice());

        System.out.println("Descrição do prato: " + item.getDescription());
        System.out.println("Descrição do comboAlmoço: " + lunchCombo.getDescription());
        System.out.println("Descrição do comboCompleto: " + completeCombo.getDescription());
    }
}
