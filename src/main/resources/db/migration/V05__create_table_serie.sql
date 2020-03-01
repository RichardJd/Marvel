CREATE TABLE tb_serie (
	id INT PRIMARY KEY AUTO_INCREMENT,
	available INT,
	returned INT
)ENGINE InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tb_serie_summary (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(150),
	id_serie INT,
	FOREIGN KEY (id_serie) REFERENCES tb_serie (id)
)ENGINE InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_serie (available, returned) VALUES ('2', '1');
INSERT INTO tb_serie (available, returned) VALUES ('3', '0');
INSERT INTO tb_serie (available, returned) VALUES ('4', '1');
INSERT INTO tb_serie (available, returned) VALUES ('1', '0');
INSERT INTO tb_serie (available, returned) VALUES ('3', '1');

INSERT INTO tb_serie_summary (name, id_serie) VALUES ('Superior Spider-Man Vol. 2: Otto-matic (2019)', '1');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('2099 Alpha (2019)', '1');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('A Year of Marvels (2017)', '1');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('Immortal Hulk (2019)', '2');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('Avengers (2010 - 2012)', '3');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('Avengers (1998 - 2004)', '3');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('Avengers (1963 - 1996)', '3');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('International Iron Man (2017)', '4');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('Iron Man 2020 (1994)', '4');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('Iron Man by Design (2010)', '4');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('Adventures of Captain America (1991 - 1992)', '5');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('Age of Apocalypse (2011 - 2013)', '5');
INSERT INTO tb_serie_summary (name, id_serie) VALUES ('All-Winners Comics (1941 - 1947)', '5');