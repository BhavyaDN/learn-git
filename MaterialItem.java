package com.exam;

/**
 * Created by bhavya on 5/20/17.
 */
public class MaterialItem extends Item{
    public MaterialItem(Integer key, String name, float price) {
        super(key, name, price);
        type = ItemType.MATERIAL;
    }
}
