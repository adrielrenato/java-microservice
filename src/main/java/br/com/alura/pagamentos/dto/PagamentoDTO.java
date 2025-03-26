package br.com.alura.pagamentos.dto;

import br.com.alura.pagamentos.model.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PagamentoDTO {
        private Long id;

        @NotNull
        @Positive
        private BigDecimal valor;

        @NotBlank
        private String nome;

        @NotBlank
        @Size(max = 19)
        private String numero;

        @NotBlank
        @Size(max = 7)
        private String expiracao;

        @NotBlank
        @Size(min = 3, max = 3)
        private String codigo;

        @NotNull
        @Enumerated(EnumType.STRING)
        private Status status;

        @NotNull
        private Long pedidoId;

        @NotNull
        private Long formaDePagamentoId;
}
