package tv.codely.checkout;

public class TieredPricing {
    public int totalPriceForUnits(int units) {
        if (units < 3) {
            return 299 * units;
        }
        return 239 * units;
    }
}
