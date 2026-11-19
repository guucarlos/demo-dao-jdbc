package br.com.portfolio;

import br.com.portfolio.model.dao.DaoFactory;
import br.com.portfolio.model.dao.SellerDao;
import br.com.portfolio.model.entities.Department;
import br.com.portfolio.model.entities.Seller;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}