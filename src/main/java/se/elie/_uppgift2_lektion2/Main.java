package se.elie._uppgift2_lektion2;

public class Main {

        public static void main(String[] args) {

            Item item1 = new Item("Laptop", 1000.00, 1);
            Item item2 = new Item("Phone", 500.00, 2);

            // ✅ Använder metod från Item-klassen istället för att räkna manuellt
            double totalBeforeDiscount = item1.getTotalPrice() + item2.getTotalPrice();
            System.out.println("Total before discount: $" + totalBeforeDiscount);


            double discount = 10.0;
            double discountAmount = calculateDiscount(totalBeforeDiscount, discount);
            double totalAfterDiscount = totalBeforeDiscount - discountAmount;

            System.out.println("Discount: $" + discountAmount);
            System.out.println("Total after discount: $" + totalAfterDiscount);


            printTotalWithDiscount( discount, item1, item2 );
        }

        public static double calculateDiscount(double amount, double percent) {
            return amount * (percent / 100);
        }


        public static void printTotalWithDiscount( double discount , Item... items ) {
            double total = 0;
            for (Item item : items) {
                total += item.getTotalPrice(); // Återanvänder Item-logik
            }

            discount = 10.0;
            double discountAmount = calculateDiscount(total, discount);
            double finalTotal = total - discountAmount;

        }
    }
