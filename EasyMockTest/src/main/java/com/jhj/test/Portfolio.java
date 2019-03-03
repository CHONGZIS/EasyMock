package com.jhj.test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by huajianJin on 2019/3/3.
 */
public class Portfolio {
    private String name;
    private  StockMarket stockMarket;
    private List<Stock> stocks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StockMarket getStockMarket() {
        return stockMarket;
    }

    public void setStockMarket(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
         this.stocks = stocks;
    }

    public void addStock(Stock stock){
        stocks.add(stock);
    }


    public Double getTotalValue(){
        Double value =0.0;
        for (Stock stock : this.stocks) {
            value += (stockMarket.getPrice(stock.getName()) * stock.getQuantity());
        }
        return value;
    }

}
