package Singleton.Singleton_Lesson;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionUID = 232323223;

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
            synchronized (GameEngine.class){
                if(instance ==null){
                    instance = new GameEngine();
                }
            }

        }
        return instance;



    }
    protected Object readResolve(){
        return getInstance();
    }
}
