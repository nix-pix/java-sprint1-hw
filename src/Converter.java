public class Converter {

    static double convertDistance(int steps) {
        double distanse = steps * 0.00075;
        return distanse;
    }

    static double convertEnergy(int steps) {
        double energy = steps * 0.05;
        return energy;
    }
}
