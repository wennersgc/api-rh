create table servidor(
    id bigserial primary key,
    nome varchar (30) not null,
    data_nascimento date not null,
    telefone varchar (20),
    email varchar(50) not null,
    celular varchar(20) not null,
    cpf varchar (15) not null,
    rg varchar (15),
    logradouro varchar(50) not null,
	numero varchar(10) not null,
	bairro varchar(50) not null,
	cep varchar(30) not null,
	cidade varchar(50) not null,
	estado varchar(50) not null
);
