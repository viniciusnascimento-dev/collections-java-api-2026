package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensList;

    public CarrinhoDeCompras(){
        this.itensList = new ArrayList<>();
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itensList) {
            if (item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        itensList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item item : itensList){
            total += (item.getPreco() * item.getQuantidade());
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(itensList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    }
}
