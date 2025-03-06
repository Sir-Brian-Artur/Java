package T03;

import java.util.Scanner;

public class E29 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int buyTickets, availableTickects, maxSale = 0;
        System.out.print("Tickets disponibles: ");
        availableTickects = keyboard.nextInt();
        buyTickets = 0;

        while (availableTickects > 0){
            System.out.print("Cuántas entradas desea? (max 10)");
            buyTickets = keyboard.nextInt();

            maxSale = (buyTickets > maxSale) ? buyTickets : maxSale;
            availableTickects = (buyTickets <= 10) ? availableTickects - buyTickets : availableTickects;
            System.out.println("Quedan " + availableTickects + " tickets disponibles");
        }
        System.out.println("Máxima compra con: " + maxSale + " ticketcs.");

        keyboard.close();
    }
}
