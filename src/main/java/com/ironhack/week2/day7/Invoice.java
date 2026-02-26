package com.ironhack.week2.day7;

import java.math.BigDecimal;
import java.util.List;

public class Invoice {
    private String id;
    private BigDecimal total;
    private boolean isPaid;
    private List<InvoiceItem> invoiceItems;

    public Invoice(String id, BigDecimal total, boolean isPaid, List<InvoiceItem> invoiceItems) {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        this.id = id;
        if (total == null) {
            throw new IllegalArgumentException("Total cannot be null");
        }
        this.total = total;
        this.isPaid = isPaid;
        if  (invoiceItems == null) {
            throw new IllegalArgumentException("Invoice items must be specified");
        }
        this.invoiceItems = invoiceItems;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", isPaid=" + isPaid +
                ", invoiceItems=" + invoiceItems +
                '}';
    }
}
