CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classes(
	id bigint auto_increment primary key,
	nome varchar(50) not null,
	super_efetividade varchar(50),
    pouco_efetivo varchar(50)
);

CREATE TABLE tb_personagens (
	id bigint auto_increment primary key,
	nome varchar(50) not null,    
    habilidade varchar(50) not null,
    ataque int not null,
    defesa int not null,    
    fk_tipoid bigint,
    FOREIGN KEY (fk_tipoid) REFERENCES tb_classes(id)
);

INSERT INTO tb_classes (nome, super_efetividade, pouco_efetivo) VALUES
	("Fogo", "Grama", "Rocha"),
    ("Água", "Fogo", "Planta"),
    ("Grama", "Terra", "Inseto"),
    ("Elétrico", "Água", "Dragão"),
    ("Lutador", "Aço", "Veneno");
    
INSERT INTO tb_personagens (nome, habilidade, ataque, defesa, fk_tipoid) VALUES
	("Charizard", "Chama Ardente", 2000, 950, 1),
    ("Blastoise", "Torrente", 3200, 2200, 2),
    ("Venusaur", "Crescer demais", 1300,  2700, 3),
    ("Raichu", "Estático", 1980, 1670, 4),
    ("Machamp", "Sempre Alerta", 1715, 2100, 5),
    ("Infernape", "Agilidade", 950, 950, 1),
    ("Swampert", "Torrente", 3050, 3100, 2),
    ("Galvantula", "Fuga Rápida", 1685, 1980, 4);
    
SELECT * FROM tb_personagens 
WHERE ataque > 2000;

SELECT * FROM tb_personagens 
WHERE defesa > 1000 
AND defesa < 2000;

SELECT * FROM tb_personagens 
WHERE nome LIKE "%c%";

SELECT * FROM tb_personagens P 
INNER JOIN tb_classes C 
ON P.fk_tipoid = C.id;

SELECT * FROM tb_personagens P 
INNER JOIN tb_classes C 
ON P.fk_tipoid = C.id
WHERE C.nome = "Fogo";