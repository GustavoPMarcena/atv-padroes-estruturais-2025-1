package br.edu.ifpb.padroes.atv3.questao2;

import br.edu.ifpb.padroes.atv3.questao2.itens.Combo;
import br.edu.ifpb.padroes.atv3.questao2.itens.SimpleItem;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        SimpleItem prato = new SimpleItem("Arroz com tapioca de bolo", BigDecimal.valueOf(12.50));
        SimpleItem bebida = new SimpleItem("Suco de Laranja com sal", BigDecimal.valueOf(5.00));
        SimpleItem sobremesa = new SimpleItem("Pudim", BigDecimal.valueOf(6.00));

        Combo comboAlmoco = new Combo();
        comboAlmoco.addItem(prato);
        comboAlmoco.addItem(bebida);

        Combo comboCompleto = new Combo();
        comboCompleto.addItem(comboAlmoco);
        comboCompleto.addItem(sobremesa);


        System.out.println("Preço do prato: " + prato.getPrice());
        System.out.println("Preço do comboAlmoço: " + comboAlmoco.getPrice());
        System.out.println("Preço do comboCompleto: " + comboCompleto.getPrice());

        System.out.println("Descrição do prato: " + prato.getDescription());
        System.out.println("Descrição do comboAlmoço: " + comboAlmoco.getDescription());
        System.out.println("Descrição do comboCompleto: " + comboCompleto.getDescription());
    }
}
