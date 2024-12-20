import org.example.Sale;
import org.example.SaleStorage;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Task19Test {

    SaleStorage saleStorage = new SaleStorage();

    @Test
    public void testAddSale() {
        Sale sale = new Sale("Product1", "Manufacturer1", "Buyer1", 5, 100, 500);

        saleStorage.addSale(sale);

        assertEquals(1, saleStorage.getSales().size());
    }

    @Test
    public void testRemoveSale() {
        Sale sale1 = new Sale("Product1", "Manufacturer1", "Buyer1", 5, 100, 500);
        Sale sale2 = new Sale("Product2", "Manufacturer2", "Buyer2", 3, 200, 600);

        saleStorage.addSale(sale1);
        saleStorage.addSale(sale2);

        saleStorage.removeSale(0);

        assertEquals(1, saleStorage.getSales().size());
        assertEquals("Product2", saleStorage.getSales().get(0).getProduct());
    }

    @Test
    public void testFindSalesByProduct() {
        Sale sale1 = new Sale("Product1", "Manufacturer1", "Buyer1", 5, 100, 500);
        Sale sale2 = new Sale("Product1", "Manufacturer2", "Buyer2", 3, 200, 600);
        Sale sale3 = new Sale("Product2", "Manufacturer1", "Buyer3", 4, 150, 600);

        saleStorage.addSale(sale1);
        saleStorage.addSale(sale2);
        saleStorage.addSale(sale3);

        List<Sale> result = saleStorage.findSalesByProduct("Product1");

        assertEquals(2, result.size());
    }

    @Test
    public void testFindSalesByBuyer() {
        Sale sale1 = new Sale("Product1", "Manufacturer1", "Buyer1", 5, 100, 500);
        Sale sale2 = new Sale("Product2", "Manufacturer1", "Buyer2", 3, 150, 450);
        Sale sale3 = new Sale("Product3", "Manufacturer2", "Buyer1", 7, 200, 1400);

        saleStorage.addSale(sale1);
        saleStorage.addSale(sale2);
        saleStorage.addSale(sale3);

        List<Sale> result = saleStorage.findSalesByBuyer("Buyer1");

        assertEquals(2, result.size());
    }

    @Test
    public void testRemoveSaleWithInvalidIndex() {
        Sale sale = new Sale("Product1", "Manufacturer1", "Buyer1", 5, 100, 500);

        saleStorage.addSale(sale);

        assertThrows(IllegalArgumentException.class, () -> saleStorage.removeSale(1));
    }
}
