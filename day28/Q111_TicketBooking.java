import java.util.Scanner;

public class Q111_TicketBooking{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 10;
        boolean booked[] = new boolean[totalSeats];
        int choice;

        do {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Seat Status");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Seat Number (1-10): ");
                    int seat = sc.nextInt() - 1;

                    if (seat >= 0 && seat < totalSeats) {
                        if (!booked[seat]) {
                            booked[seat] = true;
                            System.out.println("Ticket Booked Successfully.");
                        } else {
                            System.out.println("Seat Already Booked.");
                        }
                    } else {
                        System.out.println("Invalid Seat Number.");
                    }
                    break;

                case 2:
                    System.out.println("\nSeat Status:");
                    for (int i = 0; i < totalSeats; i++) {
                        System.out.print("Seat " + (i + 1) + " : ");
                        if (booked[i])
                            System.out.println("Booked");
                        else
                            System.out.println("Available");
                    }
                    break;

                case 3:
                    System.out.print("Enter Seat Number to Cancel: ");
                    int cancel = sc.nextInt() - 1;

                    if (cancel >= 0 && cancel < totalSeats) {
                        if (booked[cancel]) {
                            booked[cancel] = false;
                            System.out.println("Ticket Cancelled Successfully.");
                        } else {
                            System.out.println("Seat Was Not Booked.");
                        }
                    } else {
                        System.out.println("Invalid Seat Number.");
                    }
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

       
    }
}

            