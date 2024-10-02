package diningphilosophers;

import java.io.IOException;

public class Table {

    public static void main(String[] args) {
        ChopStick baguette1 = new ChopStick();
        ChopStick baguette2 = new ChopStick();
        ChopStick baguette3 = new ChopStick();
        Philosopher sb = new Philosopher("Barreau", baguette1, baguette2); sb.start();
        Philosopher ac = new Philosopher("Combes", baguette2, baguette3); ac.start();
        Philosopher rb = new Philosopher("Bastide", baguette3, baguette1); rb.start();
        // Arrêter le programme lors d'une touche au clavier
        try {
            System.in.read();
        } catch (IOException ex) {}
        sb.leaveTable();
        ac.leaveTable();
        rb.leaveTable();
    }
}

//Réponses aux questions:
// Combien y a-t-il donc de baguettes ?  : Il y a 3 baguettes
// Question 1 : L'utilisation des blocs synchronisés et des fonctions wait() et notifyAll()
// c'est pour vérifier que les philosophes attendent que les baguettes soient prises et qu'il soient notifiés quand les baguettes sont libérées. 
// Question 2 : C'est un deadlock, il apparaît car chaque philosophe attend que l'un relâche la baguette que lui-même tient. 
