public class Main {
    public static void main(String[] args) {
        int startSumInAccount = 100;
        // Начальная сумма на счёте
        int sumDeposit = 1000;
        // Внесённая сумма
        int criticalSum = 1000;
        int endSumInAccount;
        int bonus;
        if (sumDeposit>=criticalSum){
            bonus = sumDeposit/100;
            endSumInAccount = startSumInAccount + sumDeposit + bonus;
            System.out.println("Баланс на счете:" + endSumInAccount);
            System.out.println("Получен бонус:" + bonus);
        }
        else {
            endSumInAccount = startSumInAccount + sumDeposit;
            System.out.println("Баланс на счете:" + endSumInAccount);
            System.out.println("Пополните баланс больше чем на 1000 рублей, чтобы получить бонус");
        }
    }
}
