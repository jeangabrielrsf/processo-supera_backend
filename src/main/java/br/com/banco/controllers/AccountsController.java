package br.com.banco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.models.Account;
import br.com.banco.services.AccountService;

@RestController
@RequestMapping

public class AccountsController {
    @Autowired
    private AccountService accountsService;

    @GetMapping("/contas")
    public List<Account> listAllAccounts() {
        return accountsService.listAll();
    }
}
