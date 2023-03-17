package com.salesreport.repository;

import com.salesreport.model.OrderReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderReportRepository extends JpaRepository<OrderReport, UUID> {
    Optional<OrderReport> findByOrderDate(LocalDate localDate);
    List<OrderReport> findByOrderDateBetween(LocalDate start, LocalDate endDate);
}
