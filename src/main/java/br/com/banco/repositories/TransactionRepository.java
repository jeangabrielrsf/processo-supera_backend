package br.com.banco.repositories;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.banco.models.Transaction;
import java.security.Timestamp;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByAccountid(int accountid);
    List<Transaction> findByNomeoperador(String nomeoperador);

    @Query(value = "FROM Transaction t WHERE t.datatransferencia >= ?1 AND t.datatransferencia <= ?2")
    List<Transaction> findByDateRange(String initialDate, String finalDate);
}
