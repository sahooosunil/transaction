package com.sks.transaction.controller;

import com.sks.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TransController {
    private final TransactionService transactionService;
    @GetMapping("/stockList")
    public List<String> getStockList(){
        return transactionService.getStockList();
    }

}
