/*
Julio Cesar Menezes Carvalho RA: 20999569
José Eduardo Pedralino da Silva RA: 20934383
*/

package apparvorebinariadebusca;

import java.util.Scanner;

public class AppArvoreBinariaDeBusca {

    public static void main(String[] args) {
        
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();
        Scanner e = new Scanner(System.in);
        int opcao;
        
        do {
            
            System.out.println("Digite:");
            System.out.println("1 - Inserir novo elemento");
            System.out.println("2 - Remover um elemento");
            System.out.println("3 - Buscar um elemento");
            System.out.println("4 - Imprimir usando pré-ordem");
            System.out.println("5 - Imprimir usando em-ordem");
            System.out.println("6 - Imprimir usando pós-ordem");
            System.out.println("7 - Sair");
            
            
            opcao = e.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite novo elemento");
                    arvore.inserir(e.nextInt());
                    break;
                case 2:
                    System.out.println("Digite elemento a ser removido");
                    if(arvore.remover(e.nextInt())) {
                        System.out.println("Elemento removido com sucesso");
                    }
                    else {
                        System.out.println("Elemento não pôde ser removido");
                    }
                    break;
                case 3:
                    System.out.println("Digite o elemento a ser buscado");
                    if(arvore.buscar(e.nextInt()) != false) {
                        System.out.println("Elemento encontrado");
                    }
                    else {
                        System.out.println("Elemento não encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Árvore em pré-ordem: " + arvore.preOrdem());
                    break;
                case 5:
                    System.out.println("Árvore em em-ordem: " + arvore.emOrdem());
                    break;
                case 6:
                    System.out.println("Árvore em pós-ordem: " + arvore.posOrdem());
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            
            
        } while (opcao != 7);
        
        
    }
    
}
