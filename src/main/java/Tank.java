interface TradableDrivable extends Tradable, Drivable{}

public class Tank implements TradableDrivable{
    private int price;
    private int speed;
    /**
     * Construct a Tank.
     *
     * @param price Price of the tank.
     *
     */
    public Tank(int price){
        this.price = price;
        this.speed = 0;
    }

    /**
     * Return the price of this tank.
     **/
    public int getPrice(){
        return price;
    }

    @Override
    /**
     * Increase the maximum speed of this Vehicle.
     **/
    public void upgradeSpeed(){speed++;}

    @Override
    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    public void downgradeSpeed(){speed--;}

    @Override
    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return    A tank.
     **/
    public int getMaxSpeed(){return this.speed;}
}
