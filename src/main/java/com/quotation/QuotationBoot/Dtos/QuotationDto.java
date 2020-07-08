package com.quotation.QuotationBoot.Dtos;

import com.quotation.QuotationBoot.Entities.Quotation;

import java.util.Date;
import java.util.List;

public class QuotationDto {
    public String name;
    public String createdBy;
    public String createdAt;
    public List<ItemQuotationDto> items;

    public Quotation quotation()
    {
        return new Quotation(this.name, this.createdBy, new Date());
    }
}
