package com.exam;

/**
 * Created by bhavya on 5/20/17.
 */
public class OrderItem {
    protected Item item;
    protected float quantity;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public OrderItem(Item item, float quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return this.getItem().getName();
    }
}
