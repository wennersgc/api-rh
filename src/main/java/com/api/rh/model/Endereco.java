package com.api.rh.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@Embeddable
public class Endereco {
    @NotNull
    @Size(min = 5, max = 50)
    private String logradouro;

    @NotNull
    @Size(min=1, max = 10)
    private String numero;

    @NotNull
    @Size(min = 5, max = 50)
    private String bairro;

    @NotNull
    @Size(min = 5, max = 50)
    @Pattern(regexp = "^\\d{5}-\\d{3}$")
    private String cep;

    @NotNull
    @Size(min = 5, max = 50)
    private String cidade;

    @NotNull
    @Size(min = 5, max = 50)
    private String estado;


}
