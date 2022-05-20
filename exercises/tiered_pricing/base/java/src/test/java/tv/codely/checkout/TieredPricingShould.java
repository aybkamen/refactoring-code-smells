package tv.codely.checkout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TieredPricingShould {

    @Test
	void calculate_price_for_1_unit() {

        TieredPricing tieredPricing = new TieredPricing();

        assertEquals(299, tieredPricing.totalPriceForUnits(1));
	}

    @Test
    void calculate_price_for_2_units() {

        TieredPricing tieredPricing = new TieredPricing();

        assertEquals(598, tieredPricing.totalPriceForUnits(2));
    }

    @Test
    void calculate_price_for_3_units() {

        TieredPricing tieredPricing = new TieredPricing();

        assertEquals(717, tieredPricing.totalPriceForUnits(3));
    }
}
