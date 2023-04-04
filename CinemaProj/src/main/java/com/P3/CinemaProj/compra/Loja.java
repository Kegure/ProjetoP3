package com.P3.CinemaProj.compra;

import com.P3.CinemaProj.itens.Item;
import com.P3.CinemaProj.usuario.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    private ArrayList<Item> carrinho = new ArrayList<>();
    private ArrayList<Item> inventarioCliente;
    private Pessoa cliente;

    public Loja(ArrayList<Item> itens,Pessoa cliente) {
        this.inventarioCliente = itens;
        this.cliente = cliente;
    }

    public void transferirCarrinhoParaInventario() {
        inventarioCliente.addAll(carrinho);
        carrinho.clear();
    }
    public void adicionarItem(int itemId,int quantidade) {
        for (Item meuItem : Item.values()) {
            if (meuItem.getItemID() == itemId) {
                carrinho.add(meuItem);
                meuItem.setQuantidade(quantidade);
                break;
            }
        }
    }
    private double valorTotal() {
        double total = 0;
        for (Item item : carrinho) {
            total += item.getPreco()*item.getQuantidade();
        }
        return total;
    }
    public void cancelarTodosItens(){
        carrinho.clear();
    }

    public void comprar(){
        Scanner in = new Scanner(System.in);
        int op;
        int qtd;
        do{
            menuLoja();
            op = in.nextInt();
            switch(op){
                case 1:
                    System.out.println("Qual a quantidade desse produto que voçe deseja Senhor(A) " +cliente.getNome()+"?");
                    qtd = in.nextInt();
                    adicionarItem(1,qtd);
                    break;
                case 2:
                    System.out.println("Qual a quantidade desse produto que voçe deseja Senhor(A) " +cliente.getNome()+"?");
                    qtd = in.nextInt();
                    adicionarItem(2,qtd);
                    break;
                case 3:
                    System.out.println("Qual a quantidade desse produto que voçe deseja Senhor(A) " +cliente.getNome()+"?");
                    qtd = in.nextInt();
                    adicionarItem(3,qtd);
                    break;
                case 4:
                    System.out.println("Qual a quantidade desse produto que voçe deseja Senhor(A) " +cliente.getNome()+"?");
                    qtd = in.nextInt();
                    adicionarItem(4,qtd);
                    break;
                case 5:
                    System.out.println("Qual a quantidade desse produto que voçe deseja Senhor(A) " +cliente.getNome()+"?");
                    qtd = in.nextInt();
                    adicionarItem(5,qtd);
                    break;
                case 6:
                    System.out.println("Qual a quantidade desse produto que voçe deseja Senhor(A) " +cliente.getNome()+"?");
                    qtd = in.nextInt();
                    adicionarItem(6,qtd);
                    break;
                case 0:
                    System.out.println("Carrinho Encerrado");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente");
                    comprar();
                    break;
            }
        }while(op != 0);
        char op2;
        do{
            if(carrinho.isEmpty()){
                System.out.println("Saindo das compras voce adiconou nada no seu carrinho");
                op2 = 'N';
            }else{
                System.out.println("O valor total é de "+valorTotal()+"\n deseja concluir a compra?(S/N)");
                op2 = Character.toUpperCase(in.next().charAt(0));
                if(op2 == 'S'){
                    transferirCarrinhoParaInventario();
                    System.out.println("Compra realizada com o Numero de cartao :"+cliente.getNumeroCartao());
                }else if(op2 == 'N'){
                    System.out.println("Compra cancelada!");
                    cancelarTodosItens();
                }else{
                    System.out.println("Opcao invalida tente novamente");
                }
            }
        }while(op2 != 'N' && op2 !='S');
    }
    private void menuLoja(){
        System.out.println("Digite o id correspondente para comprar:");
        System.out.println("1 - Pipoca 40 R$");
        System.out.println("2 - Refrigerante 8 R$");
        System.out.println("3 - Doce 5 R$");
        System.out.println("4 - Taça de Vinho 23 R$");
        System.out.println("5 - Cobertor 20 R$");
        System.out.println("6 - Travesseiro 20 R$");
        System.out.println("0 - Encerrar Carrinho");
    }
}