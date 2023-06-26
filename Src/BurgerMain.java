public class BurgerMain {
    public static void main(String[] args) {
        Burger simpleBurger = new Burger(true,true,true,true,true);
        Burger dieteticBurger = new Burger(true, true, true, true);
        Burger doubleBurger = new Burger(true,true,true,true,true,true);

        System.out.println("Звичайний бургер. " + simpleBurger);
        System.out.println("Дієтичний бургер. " + dieteticBurger);
        System.out.println("Подвійний бургер. " + doubleBurger);
    }
}
