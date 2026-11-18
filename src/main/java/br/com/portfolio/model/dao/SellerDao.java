package br.com.portfolio.model.dao;

import br.com.portfolio.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void inser(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
