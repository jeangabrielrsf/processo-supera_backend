package br.com.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.models.Account;

public interface AccounstRepository extends JpaRepository<Account, Long> {
    
}
