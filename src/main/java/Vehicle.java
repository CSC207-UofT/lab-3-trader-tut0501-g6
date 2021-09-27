public class Vehicle implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;
    public Vehicle() {
        this.maxSpeed = 10;
    }

    @Override
    public String sound() {
        return "Vroom";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}