
public class Apartment {

    private final int rooms;
    private final int squareMeters;
    private final int pricePerSquareMeter;
    private final int fullPrice;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.fullPrice = this.squareMeters * this.pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(this.fullPrice - otherApartment.fullPrice);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.fullPrice > otherApartment.fullPrice;
    }
            
    
}
