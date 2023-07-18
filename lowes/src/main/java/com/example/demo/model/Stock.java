package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "STOCK")
public class Stock {
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
    @Column(name = "STOCK_TICKER")
    private String stockTicker;
    @Column(name = "STOCK_NAME")
    private String stockName;
    @Column(name = "QUANTITY_PURCHASED")
    private String quantityPurchased;
    @Column(name = "AMOUNT_SPENT")
    private String amountSpent;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "CREATED_TS")
    private String createTS;

}
