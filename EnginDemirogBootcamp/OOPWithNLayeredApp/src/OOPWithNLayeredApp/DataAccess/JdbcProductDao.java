package OOPWithNLayeredApp.DataAccess;

import OOPWithNLayeredApp.Entities.Product;

public class JdbcProductDao implements ProductDao{
    // Bu sınıfta sadece veri erişim kodu yazılır.
     public void add(Product product){
        System.out.println("Product is added by Jdbc");
     }
}
