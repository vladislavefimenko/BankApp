package Cards;

import java.io.Serializable;
import java.util.Optional;
import java.util.Scanner;

public class GeneralCard {

    private String name;
    private int number;
    private int month;
    private int year;
    private double balance;


    public GeneralCard(String name, int number, int month, int year, double balance) {
        this.name = name;
        this.number = number;
        this.month = month;
        this.year = year;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double isBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Карта: " + name +  " " + number + "\nМесяц/год: " + month + "/" + year + "\nБаланс: " + balance;
    }

    //методы операции зачисления
    public boolean makeTransaction(GeneralCard to, double sum){
        if (to == null){
            System.out.println("Карта не должна быть равна null");
            return false;
        }
        if (balance < sum){
            return false;
        }
        to.applyTransaction(sum);
        return true;
    }

    public void applyTransaction(double sum){
        this.balance = isBalance() +  sum;
    }

    //методы операции оплаты
    public boolean makePay(GeneralCard to1, double sum){
        if (to1 == null){
            System.out.println("Карта не должна быть null");
        }
        else {
            return false;
        }

        if (balance < sum){
            return false;
        }
        to1.payTransaction(sum);
        return false;
    }

    public boolean payTransaction(double sum){
        if (balance - sum < 0){
            System.out.println("Недостаточно средств на карте");
            return false;
        }
        this.balance = isBalance() - sum;
        System.out.println("Операция выполнена!");
        return true;
    }

    public void cardList(){
        System.out.println("Карта: " + name + " " + number);
    }


}
