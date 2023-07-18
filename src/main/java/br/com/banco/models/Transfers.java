package br.com.banco.models;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class Transfers {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO )
    private Long id;

    @Column (nullable = false)
    private Timestamp data_transferencia;

    @Column (nullable = false)
    private double valor;

    @Column (nullable = false, length = 15)
    private String tipo;

    @Column (length = 50)
    private String nome_operador_transacao;

    @JoinColumn(name = "id_conta", referencedColumnName = "id", nullable = false)
    private int conta_id;
}
