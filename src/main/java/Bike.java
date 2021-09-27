/* A Bike that is Tradable and Driveable.
 */
public class Bike implements Tradable, Drivable {
    private int maxSpeed;

    public Bike() {
        this.maxSpeed = 1;
    }

    /**
     * Increase the maximum speed of this Vehicle.
     **/
    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return The current maximum speed of this Vehicle.
     **/
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
