package se.elie.tdd_uppgifter;

public class Item {
    // ✅ Inkapsling av namn, pris och kvantitet
    private String name;
    private double price;
    private int quantity;

    // ✅ Konstruktor: gör objektladdning tydlig och centraliserad
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // ✅ Återanvändbar metod för totalpris (enligt OOP & DRY)
    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }
}
