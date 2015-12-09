package Main.Groceries;

import java.awt.Color;

public abstract class Grocery {

    private String name;
    private double mass;
    private Color color;

    /**
     * A grocery item.
     */
    public Grocery() {
        this.name = "empty";
        this.mass = 0;
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
    public Color getColor() {
        return color;
    }

    /**
     * Sets the color of the item
     *
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Eating the item
     */
    public abstract void eat();

    /**
     * Returns a string representation of the item
     *
     * @return
     */
    public abstract String toString();
}
