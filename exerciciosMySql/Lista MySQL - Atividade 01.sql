#1. Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos colaboradores desta empresa.
CREATE DATABASE db_recursoshumanos;
USE db_recursoshumanos;

#2. Crie uma tabela de colaboradores e determine 5 atributos relevantes dos colaboradores para se trabalhar com o serviço deste RH.
CREATE TABLE tb_colaboradores (
	id BIGINT auto_increment primary key,
    nome varchar(150) not null,
    cpf varchar(14) not null,
    cargo varchar(100),
    salario decimal (6,2)
);

#3. Insira nesta tabela no mínimo 5 dados (registros).
INSERT INTO tb_colaboradores(nome, cpf, cargo, salario) 
VALUES ("Ana Silva", "123.456.789-00", "Analista de Marketing", 4500.00),
       ("João Oliveira", "987.654.321-00", "Desenvolvedor de Software", 6200.00),
       ("Maria Santos", "234.567.890-00", "Gerente de Vendas", 8000.00),
       ("Pedro Souza", "876.543.210-00", "Assistente Administrativo", 3200.00),
       ("Luiza Pereira", "345.678.901-00", "Analista Financeiro", 5000.00);

#4. Faça um SELECT que retorne todes os colaboradores com o salário maior do que 2000.
SELECT * FROM tb_colaboradores WHERE salario > 2000;

#5. Faça um SELECT que retorne todes os colaboradores com o salário menor do que 2000.
SELECT * FROM tb_colaboradores WHERE salario < 2000;

#6. Ao término atualize um registro desta tabela através de uma query de atualização.
UPDATE tb_colaboradores SET salario = 3600.00 WHERE nome = "Pedro Souza";