public class seat {
    private boolean avail;
    private int tier;

    public seat(boolean available, int tier){
        avail = available;
        this.tier = tier;
    }

    public int getTier(){
        return tier;
    }

    public boolean isAvailable(){
        return avail;
    }

    public void setAvailability(boolean a){
        avail = a;
    }
}
