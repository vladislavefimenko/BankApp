package Banks;

import Cards.MaestroCard;
import Cards.VisaCard;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BankMethods {
    Bank bank = new Bank();
    Scanner sc = new Scanner(System.in);

//    VisaCard visaCard = new VisaCard("Visa",987456123,05, 19, 10000);
//    MaestroCard maestroCard = new MaestroCard("Maestro",123456789, 23,23, 0);



    public void informationOfCard() {
        System.out.println("Доступные карты: " + "\n1." + bank.getAllCards().get(0).getName() + "\n2. " + bank.getAllCards().get(1).getName() + "\nПо всем. " + "\n0.Выход");
        System.out.println("Информацию по какой карте вы хотите получить?");
        while (!sc.hasNextInt()) {
            System.out.println("Некорректный ввод! Повторите попытку");
            sc.next();
        }
        int v = sc.nextInt();
        switch (v) {
            case (1):
                System.out.println(bank.getAllCards().get(1).toString());
                break;
            case (2):
                System.out.println(bank.getAllCards().get(2).toString());
                break;
            case (3):
                System.out.println(bank.getAllCards().get(1).toString());
                System.out.println("-----------------------------------");
                System.out.println(bank.getAllCards().get(2).toString());
                break;
            case (0):
                break;
        }
    }

    public void transaction() {
        System.out.println("Вы выбрали операцию перевода");
        bank.getAllCards().get(1).cardList();
        bank.getAllCards().get(2).cardList();
        System.out.println("С какой карты выполнить перевод?");
        while (!sc.hasNextInt()) {
            System.out.println("Некорректный ввод! Повторите попытку");
            sc.next();
        }
        int v = sc.nextInt();
        switch (v) {
            case (1):
                System.out.println("Введите сумму перевода");
                while (!sc.hasNextDouble()) {
                    System.out.println("Некорректное значение!");
                }
                if (bank.getAllCards().get(1))
        }
    }
}
