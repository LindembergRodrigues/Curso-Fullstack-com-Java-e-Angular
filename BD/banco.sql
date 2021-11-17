create database digital_innovation_one;

create table aluno(
	id Integer primary key auto_increment,
    nome varchar(80) not null,
    idade integer not null,
    estado character(2) not null);
    
insert into aluno(nome,idade,estado) values ("pedro", 20, "RJ");
insert into aluno(nome,idade,estado) values ("Maria", 35, "AC");
insert into aluno(nome,idade,estado) values ("João", 10, "SC");
insert into aluno(nome,idade,estado) values ("pedro", 20, "RJ");


