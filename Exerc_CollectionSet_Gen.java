package exercicioCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exerc_CollectionSet_Gen {

	public static void main(String[] args) {
		Set<Integer> valores = new HashSet<>();


        Scanner leia = new Scanner(System.in);

        
        System.out.println("Digite 10 valores inteiros não repetidos:");

        while (valores.size() < 10) {
            try {
                int valor = Integer.parseInt(leia.nextLine());

                
                if (valores.add(valor)) {
                    System.out.println("Valor adicionado com sucesso!");
                } else {
                    System.out.println("Valor repetido! Digite um valor não repetido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor inteiro válido.");
            }
        }

       
        leia.close();

       
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = valores.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

	}
