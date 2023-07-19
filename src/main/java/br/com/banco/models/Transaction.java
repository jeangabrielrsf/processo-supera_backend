package br.com.banco.models;

import java.security.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

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
public class Transaction {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO )
    private Long id;

    @Column (nullable = false)
    private String datatransferencia;

    @Column (nullable = false)
    private double valor;

    @Column (nullable = false, length = 15)
    private String tipo;

    @Column (length = 50)
    private String nomeoperador;

    @Column (nullable = false)
    private int accountid;

}
