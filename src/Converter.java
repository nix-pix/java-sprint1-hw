public class Converter {

    double convertStepsIntoDistance(int steps) {
        double distanse = steps * 0.00075;
        return distanse;
    }

    double convertStepsIntoEnergy(int steps) {
        double energy = steps * 0.05;
        return energy;
    }
}
