CREATE DATABASE db_construindo_vidas;
USE db_construindo_vidas;

CREATE TABLE tb_categorias (
	id bigint auto_increment primary key,
	nome varchar(50) not null,
	descricao varchar(255)
);

CREATE TABLE tb_produtos (
	id bigint auto_increment primary key,
	nome varchar(50) not null,
    marca varchar(50) not null,       
    preco decimal(6,2),
    quantidade int,    
    fk_categoria bigint,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categorias (id)
);

INSERT INTO tb_categorias (nome, descricao) VALUES
	("Tintas", "Tintas especiais para ambientes úmidos, tintas à base de água e solvente, vernizes e seladores."),
    ("Ferragens", "Parafusos, porcas, arruelas, dobradiças, fechaduras, maçanetas, trincos, pregos, ferramentas manuais e ferramentas de fixação."),
    ("Serralheria", "Engloba portões, grades, estruturas metálicas, corrimãos, guarda-corpos, acessórios para janelas e portas, e serviços de soldagem."),
    ("Paisagismo", "grama sintética, vasos, plantas ornamentais, adubos, substratos, pedras decorativas, cascas de árvore, e sistemas de irrigação."),
    ("Hidráulica", "Tubos de PVC, conexões, registros, torneiras, válvulas de descarga, caixas d'água, bombas de água, aquecedores, filtros e purificadores.");
    
INSERT INTO tb_produtos (nome, marca, preco, quantidade, fk_categoria) VALUES
	("Tinta Branca 18 litros", "Coral", 129.99, 50, 1),
    ("Tinta Turquesa 3,8 litros", "Coral", 46.99, 85, 1),
    ("Parafuso Sextavado 1/4 - 10 Unidades", "Fixtil", 32.99, 100, 2),
    ("Fechadura 40mm", "Papaiz", 129.99, 25, 2),
    ("Soldador para Solda PSV0100", "Vonder", 156.99, 10, 3),
    ("Tesoura Para Poda 200mm", "Palisad", 25.99, 30, 4),
    ("Tubo de PVC para Esgoto", "Tigre", 29.99, 120, 5),
    ("Adaptador Curto para Registro", "Tigre", 7.99, 300, 5);
    
SELECT * FROM tb_produtos 
WHERE preco > 100.00;

SELECT * FROM tb_produtos 
WHERE preco > 70.00 
AND preco < 150.00;

SELECT * FROM tb_produtos
WHERE nome LIKE "%c%";

SELECT * FROM tb_produtos P 
INNER JOIN tb_categorias  C 
ON P.fk_categoria = C.id;

SELECT * FROM tb_produtos P 
INNER JOIN tb_categorias  C 
ON P.fk_categoria = C.id
WHERE C.nome = "Tintas";