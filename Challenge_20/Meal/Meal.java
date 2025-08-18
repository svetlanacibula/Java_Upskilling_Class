package Challenge_20.Meal;

import java.util.ArrayList;
import java.util.List;

public class Meal {
   // private final Item mainDish;
    private final Item sideDish;
    private final Item drink;
    private final Burger burger;

    public Meal() {
       // mainDish = new Item("Pork", "main dish", 10.0);
        sideDish = new Item("Salad", "side dish", 5.0);
        drink = new Item("Coffee", "hot drink", 2.0);
        burger = new Burger ("Beef burger", "burger", 12.0);
    }

    public double getTotalPrice() {
            return burger.price + sideDish.price + drink.price;
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%25s%.2f".formatted(burger, sideDish, drink,
                "Total price: ", getTotalPrice());
    }

    public void addToppingToBurger(String name) {
        burger.addTopping(name);
    }

    private class Item {
        protected final String name;
        protected final String type;
        protected double price;

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s %.2f".formatted(type, name, price);
        }
    }

    private class Burger extends Item {
        private final List<Item> toppings = new ArrayList<>();

        public Burger(String name, String type, double price) {
            super(name, type, price);
        }

        public void addTopping(String name) {
            double toppingPrice = switch (name.toLowerCase()) {
                case "cheese" -> 1.0;
                case "bacon" -> 1.5;
                case "tomato" -> 2.0;
                case "pickles" -> 1.3;
                case "lettuce", "ketchup", "onion", "mayo" -> 0.0;
                default -> 0.5;
            };
            toppings.add(new Item(name, "topping", toppingPrice));
            super.price += toppingPrice;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            for (Item topping : toppings) {
                sb.append("\n").append(topping.toString());
            }
            return sb.toString();
        }
    }
}

