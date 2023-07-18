package br.com.banco.models;

import java.security.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Transaction")
public class Transaction {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO )
    private Long id;

    @Column (nullable = false, name = "data_transferencia")
    private Timestamp data_transferencia;

    @Column (nullable = false, name = "valor")
    private double valor;

    @Column (nullable = false, length = 15, name = "tipo")
    private String tipo;

    @Column (length = 50, name = "nome")
    private String nomeOperador;

    @Column (nullable = false)
    private int accountId;

}
