package sw02;

/**
 * The Temperatur class represents the temperature in different si units.
 * It memorizes the temperature in Celsius degree but is able to calculate to Fahrenheit or Kelvin.
 * It includes identifying the aggregate state of different elements by remembering their boiling and melting point.
 *
 * @author Sacha Vogel
 * @version 0.0.1
 */
public class Temperatur {

    private double celsius;

    Temperatur() {
        this(20);
    }

    Temperatur(final double celsius) {
        setCelsius(celsius);
    }

    public static Temperatur createFromCelsius(final double celsius) {
        return new Temperatur(celsius);
    }

    public static Temperatur createFromKelvin(final double kelvin) {
        return createFromCelsius(kelvin - 273.15);
    }

    /**
     * Calculate the current temperature in Kelvin.
     * The current temperature is memorized in Celsius degree.
     *
     * @return temperature converted to Kelvin
     */
    public double calculateKelvin() {
        return celsius + 273.15;
    }

    /**
     * Calculate the current temperature in Fahrenheit.
     * The current temperature is memorized in Celsius degree.
     *
     * @return temperature converted to Fahrenheit
     */
    public double calculateFahrenheit() {
        return celsius * 1.8f + 32;
    }

    /**
     * Add a number of Celsius to the current temperature.
     *
     * @param relativeCelsius
     *        Number of Celsius to add to the current temperature
     */
    public void addCelsius(final double relativeCelsius) {
        setCelsius(celsius + relativeCelsius);
    }

    /**
     * Add a number of Kelvin to the current temperature.
     * The current temperature is memorized in Celsius degree.
     *
     * @param relativeKelvin
     *        Number of Kelvin to add to the current temperature
     */
    public void addKelvin(final double relativeKelvin) {
        setCelsius(celsius + relativeKelvin);
    }

    /**
     * Add a number of Fahrenheit to the current temperature.
     * The current temperature is memorized in Celsius degree.
     *
     * @param relativeFahrenheit
     *        Number of Fahrenheit to add to the current temperature
     */
    public void addFahrenheit(final double relativeFahrenheit) {
        var calculatedFahrenheit = calculateFahrenheit() + relativeFahrenheit;
        setCelsius((calculatedFahrenheit - 32) / 1.8);
    }

    /**
     * Returns the current temperature in Celsius degree.
     *
     * @return current temperature in Celsius
     */
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius > 3000 || celsius < -3000) {
            throw new IllegalArgumentException("This temperature is not allowed");
        }
        this.celsius = celsius;
    }

    public String identifyAggregateState(Element element, double temperatureCelsicus) {
        return switch (element) {
            case STICKSTOFF -> identifyAggregateState(-196, -210.1, temperatureCelsicus);
            case QUECKSILBER -> identifyAggregateState(357,-38.83, temperatureCelsicus);
            case BLEI -> identifyAggregateState(1744, 327.43, temperatureCelsicus);
        };
    }

    private String identifyAggregateState(double boilingPoint, double meltingPoint, double current) {
        if (current >= boilingPoint) {
            return "boiled";
        } else if (current <= meltingPoint) {
            return "melted";
        }
        return "solid";
    }

    enum Element {
        STICKSTOFF("N"),
        QUECKSILBER("Hg"),
        BLEI("Pb");

        private String symbol;

        Element(final String symbol) {
            this.symbol = symbol;
        }
    }
}
