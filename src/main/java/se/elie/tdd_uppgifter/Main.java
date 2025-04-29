package se.elie.tdd_uppgifter;

public class Main {

        public static void main(String[] args) {
            // ✅ Skapade objekt istället för upprepade variabler
            Item item1 = new Item("Laptop", 1000.00, 1);
            Item item2 = new Item("Phone", 500.00, 2);

            // ✅ Använder metod från Item-klassen istället för att räkna manuellt
            double totalBeforeDiscount = item1.getTotalPrice() + item2.getTotalPrice();
            System.out.println("Total before discount: $" + totalBeforeDiscount);

            // ✅ Flyttade rabattberäkning till en egen metod → DRY + bättre struktur
            double discount = 10.0;
            double discountAmount = calculateDiscount(totalBeforeDiscount, discount);
            double totalAfterDiscount = totalBeforeDiscount - discountAmount;

            System.out.println("Discount: $" + discountAmount);
            System.out.println("Total after discount: $" + totalAfterDiscount);

            // ✅ Visar hur samma uträkning återanvänds med samma metodlogik
            printTotalWithDiscount( discount, item1, item2 );
        }

        // 🔁 DRY-principen: gemensam metod för rabatt
        public static double calculateDiscount(double amount, double percent) {
            return amount * (percent / 100);
        }

        // 🔁 DRY + Flexibilitet: skriver ut totalsumma med rabatt, fungerar för valfritt antal varor
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
