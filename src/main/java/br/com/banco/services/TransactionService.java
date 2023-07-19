package br.com.banco.services;

import java.security.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.models.Transaction;
import br.com.banco.repositories.TransactionRepository;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> listAll() {
        return transactionRepository.findAll();
    }

    public List<Transaction> listByAccountId(int accountid) {
        return transactionRepository.findByAccountid(accountid);
    }

    public List<Transaction> listByName(String name) {
        return transactionRepository.findByNomeoperador(name);
    }

    public List<Transaction> listByDateRange(String initialDate, String finalDate) {
        return transactionRepository.findByDateRange(initialDate, finalDate);
    }
}
