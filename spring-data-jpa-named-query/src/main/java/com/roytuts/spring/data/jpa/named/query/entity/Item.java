package com.roytuts.spring.data.jpa.named.query.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "item")
@NamedQueries(value = { @NamedQuery(name = "Item.findAll", query = "select i from Item i"),
        @NamedQuery(name = "Item.findByName", query = "select i from Item i where i.itemName = ?1"),
        @NamedQuery(name = "Item.findByPrice", query = "select i from Item i where i.itemPrice = :price") })
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_desc")
    private String itemDesc;

    @Column(name = "item_price")
    private Double itemPrice;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", itemPrice="
                + itemPrice + "]";
    }

}
