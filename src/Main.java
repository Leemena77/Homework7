//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println("Task 1");
        int firstFriday = 1;
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчет");
                firstFriday += 7;
            }
            System.out.println("Task 2");
            int distance = 0;
            do {
                System.out.println("Держитесь! Осталось " + distance + " метров");
                distance += 500;
            } while (distance <= 42195);
        }
        System.out.println("Tas 2 - for");
        int distance = 0;
        for (int i = 0; i <= 42195; i = i + 500) {
            System.out.println("Держитесь! Осталось " + i + " метров");
        }
        System.out.println("Task 3");
        int money = 1500;
        int parkingDay = 1;
        int totalDays = 0;
        while (true) {
            if (parkingDay % 5 == 0) {
                parkingDay++;
                totalDays++;
                System.out.println("Бесплатный день");
                continue;
            }
            money -= 100;
            totalDays++;
            parkingDay++;

            if (money < 100) {
                System.out.println("Пополните счет");
                break;
            }
            System.out.println("Бюджета хватило на " + totalDays + " дней");
            System.out.println("Остаток на счете: " + money + " руб.");
        }
        System.out.println("Task 3 - for");
        int money2 = 1500;
        int Parkingdays = 1;
        for (int i = money2; i >= 100; Parkingdays++) {
            if (Parkingdays % 5 == 0) {
                System.out.println("День " + Parkingdays + " : Бесплатный день. Остаток " + i);
            } else {
                i -= 100;
                System.out.println("День " + Parkingdays + " : Списание 100. Остаток " + i);
            }
            System.out.println("Task 4");
            int month = 0;
            double total = 0;
            int monthMoney = 15000;
            while (true) {
                month++;
                if (month % 6 == 0) {
                    total = total + total / 100 * 7;
                }
                total = total + monthMoney;
                if (total >= 12000000) {
                    break;
                }
                System.out.println("Месяц " + month + " . Накоплений" + total);
            }
            System.out.println("Цель достигнута, понадобилось " + month + " месяцев");
        }
        System.out.println("Task 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats < 3) {
            minute++;
            charge = charge + 2;

            if (minute % 10 == 0) {
                overheats++;
                continue;
            }
        if (overheats >= 3) {
            System.out.println("Зарядка прекращена. Текущий заряд " + charge + "%");
            System.out.println("Причина: достигнуто 3 перегрева");
        } else {
            System.out.println("Зарядка завершена успешно. Текущий заряд " + charge + "%");
        }

        System.out.println("Общее время зарядки: " + minute + " минут");
        System.out.println("Количество перегревов: " + overheats);
            }
        System.out.println("Время зарядки составило " + minute);
    }
}
