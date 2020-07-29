alter table servidor add column departamento_id bigserial;
alter table servidor add foreign key (departamento_id) references departamento;

update servidor set departamento_id = 4  where id = 1;
update servidor set departamento_id = 5  where id = 2;
update servidor set departamento_id = 6  where id = 3;
