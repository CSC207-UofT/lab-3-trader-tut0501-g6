public class Dragon implements Domesticatable, Drivable, Tradable {
    private int maxSpeed;
    private String element;
    private int price;

    public Dragon(boolean isIceDragon, int p){
        this.price = p;
        if (isIceDragon){
            this.element = "Ice";
        }else {
            this.element = "Fire";
        }
        this.maxSpeed = 100;
    }
    @Override
    public String sound() {
        if (this.element.equals("Ice")){
            return "FIRE BALL!!!!!!!!";
        }else {
            return "ICE BALL!!!!!!!!!";
        }

    }

    @Override
    public void upgradeSpeed() {
        maxSpeed ++;
    }

    @Override
    public void downgradeSpeed() {
        maxSpeed --;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
