package com.exam;

/**
 * Created by bhavya on 5/20/17.
 */
public class Item

{

    private Integer key;
    private String name;
    private float price;
    protected ItemType type;

    public Item(Integer key, String name, float price) throws IllegalArgumentException
    {
        if(key != null && name != null) {
            this.key = key;
            this.name = name;
            this.price = price;
        }else {
           throw new IllegalArgumentException();
        }
    }

    public ItemType getType() {
        return type;
    }

    public Integer getKey()
    {
        return key;
    }

    public String getName()
    {
        return name;
    }

    public float getPrice()
    {
        return price;
    }

    public boolean equals(Object obj) {
        boolean isEqual = true;
        if(!(obj instanceof Item)) {
            isEqual = false;
        }else {
            Item item = (Item) obj;
            if(this.getKey().intValue() != item.getKey().intValue()) {
                isEqual = false;
            }
        }
        return isEqual;
    }

}