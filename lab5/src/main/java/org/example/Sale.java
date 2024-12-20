package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sale {
    private String product;
    private String manufacturer;
    private String buyer;
    private int quantity;
    private double pricePerUnit;
    private double totalPrice;

    public Sale(String product, String manufacturer, String buyer, int quantity, double pricePerUnit, double totalPrice) {
        this.product = product;
        this.manufacturer = manufacturer;
        this.buyer = buyer;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.totalPrice = totalPrice;
    }

    private void calculateTotalPrice() {
        this.totalPrice = this.quantity * this.pricePerUnit;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Кількість товару повинна бути більшою за 0");
        }
        this.quantity = quantity;
        calculateTotalPrice();
    }

    public void setPricePerUnit(double pricePerUnit) {
        if (pricePerUnit <= 0) {
            throw new IllegalArgumentException("Ціна за одиницю повинна бути більшою за 0");
        }
        this.pricePerUnit = pricePerUnit;
        calculateTotalPrice();
    }


    @Override
    public String toString() {
        return "Продаж{" +
                "Товар='" + product + '\'' +
                ", Виробник='" + manufacturer + '\'' +
                ", Покупець='" + buyer + '\'' +
                ", Кількість=" + quantity +
                ", Ціна за одиницю=" + pricePerUnit +
                ", Загальна вартість=" + totalPrice +
                '}';
    }
}