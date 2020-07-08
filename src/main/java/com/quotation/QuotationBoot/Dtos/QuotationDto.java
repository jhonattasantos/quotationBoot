package com.quotation.QuotationBoot.Dtos;

import java.util.Date;
import java.util.List;

public class QuotationDto {
    public String name;
    public String createdBy;
    public String createdAt;
    public List<ItemQuotationDto> items;
}
