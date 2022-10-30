package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            default -> System.out.println("wrong number!");
            case (1), (3), (5), (7), (8), (10), (12) -> System.out.println(31);
            case (2) -> System.out.println(29);
            case (4), (6), (9), (11) -> System.out.println(30);
        }
    }
}
