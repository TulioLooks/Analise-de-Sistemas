package br.edu.iftm.ds.exemplos.arquitetura.domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Data
@Builder
@AllArgsConstructor

public class Cliente {

    private Integer codigo;

    private String nome;
}
