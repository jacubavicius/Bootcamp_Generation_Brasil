CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
	id bigint auto_increment primary key,
	nome varchar(100) not null,
	descricao varchar(255)
);

CREATE TABLE tb_produtos (
	id bigint auto_increment primary key,
	nome varchar(100) not null,    
    marca varchar(50) not null, 
    preco decimal(6,2),
    quantidade int not null,   
    fk_categoria bigint,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome, descricao) VALUES
	("Analgésico", "Medicamentos utilizados para aliviar a dor, agindo no sistema nervoso central."),
    ("Antibiótico", "Substâncias que combatem infecções bacterianas no corpo humano."),
    ("Anti-inflamatório", "Medicamentos que reduzem a inflamação."),
    ("Antidepressivo", "Medicamentos usados para tratar distúrbios de humor, como depressão, ansiedade e transtorno obsessivo-compulsivo."),
    ("Antipiréticos", "Medicamentos utilizados para reduzir a febre.");
    
INSERT INTO tb_produtos (nome, marca, preco, quantidade, fk_categoria) VALUES
	("Paracetamol", "Neo Química", 8.99, 200, 1),
    ("Amoxicilina", "União Química", 13.05, 130, 2),
    ("Diclofenaco", "Medley", 14.99, 190, 3),
    ("Sertralina", "Eurofarma", 12.99, 140, 4),
    ("Ibuprofeno", "Cimed", 6.90, 270, 5),
    ("Azitromicina ", "Eurofarma", 18.29, 100, 2),
    ("Naproxeno", "Bayer", 28.69, 110, 3),
    ("Aspirina", "Bayer", 6.79, 230, 1);
    
SELECT * FROM tb_produtos 
WHERE preco > 50.00;

SELECT * FROM tb_produtos  
WHERE preco  > 5.00 
AND preco < 60.00;

SELECT * FROM tb_produtos 
WHERE nome LIKE "%c%";

SELECT * FROM tb_produtos P 
INNER JOIN tb_categorias C 
ON P.fk_categoria = C.id;

SELECT * FROM tb_produtos P 
INNER JOIN tb_categorias C 
ON P.fk_categoria = C.id
WHERE C.nome = "Antibiótico";