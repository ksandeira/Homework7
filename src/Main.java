import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int firstFriday = 4;

        System.out.println("Напоминания о сдаче отчета:");
        for (int day = 1; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println("Задание 2");
        System.out.println("Версия do-while");
        int distance = 0;
        int marathonDistance = 42195;
        do {
            System.out.println("Держитесь! Осталось " + (marathonDistance - distance) + " метров.");
            distance += 500;
        } while (distance <= marathonDistance);

        System.out.println("Версия for");
        int marathonDistance1 = 42195;
        for (int distance1 = 0; distance1 <= marathonDistance1; distance1 += 500) {
            System.out.println("Держитесь! Осталоссь " + (marathonDistance1 - distance1) + " метров.");
        }

        System.out.println("Задание 3 (while)");
        int budget = 800;
        int days = 0;
        int currentDay = 0;
        int remainingBudget = budget;
        while (remainingBudget >= 0) {
            currentDay++;
            if (currentDay % 5 == 0) {
                days++;
                continue;
            }
            if (remainingBudget >= 100) {
                remainingBudget -= 100;
                days++;
            } else {
                break;
            }
        }
        System.out.println("При бюджете " + budget + " рублей, можно парковаться " + days + " дней.");

        System.out.println("Задание 3 (for)");
        int budget1 = 800;
        int days1 = 0;
        int remainingBudget1 = budget1;
        for (int day = 1; day <= budget1 * 2; day++) {
            if (day % 5 == 0) {
                days1++;
                continue;
            }
            if (remainingBudget1 >= 100) {
                remainingBudget1 -= 100;
                days1++;
            } else {
                break;
            }
        }
        System.out.println("При бюджете " + budget1 + " рублей, можно парковаться " + days1 + " дней.");

        System.out.println("Задание 4");
        int month = 0;
        double total = 0;
        double target = 12_000_000;
        double monthlyDeposit = 15_000;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        while (true) {
            month++;
            total += monthlyDeposit;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.println("Месяц " + month + ": " + df.format(total) + " рублей");
            if (total >= target) {
                System.out.println("Цель достигнута за " + month + " месяцев! Итог: " + df.format(total) + " рублей");
                break;
            }
        }

        System.out.println("Задание 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Пропуск зарядки, по причине перегрева. Всего перегревов: " + overheats);
                if (minute + 2 <= 100) {
                    minute += 2;
                }
                continue;
            }
            charge += 2;
            if (charge > 100) {
                charge = 100;
            }
            if (overheats > 3) {
                System.out.println("Зарядка завершена из-за перегрева");
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут");
        System.out.println("Финальный уровень заряда: " + charge + "%");
        System.out.println("Количество перегревов: " + overheats);
    }
}