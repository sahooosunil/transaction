package com.sks.transaction.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class TransactionService {
    private final List<String> currentStocksList;

    public TransactionService() {
        currentStocksList = new ArrayList<>(List.of("Wipro", "Reliance", "HDFC", "ITR", "TCS", "Bharat Petroleum", "Nestle"));
    }

    public List<String> getStockList() {
        return getCurrentStocksList();
    }
}
