package com.exam;


import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by bhavya on 5/20/17.
 */
public final class  Order implements Serializable

{

    private final OrderItem[] orderItems;

    
    public Order(OrderItem[] orderItems)

    {

        this.orderItems = orderItems;

    }

    // Returns the total order cost after the tax has been applied

    public float getOrderTotal(float taxRate)

    {
        float total = 0;
        for(OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                Float price = orderItem.getItem().getPrice();
                Float quantity = orderItem.getQuantity();
                total += price *  quantity;
                if(orderItem.getItem().getType() == ItemType.MATERIAL) {
                    total += total * (taxRate / 100);
                }
            }
        }
        return new BigDecimal(total).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    /**
     * Returns a Collection of all items sorted by item name
     * <p>
     * (case-insensitive).
     *
     * @return Collection
     */
    public Collection getItems()

    {

        List<OrderItem> orderitemsList = Arrays.asList(orderItems) ;
        Collections.sort(orderitemsList, new Comparator<OrderItem>() {

            @Override
            public int compare(OrderItem item1, OrderItem item2) {
                String itemname1 = item1.getItem().getName();
                String itemname2 = item2.getItem().getName();
                int result = String.CASE_INSENSITIVE_ORDER.compare(itemname1, itemname2);
                if (result == 0) {
                    result = itemname1.compareTo(itemname2);
                }
                return result;
            }
        });
        return orderitemsList;

    }

}
