import java.util.Scanner;

public class StepTracker {
    static int stepGoal = 10000;
    MonthData[] monthToData;

    static void setStepGoal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новую цель по шагам");
        int newStepGoal = scanner.nextInt();

        if (newStepGoal >= 0) {
            stepGoal = newStepGoal;
            System.out.println("Новая цель установлена");
        } else {
            System.out.println("Извините, цель не может быть отрицательной.");
        }
    }

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        // Заполните класс самостоятельно
    }
}