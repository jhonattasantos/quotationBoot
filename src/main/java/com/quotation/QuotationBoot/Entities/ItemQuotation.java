package com.quotation.QuotationBoot.Entities;

import com.quotation.QuotationBoot.Common.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "itens_quotation")
public class ItemQuotation extends AbstractEntity {

    @Column(name = "sequence_item")
    private int sequenceItem;
    private String code;
    private String description;
    private double quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ItemQuotation that = (ItemQuotation) o;
        return sequenceItem == that.sequenceItem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sequenceItem);
    }
}
