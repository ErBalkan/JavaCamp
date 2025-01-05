package OOPWithNLayeredApp.Business;

import java.util.List;

import OOPWithNLayeredApp.Core.Logging.Logger;
import OOPWithNLayeredApp.DataAccess.ProductDao;
import OOPWithNLayeredApp.Entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {   
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{
        // İş kuralları - business rules
        if(product.getUnitPrice() < 10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
        }

        productDao.add(product);

        for(Logger logger : loggers){
            logger.log(product.getName());
        }
    }
}
