package com.quotation.QuotationBoot.Entities;

import com.quotation.QuotationBoot.Common.AbstractEntity;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "quotations")
public class Quotation extends AbstractEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_at")
    private Date createdAt;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "quotation_id", nullable = false)
    private List<ItemQuotation> itemsQuotation;

    public Quotation(String name, String createdBy, Date createdAt) {
        this.name = name;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }

    public void addItemsQuotation(List<ItemQuotation> itemsQuotation) {
        for(var item : itemsQuotation){
            this.itemsQuotation.add(item);
        }
    }
}
