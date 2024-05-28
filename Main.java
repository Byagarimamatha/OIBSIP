import java.util.ArrayList;
import java.util.List;

class Reservation {
    private String name;
    private int numSeats;

    public Reservation(String name, int numSeats) {
        this.name = name;
        this.numSeats = numSeats;
    }

    public String getName() {
        return name;
    }

    public int getNumSeats() {
        return numSeats;
    }
}

class ReservationSystem {
    private List<Reservation> reservations;

    public ReservationSystem() {
        this.reservations = new ArrayList<>();
    }

    public void makeReservation(String name, int numSeats) {
        Reservation reservation = new Reservation(name, numSeats);
        reservations.add(reservation);
        System.out.println("Reservation made for " + name + " for " + numSeats + " seats.");
    }

    public void displayReservations() {
        System.out.println("Current Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation.getName() + " - " + reservation.getNumSeats() + " seats");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        
        // Example usage:
        reservationSystem.makeReservation("John Doe", 3);
        reservationSystem.makeReservation("Jane Smith", 2);

        // Display reservations
        reservationSystem.displayReservations();
    }
}