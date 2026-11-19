package br.com.portfolio.model.dao;

import br.com.portfolio.db.DB;
import br.com.portfolio.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
