package br.com.portfolio;

import br.com.portfolio.model.dao.DaoFactory;
import br.com.portfolio.model.dao.SellerDao;
import br.com.portfolio.model.entities.Seller;

public class Main {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: Seller findById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}