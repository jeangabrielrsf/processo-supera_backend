package br.com.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.models.Transfers;

public interface TransfersRepository extends JpaRepository<Transfers, Long> {
    
}
