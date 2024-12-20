package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleStorage{
    List<Sale> sales = new ArrayList<>();

    public void addSale(Sale sale) {
        sales.add(sale);
    }

    public void removeSale(int index) {
        if (index >= 0 && index < sales.size()) {
            sales.remove(index);
        } else {
            throw new IllegalArgumentException("Індекс поза межами списку");
        }
    }

    public List<Sale> findSalesByProduct(String product) {
        return sales.stream()
                .filter(sale -> sale.getProduct().equalsIgnoreCase(product))
                .collect(Collectors.toList());
    }

    public List<Sale> findSalesByBuyer(String buyer) {
        return sales.stream()
                .filter(sale -> sale.getBuyer().equalsIgnoreCase(buyer))
                .collect(Collectors.toList());
    }

}
