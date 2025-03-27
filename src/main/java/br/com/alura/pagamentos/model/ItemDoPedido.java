package br.com.alura.pagamentos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDoPedido {
    private Long id;
    private Integer quantidade;
    private String descricacao;
}
