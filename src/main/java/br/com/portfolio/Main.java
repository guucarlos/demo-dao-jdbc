package br.com.portfolio;

import br.com.portfolio.model.dao.DaoFactory;
import br.com.portfolio.model.dao.SellerDao;
import br.com.portfolio.model.entities.Department;
import br.com.portfolio.model.entities.Seller;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: Seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 1: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }
    }
}