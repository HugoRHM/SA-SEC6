// Hugo Ricardo Hernández Montejano 
// Revisado por los Mictlanes
// Califican: 5 

package org.generation.otros6;

import java.util.Scanner;

public class Codigo6 {

    public static void main(String[] args) {
        int[] n = new int[20];
        Scanner scanner = new Scanner(System.in);
        //Se utilizo solo Random para los numeros
        for (int i = 0; i < 20; i++) {
            n[i] = (int) (Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }

        System.out.println("\n¿Qué números quiere resaltar?");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int opcion = scanner.nextInt();

        int multiplo = (opcion == 1) ? 5 : 7;
        //Se eliminó el bucle foreach y se usó un 
        //bucle for normal para iterar sobre la matriz n.
        for (int e : n) {
            if (e % multiplo == 0) {
            	// Se corrigieron los system.console
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }
        }

        scanner.close();
    }
}


