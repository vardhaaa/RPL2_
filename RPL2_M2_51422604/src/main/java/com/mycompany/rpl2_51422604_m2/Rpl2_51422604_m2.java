/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl2_51422604_m2;

/**
 *
 * @author vardh
 */
public class Rpl2_51422604_m2 {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Seller seller = new Seller();
        seller.addProduct("Mangga");
        
        Admin admin = new Admin();
        admin.login();
        admin.manageUser();
        admin.logout();
        
    }
}
