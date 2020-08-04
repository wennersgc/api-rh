alter table cargo add column departamento_id bigserial;
alter table cargo add foreign key ( departamento_id) references  departamento;