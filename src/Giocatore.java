/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Studenti
 */
public class Giocatore implements Runnable
{
    String nome;
    String parola;
    int punteggio;




    public Giocatore(String nome){
        this.nome=nome;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola=parola;
    }

    public int getPunteggio(){
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio=punteggio;
    }




    public void gioca(){
        long tempoInizio = System.currentTimeMillis();
        int numero = 10;
        String parola="divertiti";
        setParola(parola);


        for(int i=0;i<numero;i++){
            System.out.println("giocatore :" + nome + "i: "+i);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("errore nella transazione da RUNNING A SLEEPING");
            }
        }

        setPunteggio(100);

        System.out.println("giocatore :" + nome + "parola: "+getParola()+"punteggio: "+punteggio);
        Long tempoFine = System.currentTimeMillis();
        System.out.println("giocatore : "+nome + "tempo: " + (tempoFine-tempoInizio)/1000 + " secondi");
    }

    public void comunica(){
    }

    @Override
    public void run(){
        gioca();
    }
}
