package com.example.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    @Query("SELECT e FROM ExchangeValue e WHERE e.from_currency = :from AND e.to_currency = :to")
    ExchangeValue findExchangeValue(String from, String to);
}
