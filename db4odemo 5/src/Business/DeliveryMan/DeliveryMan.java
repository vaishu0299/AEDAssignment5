/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String name;
    private String status;
    private String address;
    private int phoneNumber;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    UserAccount ua;

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    
    public DeliveryMan(UserAccount ua)
    {
        this.ua = ua;
        this.name = ua.getUsername();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

      
    @Override
    public String toString(){
        return name;
    }
    
  
}
