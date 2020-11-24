package book.chapter01.step01;
/*
* 이벤트 당첨자는 티켓으로 교환할 초대장을 가지고 있다.
* 이벤트에 당첨되지 않은 관람객은 티켓을 구매할 수 있는 현금을 보유하고 있다.
* 따라서 관람객이 가지고 올 수 있는 소지품은 초대장, 현금, 티켓 세 가지 뿐이다.
* 관람객은 소지품을 보관할 용도로 가방을 들고 올 수 있다고 가정하자.
* */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    // Bag 인스턴스의 상태는 현금과 초대장을 함께 보유하거나, 초대장 없이 현금만 보관하는 두 가지 중 하나의 상태를 가진다.[
    public Bag(Long amount){
        this(null,amount);
    }

    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }


    public boolean hasInvitation(){
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket != null;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
