package Day_5.Interfaces_Sample;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
