CREATE TABLE tb_event (
	id INT PRIMARY KEY AUTO_INCREMENT,
	available INT,
	returned INT
)ENGINE InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tb_event_summary (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(150),
	id_event INT,
	FOREIGN KEY (id_event) REFERENCES tb_event (id)
)ENGINE InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_event (available, returned) VALUES ('35', '10');
INSERT INTO tb_event (available, returned) VALUES ('37', '5');
INSERT INTO tb_event (available, returned) VALUES ('42', '7');
INSERT INTO tb_event (available, returned) VALUES ('21', '2');
INSERT INTO tb_event (available, returned) VALUES ('36', '4');

INSERT INTO tb_event_summary (name, id_event) VALUES ('Infinity', '1');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Inhumanity', '1');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Initiative', '1');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Fall of the Hulks', '2');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Fall of the Mutants', '2');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Fear Itself', '2');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Acts of Vengeance!', '3');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Atlantis Attacks', '3');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Avengers Disassembled', '3');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Civil War', '4');
INSERT INTO tb_event_summary (name, id_event) VALUES ('House of M', '4');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Other - Evolve or Die', '4');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Acts of Vengeance!', '5');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Age of Ultron', '5');
INSERT INTO tb_event_summary (name, id_event) VALUES ('Age of X', '5');