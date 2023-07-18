package br.com.banco.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
@Table(name = "Account")
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_conta;

    @Column (length = 50, nullable = false, name = "nome_responsavel")
    private String nome_responsavel;

}
