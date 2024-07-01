CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;

CREATE TABLE tb_categorias (
	id bigint auto_increment primary key,
	nome varchar(50) not null,
	armazenamento varchar(50)
);

CREATE TABLE tb_produtos (
	id bigint auto_increment primary key,
	nome varchar(50) not null,    
    preco decimal(6,2),
    datavalidade date,
    quantidade_kg int,    
    fk_categoria bigint,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categorias (id)
);

INSERT INTO tb_categorias (nome, armazenamento) VALUES
	("Bovina", "Refrigerado"),
    ("Suína", "Refrigerado"),
    ("Ave", "Congelado"),
    ("Embutido", "Refrigerado"),
    ("Cordeiro", "Refrigerado");
    
INSERT INTO tb_produtos (nome, preco, datavalidade, quantidade_kg, fk_categoria) VALUES
	("Picanha", 74.99, "2024-08-02", 30, 1),
    ("Alcatra", 49.90, "2024-08-15", 100, 1),
    ("Lombo", 16.99, "2024-08-08", 60, 2),
    ("Coxa de Frango", 14.99, "2024-07-26", 40, 3),
    ("Filé de Frango", 22.99, "2024-07-30", 120, 3),
    ("Linguiça Calabresa", 19.99, "2024-09-22", 200, 4),
    ("Pastrami", 42.99, "2024-09-17", 40, 4),
    ("Costeleta de Cordeiro", 79.99, "2024-07-29", 20, 5);
    
SELECT * FROM tb_produtos 
WHERE preco > 50.00;

SELECT * FROM tb_produtos 
WHERE preco > 50.00 
AND preco < 150.00;

SELECT * FROM tb_produtos
WHERE nome LIKE "%c%";

SELECT * FROM tb_produtos P 
INNER JOIN tb_categorias  C 
ON P.fk_categoria = C.id;

SELECT * FROM tb_produtos P 
INNER JOIN tb_categorias  C 
ON P.fk_categoria = C.id
WHERE C.nome = "Ave";