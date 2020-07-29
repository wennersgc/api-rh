create table departamento(
    id bigserial primary  key ,
    descricao varchar (50) not null
);

insert into departamento(descricao) values ('Recursos Humanos');
insert into departamento(descricao) values ('Administração');
insert into departamento(descricao) values ('Conservação e Limpeza');
insert into departamento(descricao) values ('Tecnologia da Informação');
insert into departamento(descricao) values ('Contabilidade');
insert into departamento(descricao) values ('Compras');
