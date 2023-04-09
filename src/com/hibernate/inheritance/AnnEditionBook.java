package com.hibernate.inheritance;

public class AnnEditionBook extends Book{
    private int discount;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
