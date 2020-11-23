package bank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
    private static Account[] accountArr = new Account[10];
    private static Scanner scanner = new Scanner(System.in);
    private static int publicAccountNumber = 534910000;

    public static void main(String[] args){
        boolean run = true;
        while (run){
            System.out.println("자바은행 ATM입니다.");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 송금");
            System.out.println("5. 잔액 확인");
            System.out.println("6. 거래 내역 조회");
            System.out.println("0. 종료");
            System.out.println("선택> ");

            int cmd = scanner.nextInt();
            switch (cmd){
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    sendMoney();
                    break;
                case 5:
                    checkMoney();
                    break;
                case 6:
                    checkDetails();
                    break;
                case 0:
                    System.out.println("ATM을 종료합니다.");
                    run = false;
                    break;
            }
        }
    }

    private static void createAccount(){
        System.out.println("계좌 생성");
        System.out.println("성명: ");
        String name = scanner.next();

        System.out.println("주민번호: ");
        String sno = scanner.next();

        System.out.println("입금액: ");
        double balance = scanner.nextDouble();

        int ano = ++publicAccountNumber;
        String strAno = Integer.toString(ano);

        for (int i = 0; i < accountArr.length; i++){
            if(accountArr[i] == null){
                accountArr[i] = new Account(name, strAno, sno, balance);
                System.out.println("계좌번호는 "+strAno+ "입니다.");
                break;
            }
        }
    }

    private static void deposit(){
        System.out.println("\n");
        System.out.println(">> 입금 <<");
        System.out.println("입금할 계좌번호: ");
        String accNumber = scanner.next();
        System.out.println("입금할 금액: ");
        double money = scanner.nextDouble();
        System.out.println("입금자명: ");
        String name = scanner.next();

        if (findAccount(accNumber) == null) {
            System.out.println("해당 계좌번호는 존재하지 않습니다.\n");
        }else{
            Account account = findAccount(accNumber);
            account.setBalance(account.getBalance() + money);
            double balance = account.getBalance();
            ArrayList<String[]> details = account.getDetails();
            details.add(new String[]{name, "+"+Double.toString(money), Double.toString(balance)});
            account.setDetails(details);
            updateAccount(account);
            System.out.println("입금이 완료되었습니다.\n");
        }
    }

    private static void withdraw(){
        System.out.println("\n");
        System.out.println(">> 출금 <<");
        System.out.println("출금할 계좌번호: ");
        String accNumber = scanner.next();
        System.out.println("출금할 금액: ");
        double money = scanner.nextDouble();

        if (findAccount(accNumber) == null) {
            System.out.println("해당 계좌번호는 존재하지 않습니다.\n");
        }else{
            Account account = findAccount(accNumber);
            if (account.getBalance() - money < 0){
                System.out.println("잔액이 부족합니다.");
                return;
            }
            account.setBalance(account.getBalance() - money);
            ArrayList<String[]> details = account.getDetails();
            details.add(new String[]{account.getName(), "-"+Double.toString(money), Double.toString(account.getBalance())});
            account.setDetails(details);
            updateAccount(account);
            System.out.println("출금이 완료되었습니다.\n");
        }
    }

    private static Account findAccount(String accNum){
        for(int i = 0; i < accountArr.length; i++){
            if (accountArr[i] == null){
                break;
            }
            if (accountArr[i].getAccNumber().equals(accNum)){
                return accountArr[i];
            }
        }
        return null;
    }

    private static void checkMoney(){
        System.out.println("\n");
        System.out.println(">> 잔액 확인 <<");
        System.out.println("계좌번호 입력: ");
        String accNumber = scanner.next();

        if (findAccount(accNumber) == null) {
            System.out.println("해당 계좌번호는 존재하지 않습니다.\n");
        }else{
            double money = findAccount(accNumber).getBalance();
            System.out.println("잔액은 " + money +"원 입니다.");
        }
    }

    private static void updateAccount(Account account){
        String accNumber = account.getAccNumber();
        for(int i = 0; i < accountArr.length; i++){
            if (accountArr[i] == null){
                break;
            }
            if (accountArr[i].getAccNumber().equals(accNumber)){
                accountArr[i] = account;
            }
        }
    }
    private static void checkDetails(){
        System.out.println("\n");
        System.out.println(">> 거래 내역 조회 <<");
        System.out.println("계좌번호 입력: ");
        String accNumber = scanner.next();

        for(int i = 0; i < accountArr.length; i++){
            if (accountArr[i] == null){
                break;
            }
            if (accountArr[i].getAccNumber().equals(accNumber)){
                ArrayList<String[]> details = accountArr[i].getDetails();
                print(details);
                break;
            }
        }
    }

    private static void print(ArrayList<String[]> details){
        System.out.println("거래 내역을 조회합니다.\n");
        System.out.println("이름 \t거래 금액\t  잔액");
        for(int i = 0; i < details.size(); i++){
            System.out.println(details.get(i)[0] + "\t" + details.get(i)[1] + "\t" + details.get(i)[2]);
        }
        System.out.println("\n");
    }

    private static void sendMoney(){
        System.out.println("\n");
        System.out.println(">> 송금 <<");
        System.out.println("송금할 계좌번호: ");
        String accNumber = scanner.next();
        System.out.println("송금할 금액: ");
        double money = scanner.nextDouble();
        System.out.println("송금자명: ");
        String name = scanner.next();
        System.out.println("계좌에서 송금하시겠습니까? yes/no");
        String answer = scanner.next();

        String outAccNumber = null;

        boolean useAccount = false;
        if (answer.equals("yes")){
            System.out.println("출금할 계좌번호 입력: ");
            outAccNumber = scanner.next();
            useAccount = true;
        }

        if (useAccount && findAccount(outAccNumber) == null){
            System.out.println("송금 실패. 출금할 계좌가 존재하지 않습니다.\n");
            return;

        }
        if (findAccount(accNumber) == null) {
            System.out.println("해당 계좌번호는 존재하지 않습니다.\n");
        }else{
            if(useAccount){
                Account account = findAccount(outAccNumber);
                if (account.getBalance() - money < 0){
                    System.out.println("잔액이 부족합니다.");
                    return;
                }
                account.setBalance(account.getBalance() - money);
                double balance = account.getBalance();
                ArrayList<String[]> details = account.getDetails();
                details.add(new String[]{name, "+"+Double.toString(money), Double.toString(balance)});
                account.setDetails(details);
                updateAccount(account);
            }

            Account account = findAccount(accNumber);
            account.setBalance(account.getBalance() + money);
            double balance = account.getBalance();
            ArrayList<String[]> details = account.getDetails();
            details.add(new String[]{name, "+"+Double.toString(money), Double.toString(balance)});
            account.setDetails(details);
            updateAccount(account);

            System.out.println("송금이 완료되었습니다.\n");
        }
    }
}
