public class Burger {
    boolean bun;
    boolean cheese;
    boolean mayonnaise;
    boolean green;
    boolean meat;
    boolean doubleMeat;

    public Burger(boolean bun, boolean cheese, boolean mayonnaise, boolean green, boolean meat, boolean doubleMeat) {
        this.bun = bun;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.green = green;
        this.meat = meat;
        this.doubleMeat = doubleMeat;
    }

    public Burger(boolean bun, boolean cheese, boolean mayonnaise, boolean green, boolean meat) {
        this.bun = bun;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.green = green;
        this.meat = meat;
    }

    public Burger(boolean bun, boolean cheese, boolean green, boolean meat) {
        this.bun = bun;
        this.cheese = cheese;
        this.green = green;
        this.meat = meat;
    }

    public Burger() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Склад: ");
        if (bun) {
            sb.append("Булочка, ");
        }
        if (cheese) {
            sb.append("Сир, ");
        }
        if (mayonnaise) {
            sb.append("Майонез, ");
        }
        if (green) {
            sb.append("Зелень, ");
        }
        if (doubleMeat) {
            sb.append("Подвійне ");
        }
        if (meat) {
            sb.append("М'ясо ");
        }
        return sb.toString();
    }
}
