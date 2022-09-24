public class Converter {

    static double convertDistance(int steps) { // шаги в км
        double distance;
        distance = steps * 0.00075;
        return distance;
    }

    static double convertEnergy(int steps) { // шаги в килокалории
        double energy;
        energy = steps * 0.05;
        return energy;
    }
}
