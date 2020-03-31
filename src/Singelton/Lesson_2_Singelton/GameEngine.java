package Singelton.Lesson_2_Singelton;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance;


    private GameEngine() {

    }

    public void run() {
        while (true) {
            //czekamy na imput gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;



    }
}
