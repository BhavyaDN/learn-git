package com.exam;

/**
 * Created by bhavya on 5/20/17.
 */
public class ServiceItem extends Item{
    public ServiceItem(Integer key, String name, float price) {
        super(key, name, price);
        type = ItemType.SERVICE;
        
    }
}
