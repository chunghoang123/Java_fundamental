package B6;

import java.util.*;

class TicketSystem {
    Queue<Ticket> ticketQueue = new LinkedList<>();
    int currentNumber = 0;

    Ticket issueTicket() {
        Ticket t = new Ticket(++currentNumber);
        ticketQueue.offer(t);
        return t;
    }

    void callNext() {
        if (ticketQueue.isEmpty())
            System.out.println("Khong con so!");
        else
            System.out.println("Dang goi: " + ticketQueue.poll());
    }
}
