package com.api.rh.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Entity(name = "servidor")
public class Servidor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 10, max = 30)
    private String nome;

    @NotNull
    @Column(name = "data_nascimento")
    @Past
    private LocalDate dataNascimento;

    @Pattern(regexp = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})")
    private String telefone;

    @NotNull
    @Pattern(regexp = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})")
    private String celular;

    @NotNull
    @Email
    private String email;

    @NotNull
    @CPF
    @Column(unique = true)
    private String cpf;
    
    private String rg;

    @Valid
    @Embedded
    private Endereco endereco;

    @ManyToOne
    @Valid
    @JoinColumn (name = "cargo_id")
    private Cargo cargo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servidor servidor = (Servidor) o;
        return id.equals(servidor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
