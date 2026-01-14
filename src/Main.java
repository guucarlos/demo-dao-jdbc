import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1,"Books");
        Seller seller = new Seller(21,"Gustavo", "guucarlos18@gmail.com", new Date(), 4000.0, obj);

        System.out.println(obj);
        System.out.println(seller );
    }
}