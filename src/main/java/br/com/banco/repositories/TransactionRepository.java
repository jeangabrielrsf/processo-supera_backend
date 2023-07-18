package br.com.banco.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountId(int accountId);
    List<Transaction> findByNomeOperador(String nomeOperador);
}
