CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categorias (
	id bigint auto_increment primary key,
	nome_categoria varchar(100) not null,
    tipo_massa varchar(100) not null
);

CREATE TABLE tb_pizzas (
	id bigint auto_increment primary key,
	nome varchar(100) not null,
    descricao varchar(100) not null,
    preco decimal (6,2),
    fk_categoria bigint,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome_categoria, tipo_massa) 
VALUES("Salgada", "Tradicional"),
      ("Salgada", "Integral"),
      ("Doce", "Tradicional"),
      ("Doce", "Integral"),
      ("Doce/Salgada", "Tradicional");
    
INSERT INTO tb_pizzas (nome, descricao, preco, fk_categoria) 
VALUES ("Margherita", "Tradicional pizza italiana com molho de tomate, queijo mussarela e manjericão fresco", 69.90, 1),
		("Pepperoni", "Pizza com molho de tomate, queijo mussarela e pepperoni fatiado", 52.50, 2),
		("Quatro Queijos", "Pizza com molho de tomate, queijo mussarela, parmesão, gorgonzola e catupiry", 44.90, 2),
		("Calabresa", "Pizza com molho de tomate, queijo mussarela e calabresa fatiada", 30.50, 1),
		("Chocolate com Morango", "Pizza doce com cobertura de chocolate, morangos frescos e açúcar de confeiteiro", 67.90, 3),
		("Frango com Catupiry", "Pizza salgada com molho de tomate, queijo mussarela, frango desfiado e catupiry", 31.90, 2),
		("Banana com Canela", "Pizza doce com banana fatiada, açúcar e canela", 45.90, 4);
        
SELECT * FROM tb_pizzas
WHERE preco > 45.00;

SELECT * FROM tb_pizzas 
WHERE preco > 50.00 
AND preco < 100.00;

SELECT * FROM tb_pizzas 
WHERE nome LIKE "%m%";

SELECT * FROM tb_pizzas P 
INNER JOIN tb_categorias C 
ON P.fk_categoria = C.id;

SELECT * FROM tb_pizzas P 
INNER JOIN tb_categorias C 
ON P.fk_categoria = C.id
WHERE C.nome_categoria = "Doce";