#1. Crie um banco de dados para um e-commerce, onde o sistema trabalhará com as informações dos produtos deste e-commerce. 
CREATE DATABASE db_ecommerce;
USE db_ecommerce;

#2. Crie uma tabela de produtos e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste e-commerce.
CREATE TABLE tb_produtos (
	id bigint auto_increment primary key,
    nome varchar(150) not null,
    preco decimal(6,2) not null,
    quantidade int,
    descricao varchar(350)
);

#3. Insira nesta tabela no mínimo 8 dados (registros).
INSERT INTO tb_produtos (nome, preco, quantidade, descricao)
VALUES ("Geladeira Frost Free", 2500.00, 10, "Geladeira Frost Free com capacidade para 380 litros, tecnologia avançada de refrigeração"),
	   ("Forno Elétrico Chef", 800.00, 15, "Forno elétrico com capacidade para 50 litros, várias funções de cozimento e timer digital"),
	   ("Máquina de Lavar Roupa 10kg", 1200.00, 15, "Máquina de lavar roupa com capacidade de 10kg, diversos programas de lavagem e eficiência energética A+"),
	   ("Micro-ondas 30L", 450.00, 30, "Micro-ondas com capacidade de 30 litros, várias potências de aquecimento e função descongelamento rápido."),
       ("Liquidificador ProBlend 6", 180.00, 50, "Liquidificador com 800W de potência, jarra resistente a impactos, ideal para preparar sucos e vitaminas."),
	   ("Aspirador de Pó", 300.00, 20, "Aspirador de pó com filtro HEPA, potência de sucção eficiente, ideal para todos os tipos de piso."),
	   ("Cafeteira Expresso Mini", 400.00, 35, "Cafeteira expresso com sistema de cápsulas, design compacto e aquecimento rápido."),
	   ("Panela Elétrica de Arroz", 120.00, 30, "Panela elétrica com capacidade para 5 xícaras de arroz, com função automática de manter aquecido.");
       
#4. Faça um SELECT que retorne todes os produtos com o valor maior do que 500.
SELECT * FROM tb_produtos WHERE preco > 500.00;

#5. Faça um SELECT que retorne todes os produtos com o valor menor do que 500.
SELECT * FROM tb_produtos WHERE preco < 500.00;

#6. Ao término atualize um registro desta tabela através de uma query de atualização.
UPDATE tb_produtos SET preco = 3000.00 WHERE id = 1;
