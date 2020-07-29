create table servidor(
    id bigserial primary key,
    nome varchar (30) not null,
    data_nascimento date not null,
    telefone varchar (20),
    email varchar(50) not null,
    celular varchar(20) not null,
    cpf varchar (15) not null,
    rg varchar (15) not null,
    logradouro varchar(50),
	numero varchar(10),
	bairro varchar(50),
	cep varchar(30),
	cidade varchar(50),
	estado varchar(50)
);

insert into servidor(nome, data_nascimento, telefone, email, celular, cpf, rg, logradouro, numero, bairro, cep, cidade, estado)
values ('Pedro Silva', '2012-12-18', '22222222', 'pedrosilva@pedro.com','000000000000000','99999999999999', '44444444444',
'rua de cima', '21', 'Alemanha', '11111111', 'São Luis', 'MA');

insert into servidor(nome, data_nascimento, telefone, email, celular, cpf, rg, logradouro, numero, bairro, cep, cidade, estado)
values ('Antonio Maria', '2012-12-18', '22222222', 'antoniomaria@antonio.com','000000000000000','99999999999999', '44444444444',
'rua de cima', '21', 'Alemanha', '11111111', 'São Luis', 'MA');

insert into servidor(nome, data_nascimento, telefone, email, celular, cpf, rg, logradouro, numero, bairro, cep, cidade, estado)
values ('Marcos Antonio', '2012-12-18', '22222222', 'mantonio@antonio.com','000000000000000','99999999999999', '44444444444',
'rua de cima', '21', 'Alemanha', '11111111', 'São Luis', 'MA');