public class theater {

    private seat[][] seats;

    public theater(int spr, int t1r, int t2r){
        seats = new seat[t1r+t2r][spr]; // +1 pt
        for(int r = 0; r < seats.length; r++){ // +1
            for(int c = 0; c < seats[r].length; c++){
                if(r < t1r){ //+1
                    seats[r][c] = new seat(true, 1); // +1 +1
                }else{
                    seats[r][c] = new seat(true, 2);
                }
            }
        }
    }

    public boolean switchSeat(int fr, int fc, int tr, int tc){
        seat currSeat = seats[fr][fc]; // +1
        seat toSeat = seats[tr][tc];
        int currTier = currSeat.getTier(); //+1
        int toTier = toSeat.getTier();
        boolean avail = toSeat.isAvailable();

        if((currTier <= toTier)&& avail){ //+1
            toSeat.setAvailability(false);
            currSeat.setAvailability(true);
            return true; //+1
        }

        return false;
    }
}
