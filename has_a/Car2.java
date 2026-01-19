package has_a;

public class Car2 {
    private Engine2 engine;         
    private MusicSystem music;      

    public Car2() {
        engine = new Engine2();      // Composition
    }

    public void setMusicSystem(MusicSystem music) {
        this.music = music;         // Aggregation
    }

    public MusicSystem getMusicSystem() {
        return music;
    }

    public static void main(String[] args) {
        Car2 car = new Car2();

        car.engine.start();                     
        car.setMusicSystem(new MusicSystem());  
        car.getMusicSystem().play();
    }
}

class Engine2 {
    public void start() {
        System.out.println("Engine started");
    }
}

class MusicSystem {
    public void play() {
        System.out.println("Music is playing");
    }
}

