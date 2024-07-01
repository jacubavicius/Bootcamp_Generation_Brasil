#1. Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos estudantes deste registro dessa escola. 
CREATE DATABASE db_escola;
USE db_escola;

#2. Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos relevantes dos estudantes para se trabalhar com o serviço dessa escola.
CREATE TABLE tb_estudantes (
	id BIGINT auto_increment primary key,
    nome varchar(150) not null,
    datanascimento varchar(10) not null,
    serie varchar (50),
    media decimal(6,2)    
);

#3. Insira nesta tabela no mínimo 8 dados (registros).
INSERT INTO tb_estudantes(nome, datanascimento, serie, media) 
VALUES ("Lucas Oliveira", "2008-07-10", "9º ano", 8.2),
       ("Isabela Santos", "2007-05-15", "8º ano", 6.4),
       ("Gabriel Silva", "2006-09-20", "9º ano", 4.9),
       ("Mariana Costa", "2007-02-28", "8º ano", 10),
       ("Matheus Almeida", "2006-11-12", "9º ano", 7.3),
       ("Laura Gonçalves", "2007-08-05", "8º ano", 9.1),
       ("Pedro Rocha", "2008-03-25", "9º ano", 5.8),
       ("Giovanna Lima", "2007-12-18", "8º ano", 9.7);

#4. Faça um SELECT que retorne todes o/a(s) estudantes com a nota maior do que 7.0.
SELECT * FROM tb_estudantes WHERE media > 7.0;

#5. Faça um SELECT que retorne todes o/a(s) estudantes com a nota menor do que 7.0.
SELECT * FROM tb_estudantes WHERE media < 7.0;

#6. Ao término atualize um registro desta tabela através de uma query de atualização.
UPDATE tb_estudantes SET media = 5.0 WHERE id = 3;