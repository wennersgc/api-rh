create table departamento_cargo(
    departamento_id bigserial,
    cargo_id bigserial
);
alter table departamento_cargo add foreign key (departamento_id) references departamento;
alter table departamento_cargo add foreign key (cargo_id) references cargo;