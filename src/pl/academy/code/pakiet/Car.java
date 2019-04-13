package pl.academy.code.pakiet;

public class Car {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }

    public class Engine {
        private int power;

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }
    }
}
