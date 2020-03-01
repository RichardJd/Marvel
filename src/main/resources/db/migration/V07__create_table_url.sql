CREATE TABLE tb_url (
	id INT PRIMARY KEY AUTO_INCREMENT,
	description VARCHAR(40),
	url VARCHAR(255),
	id_character INT NOT NULL,
	FOREIGN KEY (id_character) REFERENCES tb_character (id)
)ENGINE InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_url (description, url, id_character) VALUES ('detail', 'Detail Spider-Man', 1);
INSERT INTO tb_url (description, url, id_character) VALUES ('detail', 'Detail Thor', 3);
INSERT INTO tb_url (description, url, id_character) VALUES ('comiclink', 'ComicLink Spider-Man', 1);
INSERT INTO tb_url (description, url, id_character) VALUES ('detail', 'Dtail Hulk', 2);
INSERT INTO tb_url (description, url, id_character) VALUES ('comiclink', 'ComicLink Thor', 3);