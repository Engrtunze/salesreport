package com.salesreport.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderCreationPayload {
    private String name;
    private String description;
    private String customerName;
    private String customerPhoneNumber;
    private Double unitPriceAtOrder;
    private BigDecimal totalUnitPriceAtOrder;
    private Integer quantity;
}
