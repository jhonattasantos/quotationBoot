package com.quotation.QuotationBoot.Repository;

import com.quotation.QuotationBoot.Entities.Quotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotationRepository extends JpaRepository<Quotation, Long> {
}
