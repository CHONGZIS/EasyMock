package com.jhj.test;

import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by huajianJin on 2019/3/3.
 */
public class PortfolioTest extends TestCase {
    private Portfolio portfolio;
    private StockMarket marketMock;


    @Before
    public void setUp() throws Exception {
        portfolio = new Portfolio();
        portfolio.setName("jin's portfolio");
        marketMock = EasyMock.createMock(StockMarket.class);//创建mock对象代替接口的实现对象
        portfolio.setStockMarket(marketMock);
    }

    @Test
    public void testGetTotalValue(){
        // Setup our mock object with the expected values
        //接口中方法是Double getPrice(String stockName);
        //EasyMock.expect(mockObj.function(input))/andReturn(expected output)
        EasyMock.expect(marketMock.getPrice("EBAY")).andReturn(42.00);
        EasyMock.replay(marketMock);

        // Now start testing our portfolio
        Stock ebayStock = new Stock("EBAY",2);
        portfolio.addStock(ebayStock);
        assertEquals(84.00, portfolio.getTotalValue());

    }

    @After
    public void tearDown() throws Exception {
    }
}