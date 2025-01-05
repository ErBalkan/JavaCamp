package OOPWithNLayeredApp;

import java.util.List;

import OOPWithNLayeredApp.Business.ProductManager;
import OOPWithNLayeredApp.Core.Logging.DatabaseLogger;
import OOPWithNLayeredApp.Core.Logging.FileLogger;
import OOPWithNLayeredApp.Core.Logging.Logger;
import OOPWithNLayeredApp.DataAccess.HibernateProductDao;
import OOPWithNLayeredApp.Entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone Xr", 10000);
        
        List<Logger> loggers = List.of(new DatabaseLogger(), new FileLogger());
        
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
