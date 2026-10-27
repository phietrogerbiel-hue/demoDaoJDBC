package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    static void main(String[] args) {

        Department obj = new Department(1,"TI");

        Seller seller = new Seller(21, "bob", "bog@gmail.com", new Date(), 3000.0, obj);

        System.out.println(seller);
    }
}
