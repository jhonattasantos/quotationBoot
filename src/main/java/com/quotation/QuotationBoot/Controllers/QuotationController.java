package com.quotation.QuotationBoot.Controllers;

import com.quotation.QuotationBoot.Dtos.QuotationDto;
import com.quotation.QuotationBoot.Entities.Quotation;
import com.quotation.QuotationBoot.Repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "api/quotations")
public class QuotationController {

    @Autowired
    private QuotationRepository _repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Quotation> quotations()
    {
        return _repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public QuotationDto toCreate(@RequestBody QuotationDto quotationDto) throws Exception {
        _repository.save(quotationDto.quotation());
        return quotationDto;
        //return _repository.save(quotation);
    }
}
