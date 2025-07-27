package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double roundToHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.DOWN).doubleValue();
    }

    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number) {
        return number.negate().setScale(1, RoundingMode.DOWN);
    }
}