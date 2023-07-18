package br.com.banco.controllers;

import java.security.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.models.Transaction;
import br.com.banco.services.TransactionService;

@RestController
@RequestMapping

public class TransactionsController {
    @Autowired
    private TransactionService transactionService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/transferencias")
    public List<Transaction> listAllTransactions() {
        return transactionService.listAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/transferencias/conta/{accountId}")
    public List<Transaction> listAccountTransactions(@PathVariable int accountId) {
        return transactionService.listByAccountId(accountId);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/transferencias/operador/{nomeOperador}")
    public List<Transaction> listOperadorTransactions(@PathVariable String nomeOperador) {
        return transactionService.listByName(nomeOperador);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/transferencias/{initialDate}-{finalDate}") 
        public List<Transaction> listDatesTransaction(@PathVariable java.sql.Timestamp initialDate, java.sql.Timestamp finalDate) {
            return transactionService.listByDateRange(initialDate, finalDate);
        }
    }