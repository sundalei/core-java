package sample.c308.intermediate.datetimedemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class is used to represent arbitrary precision decimal numbers.
 * It provides ways to set the number of significant digits and configure
 * how numbers should be rounded.
 * This class should be used for all calculations involving currency.
 */
public class BigDecimalDemo {

    public static void main(String[] args) {
        /*
        BigDecimal is an immutable type (just like String).
        That means that a BigDecimal object's value can't be changed once it is set.
        From a practical standpoint, that means that you must set the result of
        any BigDecimal operation to another BigDecimal variable.

        Precision
        Each of the numbers below has a precision of 5:
        2.5973
        87.654
        2345.3

        Scale
         The scale value is the number of digits to the right of the decimal point
         When dealing with currency calculations, we will use a scale value of 2.
         1.9974: scale = 4
         56.754: scale = 3
         1234.3: scale = 1

         ROUNDING_MODES are
         CEILING	Rounds towards positive infinity
         DOWN	Rounds towards zero
         FLOOR	Rounds towards negative infinity
         HALF_DOWN	Rounds towards the nearest neighbor unless both neighbors are equidistant, in which case it rounds down
         HALF_EVEN	Rounds towards the nearest neighbor unless both neighbors are equidistant, in which case it rounds towards the even neighbor
         HALF_UP	Rounds towards the nearest neighbor unless both neighbors are equidistant, in which case it rounds up
         UNNECESSARY	Asserts that the requested operation has an exact result so there is no need to round
         UP	Rounds away from zero
         */

        BigDecimal a = new BigDecimal("42.356");
        System.out.println(a);

        BigDecimal b = a.setScale(1, RoundingMode.HALF_UP); //ROUNDING MODE has to be defined
        System.out.println(b.toString());

        b = a.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println(b.toString());

        b = a.setScale(1, RoundingMode.UP);
        System.out.println(b.toString());

        b = a.setScale(1, RoundingMode.DOWN);
        System.out.println(b.toString());
    }
}
