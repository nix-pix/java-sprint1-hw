public class Converter {

    static double convertDistance(int steps) { // шаги в км
        double distanse = steps * 0.00075;
        return distanse;
    }

    static double convertEnergy(int steps) { // шаги в килокалории
        double energy = steps * 0.05;
        return energy;
    }
}
