package br.com.banco.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
@Table(name = "conta")
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_conta;

    @Column (length = 50, nullable = false)
    private String nome_responsavel;

}
