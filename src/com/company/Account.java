package com.company;

public class Account {
    int balance = 0; //예금 잔액

    /* 내 계좌에 파라미터로 입력된 금액을 입금한다.*/
    public void deposit(int money){
        balance += money;
    }

    /* 내 계좌에 남은 잔액을 확인한다. 즉, balance를 조회한다. */
    public void checkMyBalance(){
        System.out.println("남은 잔액은 "+balance +"원 입니다.");
    }

    /* 내 계좌에서 돈을 인출한다. */
    public void withdraw(int money){
        if(money > balance){
            System.out.println("잔액이 부족합니다.");
        }
        else{
            balance -= money;
        }
    }
}

class Bank{
    public static void main(String[] args){
        Account minjeong = new Account();
        Account seo = new Account();

        minjeong.deposit(10000);
        minjeong.checkMyBalance();
        minjeong.withdraw(200);
        minjeong.checkMyBalance();

        seo.deposit(1000);
        seo.checkMyBalance();
        seo.withdraw(5);
        seo.checkMyBalance();

        System.out.println(seo.equals(minjeong));

        Account mom = new Account();
        Account dad = mom; //엄마의 계좌를 아빠도 참조한다.

        mom.deposit(10000);
        dad.deposit(10000);
        mom.checkMyBalance();
        dad.withdraw(15000);
        mom.checkMyBalance();
    }
}

