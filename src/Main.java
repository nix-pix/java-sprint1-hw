import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Прототип приложения CЧЁТЧИК КАЛОРИЙ");
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) {
                System.out.println("За какой день вы хотите внести шаги?");
                System.out.println("Введите номер дня в месяце от 1 до 30");
                int dayInput = scanner.nextInt();
                while (dayInput <= 0 || dayInput > 30) {
                    System.out.println("Повторите ввод. Можно ввести значение от 1 до 30!");
                    dayInput = scanner.nextInt();
                }
                System.out.println("А о каком месяце идет речь?");
                System.out.println("Введите номер месяца от 1 до 12, где: 1 - ЯНВ ... 12 - ДЕК");
                int monthInput = scanner.nextInt();
                while (monthInput <= 0 || monthInput > 12) {
                    System.out.println("Повторите ввод. Можно ввести значение от 1 до 12!");
                    monthInput = scanner.nextInt();
                }
                System.out.println("Хорошо. Готов записать шаги, вводите...");
                int stepsInput = scanner.nextInt();
                StepTracker.addSteps(monthInput, dayInput, stepsInput);
                System.out.println("Ваше достижение записано");
            } else if (userInput == 2) {
                System.out.println("За какой месяц вы хотите увидеть статистику?");
                System.out.println("Введите номер месяца от 1 до 12, где: 1 - ЯНВ ... 12 - ДЕК");
                int monthInput = scanner.nextInt();
                while (monthInput <= 0 || monthInput > 12) {
                    System.out.println("Повторите ввод. Можно ввести значение от 1 до 12!");
                    monthInput = scanner.nextInt();
                }
                printStatMenu();
                int statMenuInput = scanner.nextInt();
                while (statMenuInput <= 0 || statMenuInput > 7) {
                    System.out.println("Повторите ввод. Можно ввести значение от 1 до 7!");
                    statMenuInput = scanner.nextInt();
                }
                if (statMenuInput == 1) {
                    StepTracker.showStepsByDays(monthInput);
                } else if (statMenuInput == 2) {
                    StepTracker.showStepsInMonth(monthInput);
                } else if (statMenuInput == 3) {
                    StepTracker.showMaxStepsInMonth(monthInput);
                } else if (statMenuInput == 4) {
                    StepTracker.showMidStepsInMonth(monthInput);
                } else if (statMenuInput == 5) {
                    StepTracker.showDistanceInMonth(monthInput);
                } else if (statMenuInput == 6) {
                    StepTracker.showEnergyInMonth(monthInput);
                } else {
                    StepTracker.showBestInMonth(monthInput);
                }
            } else if (userInput == 3) {
                System.out.println("Введите новую цель по шагам");
                int newStepGoal = scanner.nextInt();
                while (newStepGoal < 0) {
                    System.out.println("Цель не может быть отрицательной. Повторите ввод");
                    newStepGoal = scanner.nextInt();
                }
                StepTracker.setStepGoal(newStepGoal);
                System.out.println("Новая цель установлена");
            } else {
                System.out.println("Извините, такой фукции пока нет.");
            }
            printMenu(); // печатаем основное меню ещё раз после завершения действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() { // основное меню приложения
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день;"); // работает
        System.out.println("2 - Напечатать статистику за определённый месяц;"); // работает
        System.out.println("3 - Изменить цель по количеству шагов в день;"); // работает
        System.out.println("0 - Выйти из приложения."); // работает
        // выбор значения вне диапазона работает
    }

    private static void printStatMenu() { // меню статистики
        System.out.println("Какую статистику вы хотите посмотреть за этот месяц?");
        System.out.println("1 - Количество пройденных шагов по дням"); // работает
        System.out.println("2 - Общее количество шагов за месяц"); // работает
        System.out.println("3 - Максимальное пройденное количество шагов в месяце"); // работает
        System.out.println("4 - Среднее количество шагов"); // работает
        System.out.println("5 - Пройденная дистанция (в км)"); // работает
        System.out.println("6 - Количество сожжённых килокалорий"); // работает
        System.out.println("7 - Лучшая серия: максимальное количество подряд идущих дней,"); // работает
        System.out.println("в течение которых количество шагов за день было равно или выше целевого");
        // выбор значения вне диапазона работает
    }
}