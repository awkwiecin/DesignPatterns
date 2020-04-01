package Singleton.Singleton_Practice;


import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Serializable {


    private static final long serialVersionUID = 232323223;

    public static GuessGame Instance = new GuessGame();
    public int score = 0;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public static GuessGame getInstance() {
        return Instance;
    }

    public int getScore() {
        return score;
    }

    protected Object readResolve(){
        return Instance;
    }

    public void play(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("--------------------");
            System.out.print("Podaj liczbe: ");
            int guess = scanner.nextInt();
            int number = random.nextInt(9);
            if(number == guess){
                System.out.println("Udało się!");
                score++;
            }else System.out.println("Nie udało, szukana liczba to:  "+ number);
            }
        System.out.println("<><><><><><><><><><><><><><><>");
        System.out.println("Twój wynik to: "+score);

        }
    }

