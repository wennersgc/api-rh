alter table servidor add column departamento_id bigserial;
alter table servidor add foreign key (departamento_id) references departamento;