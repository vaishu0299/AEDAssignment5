/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Business.Menu;

/**
 *
 * @author vaishnavisai
 */
//public class Menu {
    
    
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author Vaishnavisai
 */
public class Menu {
    
    private ArrayList<Item> itemList;
    
    public Menu() {
        itemList = new ArrayList();
    }

    public ArrayList<Item> getMenu() {
        return itemList;
    }

    public void setMenu(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    
    public void addNewItem(String itemName, double price, String res) {
        Item newItem = new Item(itemName, price, res);
        itemList.add(newItem);
    }
    
    public void removeItem(Item item) {
        itemList.remove(item);
    }
}
