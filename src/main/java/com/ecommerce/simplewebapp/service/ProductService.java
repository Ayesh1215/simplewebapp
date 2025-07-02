package com.ecommerce.simplewebapp.service;

import com.ecommerce.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product>  products= new ArrayList<>(Arrays.asList(
            new Product(50000,"Iphone",100),
            new Product(70000,"Canon Camera",101),
            new Product(80000,"Camera",102)));
    public List<Product> getProducts(){
   return products;
    }
    public Product getProductbyid(int prodid){
           return products.stream()
                   .filter(p-> p.getProdid()==prodid)
                   .findFirst().orElse(new Product(0,"no items",103));


    }
    public void addProduct(Product prod){
           products.add(prod);
    }

    public void updateProduct(Product prod) {
       int index=0;
        for(int i=1;i< products.size();i++){
           if(products.get(i).getProdid()== prod.getProdid())
               index=1;
        }
        products.set(index,prod);

    }

    public void deleteProduct(int prodid) {
        int index=0;
        for(int i=1;i< products.size();i++){
            if(products.get(i).getProdid()== prodid)
                index=1;
        }
        products.remove(index);
    }
}
