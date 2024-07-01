CREATE DATABASE db_curso_da_minha_vida;
USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias (
	id bigint auto_increment primary key,
	nome varchar(150) not null
);

CREATE TABLE tb_cursos  (
	id bigint auto_increment primary key,
	nome varchar(50) not null,    
    preco decimal(6,2),
	quantidade_alunos int,
    instrutor varchar(50) not null,     
    fk_categoria bigint,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categorias (id)
);

INSERT INTO tb_categorias (nome) VALUES
	("Marketing Digital"),
    ("Design Gráfico"),
    ("Empreendedorismo"),
    ("Finanças"),
    ("Arte e Fotografia");
    
INSERT INTO tb_cursos (nome, preco, quantidade_alunos, instrutor, fk_categoria) VALUES
	("Estratégias de conteúdo digital", 639.99, 40, "Maria Sousa", 1),
    ("Analytics", 849.90, 30, "André Almeida", 1),
    ("Adobe Photoshop", 639.99, 40, "Carla Lima", 2),
    ("Design de interfaces (UI/UX)", 629.99, 35, "Mônica Ramos", 2),
    ("Gestão de projetos", 429.99, 30, "Marcos Pessoa", 3),
    ("Gestão de dívidas", 319.99, 5, "Nathalia Araújo", 4),
    ("Técnicas de pintura", 719.99, 60, "Arthur Maia", 5),
    ("Fotografia de retrato", 879.99, 30, "Vivian Kaori", 5);
    
SELECT * FROM tb_cursos 
WHERE preco > 500.00;

SELECT * FROM tb_cursos 
WHERE preco > 600.00 
AND preco < 1000.00;

SELECT * FROM tb_cursos
WHERE nome LIKE "%j%";

SELECT * FROM tb_cursos P 
INNER JOIN tb_categorias  C 
ON P.fk_categoria = C.id;

SELECT * FROM tb_cursos P 
INNER JOIN tb_categorias  C 
ON P.fk_categoria = C.id
WHERE C.nome = "Empreendedorismo";