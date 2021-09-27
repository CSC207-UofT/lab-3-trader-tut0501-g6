public class Cow implements Tradable, Domesticatable{

    private boolean isMilkable;
    public boolean toKill;

    public boolean isToKill() {
        return toKill;
    }

    public void setToKill(boolean toKill) {
        this.toKill = toKill;
    }

    @Override
    public String sound() {
        return "MOOOO";
    }

    public boolean isMilkable() {
        return isMilkable;
    }

    public void setMilkable(boolean milkable) {
        isMilkable = milkable;
    }

    @Override
    public int getPrice() {
        return 50;
    }

}
