package Main.Groceries;

import java.awt.Color;

public abstract class Grocery {

    private String name;
    private double mass;
    private String color;
    private double price;

    /**
     * A grocery item.
     */
    public Grocery() {
        this.name = "empty";
        this.mass = 0;
    }

    /**
     * A grocery item
     *
     * @param name Item's name.
     */
    public Grocery(String name) {
        this();
        this.name = name;
    }

    /**
     * A grocery item.
     *
     * @param name The item's name.
     * @param mass The item's mass.
     */
    public Grocery(String name, double mass) {
        this(name);
        this.mass = mass;
    }

    /**
     * A grocery item.
     *
     * @param name The item's name.
     * @param mass The item's mass.
     * @param color The item's color.
     */
    public Grocery(String name, double mass, String color) {
        this(name, mass);
        this.color = color;
    }

    /**
     * Gets the name of the item
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the item
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the mass of the item
     *
     * @return
     */
    public double getMass() {
        return mass;
    }

    /**
     * Sets the mass of the item
     *
     * @param mass
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Gets the color of the item
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the item
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Eating the item
     */
    public abstract void eat();

    /**
     * Buy an item
     *
     * @param money The amount of money the user will pay for the item.
     * @return Weather the item was bought or not
     */
    public abstract boolean buy(double money);

    /**
     * Returns a string representation of the item
     *
     * @return
     */
    public abstract String toString();

}
