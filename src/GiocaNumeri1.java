/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Studenti
 */



public class GiocaNumeri1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("INIZIO");
            Giocatore g1 = new Giocatore("francesco");
            Thread tg1=new Thread (g1);
            tg1.start();

            Thread.currentThread().sleep(5000);
            Giocatore g2 = new Giocatore("malena");
            Thread tg2=new Thread (g2);
            tg2.start();
            System.out.println("FINE");
        }catch (InterruptedException ex) {
            ex.printStackTrace();
            System.err.println(ex.toString());
        }

    }

}

