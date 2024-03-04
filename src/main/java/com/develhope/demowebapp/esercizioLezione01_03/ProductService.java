package com.develhope.demowebapp.esercizioLezione01_03;

import java.util.List;

public class ProductService {
    private List<Product> listaproduct;
    public Product addProduct(Product product){
        listaproduct.add(product);
        return product;
    }
    public Product getProductById(String idDaCercare){
        Product productCollegamento = null;
        for(Product product : listaproduct){
            if(product.getId().equals(idDaCercare)){
                productCollegamento = product;
            }
        }
        return productCollegamento;
    }
    public List<Product> getAllProducts(){
//        List<Product> collegamento = null;
//        for(Product product : listaproduct){
//            collegamento.add(product);
//        }
//        return collegamento;
        return listaproduct;
    }


    public Product deleteProduct(Product product){
        listaproduct.remove(product);
        return product;
    }


}
