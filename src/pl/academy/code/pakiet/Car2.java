package pl.academy.code.pakiet;

public class Car2 {
    private Car.Engine engine;

    public Car.Engine getEngine() {
        return engine;
    }

    public void setEngine(Car.Engine engine) {
        this.engine = engine;
    }

    public static class Engine {
        private int power;

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }
    }
}
