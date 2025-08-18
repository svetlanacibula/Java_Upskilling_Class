package Challenge_20.Meal;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal();

        meal.addToppingToBurger("Cheese");
        meal.addToppingToBurger("Tomato");
        meal.addToppingToBurger("Bacon");

        System.out.println(meal);
    }
}