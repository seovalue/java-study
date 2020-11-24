package book.chapter01.step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> ticketList = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... ticketList){
        this.amount = amount;
        this.ticketList.addAll(Arrays.asList(ticketList));
    }

    public Ticket getTicket(){
        return ticketList.remove(0);
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
