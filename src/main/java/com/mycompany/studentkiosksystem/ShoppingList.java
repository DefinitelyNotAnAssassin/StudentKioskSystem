/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentkiosksystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingList {

    private List<Map<String, Object>> items;

    public ShoppingList() {
        this.items = new ArrayList<>();
    }

    // Create
    public void addProduct(String name, int quantity, int price) {
        Map<String, Object> item = new HashMap<>();
        item.put("pname", name);
        item.put("pqty", quantity);
        item.put("pprice", price);
        items.add(item);
    }

    // Read
    public List<Map<String, Object>> getAllProducts() {
        return items;
    }

    public Map<String, Object> getProduct(String name) {
        for (Map<String, Object> item : items) {
            if (item.get("pname").equals(name)) {
                return item;
            }
        }
        return null;
    }

    
    
    
    public boolean isExisting (String name) {
        for (Map<String, Object> item : items) {
            if (item.get("pname").equals(name)) {
                return true;
            }
            
        }
        return false;
    }
    // Update
    public void updateQuantity(String name, int quantity) {
        for (Map<String, Object> item : items) {
            if (item.get("pname").equals(name)) {
                item.put("pqty", (int) item.get("pqty") + quantity);
                return;
            }
        }
        throw new IllegalArgumentException("Product not found: " + name);
    }

    // Delete
    public void removeProduct(String name) {
        items.removeIf(item -> item.get("pname").equals(name));
    }

    // Other useful methods
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Map<String, Object> item : items) {
            totalPrice +=  (int) item.get("pqty") *  (int) item.get("pprice");
        }
        return totalPrice;
    }

    public int getTotalQuantity() {
        int totalQuantity = 0;
        for (Map<String, Object> item : items) {
            totalQuantity += (int) item.get("pqty");
        }
        return totalQuantity;
    }

    public void clearCart() {
        items.clear();
    }
}