public class StepTracker {

    static int stepGoal = 10000;
    static int stepsInMonth;
    static int[][] stepsMonthDayData = new int[12][30];

    static void setStepGoal(int steps) { // установка цели
        stepGoal = steps;
    }

    static void addSteps(int month, int day, int steps) { // ввести шаги за день
        stepsMonthDayData[month-1][day-1] = steps;
    }

    static void showStepsByDays(int month) { // 1 шаги по дням
        for (int i = 0; i < stepsMonthDayData[month - 1].length; i++) {
            if (i == stepsMonthDayData[month - 1].length - 1) {
                System.out.println((i + 1) + " день: " + stepsMonthDayData[month - 1][i] + ". ");
                break;
            }
            System.out.print((i + 1) + " день: " + stepsMonthDayData[month - 1][i] + ", ");
        }
    }

    static void showStepsInMonth(int month) { // 2 шаги за месяц
        stepsInMonth = 0;
        for (int i = 0; i < stepsMonthDayData[month-1].length; i++) {
            stepsInMonth += stepsMonthDayData[month-1][i];
        }
        System.out.println("За этот месяц вы сделали " + stepsInMonth + " шагов");
    }

    static void showMaxStepsInMonth(int month) { // 3 максимально шагов
        int maxStepsInMonth = 0;
        for (int i = 0; i < stepsMonthDayData[month-1].length; i++) {
            if (stepsMonthDayData[month-1][i] > maxStepsInMonth) {
                maxStepsInMonth = stepsMonthDayData[month-1][i];
            }
        }
        System.out.println("Максимально вы сделали " + maxStepsInMonth + " шагов");
    }

    static void showMidStepsInMonth(int month) { // 4 среднее кол-во шагов
        int midStepsInMonth;
        int sumStepsInMonth = 0;
        for (int i = 0; i < stepsMonthDayData[month-1].length; i++) {
            sumStepsInMonth = stepsMonthDayData[month-1][i] + sumStepsInMonth;
        }
        midStepsInMonth = sumStepsInMonth/stepsMonthDayData[month-1].length;
        System.out.println("В среднем за этот месяц вы сделали " + midStepsInMonth + " шагов в день");
    }

    static void showDistanceInMonth(int month) { // 5 пройденная дистанция в км
        stepsInMonth = 0;
        for (int i = 0; i < stepsMonthDayData[month-1].length; i++) {
            stepsInMonth = stepsMonthDayData[month-1][i] + stepsInMonth;
        }
        System.out.println("В этом месяце вы прошли " + Converter.convertDistance(stepsInMonth) + " км.");
    }

    static void showEnergyInMonth(int month) { // 6 килокалории
        stepsInMonth = 0;
        for (int i = 0; i < stepsMonthDayData[month-1].length; i++) {
            stepsInMonth = stepsMonthDayData[month-1][i] + stepsInMonth;
        }
        System.out.println("В этом месяце вы сожгли " + Converter.convertEnergy(stepsInMonth) + " килокалорий");
    }

    static void showBestInMonth(int month) { // 7 лучшая серия
        int bestSeries = 0;
        int tempSeries = 0;
        for (int i = 0; i < 30; i++) {
            if (stepsMonthDayData[month-1][i] >= stepGoal) {
                tempSeries = tempSeries + 1;
                if (tempSeries > bestSeries) {
                    bestSeries = tempSeries;
                }
            } else {
                tempSeries = 0;
            }
        }
        System.out.println("Лучшая серия в этом месяце: " + bestSeries + " дней подряд");
    }
}