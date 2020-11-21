package bank;

import java.util.Scanner;

public class BankApp {
    private static Account[] accountArr = new Account[10];
    private static Scanner scanner = new Scanner(System.in);

    private static void createAccount(){
        System.out.println("계좌 생성");
        System.out.println("성명: ");
        String name = scanner.next();

        System.out.println("주민번호: ");
        String sno = scanner.next();

        System.out.println("입금액: ");
        double balance = scanner.nextDouble();

        int ano = (int)(Math.random()*(int)Math.pow(10,15)-1)+(int)Math.pow(10,14);
        String strAno = Integer.toString(ano);

        for (int i = 0; i < accountArr.length; i++){
            if(accountArr[i] == null){
                accountArr[i] = new Account(name, strAno, sno, balance);
                break;
            }
        }
    }

    private static void deposit(){

    }

    private static void withdraw(){

    }

    private static void findAccount(String accNum){

    }

    private static void sendMoney(){

    }
}
