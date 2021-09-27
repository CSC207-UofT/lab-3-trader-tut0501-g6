public class Racecar implements Tradable, Drivable {

    private int max_speed;

    Racecar(){
        this.max_speed = 352;
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    /**
     * Increase the maximum speed of this Vehicle.
     **/
    @Override
    public void upgradeSpeed() {
        this.max_speed++;
    }

    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    @Override
    public void downgradeSpeed() {
        this.max_speed--;
    }


    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return The current maximum speed of this Vehicle.
     **/
    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }

}
