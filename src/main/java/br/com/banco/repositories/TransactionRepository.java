package br.com.banco.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.banco.models.Transaction;
import java.security.Timestamp;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByAccountid(int accountid);
    List<Transaction> findByNomeOperador(String nomeOperador);

    @Query(value = "SELECT * FROM Transaction t WHERE t.datatransferencia > :initialDate AND t.datatransferencia < :finalDate", nativeQuery = true)
    List<Transaction> findByDateRange(@Param("initialDate") java.sql.Timestamp initialDate, @Param("finalDate") java.sql.Timestamp finalDate);
}
