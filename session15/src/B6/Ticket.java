package B6;

import java.time.LocalDateTime;

class Ticket {
    int ticketNumber;
    LocalDateTime issuedTime;

    public Ticket(int number) {
        this.ticketNumber = number;
        this.issuedTime = LocalDateTime.now();
    }

    public String toString() {
        return "So: " + ticketNumber + " | " + issuedTime;
    }
}