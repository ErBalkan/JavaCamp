package OOPWithNLayeredApp.DataAccess;

import OOPWithNLayeredApp.Entities.Product;

public class HibernateProductDao implements ProductDao{
    // Bu sınıfta sadece veri erişim kodu yazılır.
     public void add(Product product){
        System.out.println("Product is added by Hibernate");
     }
}
