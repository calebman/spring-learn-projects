package com.spring.ioc.offrate;

import com.spring.ioc.book.Book;

/**
 * @author calebman
 * @date 2018/9/5
 * @description
 */
public class BookWithOffRate extends Book implements OffRateInterface {
    private Double offRate;

    @Override
    public Double getOffRate() {
        return this.offRate;
    }

    @Override
    public void setOffRate(Double offRate) {
        this.offRate = offRate;
    }

    @Override
    public Double getPrice() {
        if (this.offRate == null) {
            return super.getPrice();
        }
        return 0.1 * this.offRate * super.getPrice();
    }
}
