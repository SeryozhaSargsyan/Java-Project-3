public class Main {

    public static void main(String[] args) {

        int bill = 800;
        int addMoney = 1200;

        if (addMoney > 1000) {

            int bonus = addMoney / 100 * 1;
            int finishBill = bill + addMoney + bonus;

            System.out.println(finishBill + " рублей");
            System.out.println(bonus + " рублей бонус");

        }
        if (addMoney < 1000) {

            int finishBill = bill + addMoney;

            System.out.println(finishBill + " Руб");

        }

    }
}