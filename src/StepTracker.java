public class StepTracker {

    static int stepGoal = 10000;
    static int stepsInMonth;
    static int[][] stepsMonthDayData = new int[12][30];

    static void setStepGoal(int steps) { // установка цели
        steps = stepGoal;
    }

    static void addSteps(int month, int day, int steps) { // ввести шаги за день
        stepsMonthDayData[month-1][day-1] = steps;
    }

    static void showStepsByDays(int month) { // 1 шаги по дням
        for (int i = 0; i < stepsMonthDayData[month-1].length-1; i++) {
            System.out.print((i + 1) + " день: " + stepsMonthDayData[month - 1][i] + ", ");
        }
        System.out.println("30 день: " + stepsMonthDayData[month-1][29]);
    }

    static void showStepsInMonth(int month) { // 2 шаги за месяц
        stepsInMonth = 0;
        for (int i = 0; i < stepsMonthDayData[month-1].length; i++) {
            stepsInMonth = stepsMonthDayData[month-1][i] + stepsInMonth;
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
        int midStepsInMonth = 0;
        int sumStepsInMonth = 0;
        for (int i = 0; i < stepsMonthDayData[month-1].length; i++) {
            sumStepsInMonth = stepsMonthDayData[month-1][i] + sumStepsInMonth;
        }
        midStepsInMonth = sumStepsInMonth/30;
        System.out.println("В среднем за этот месяц вы сделали " + midStepsInMonth + " шагов");
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
    }
}