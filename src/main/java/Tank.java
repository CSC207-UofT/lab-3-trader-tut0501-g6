interface TradableDrivable extends Tradable, Drivable{}

public class Tank implements TradableDrivable{
    private int price;
    private int speed;
    /**
     * Construct a Tank.
     *
     * @param colour Colour of the tank.
     *
     */
    public Tank(int price){
        this.colour = colour;
        this.price = price;
        this.speed = 0
    }

    /**
     * Return the price of this tank.
     **/
    public int getPrice(){
        return price;
    }

    /**
     * Increase the maximum speed of this Vehicle.
     **/
    public void upgradeSpeed(){speed++;}

    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    public void downgradeSpeed(){speed--;}

    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return    The current maximum speed of this Vehicle.
     **/
    int getMaxSpeed(){return this.speed};
}
