package Singleton.Singleton_Lesson;

public enum GameEngineEnum {
    INSTANCE("Duke");

    private int hp = 100;
    private String characherName = "";

    private GameEngineEnum(String name){
        this.characherName = name;
    }

    public void run() {
        while (true) {
            //czekamy na imput gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }
}
