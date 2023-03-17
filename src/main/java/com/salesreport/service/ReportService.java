package com.salesreport.service;

import com.salesreport.model.OrderReport;
import com.salesreport.repository.OrderReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportService {
    private final OrderReportRepository orderReportRepository;

    public List<OrderReport> getOrderReport(LocalDate startDate, LocalDate endDate){
        return orderReportRepository.findByOrderDateBetween(startDate, endDate);
    }
}
