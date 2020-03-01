CREATE TABLE tb_character (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(60),
	description VARCHAR(255),
	modified DATE,
	id_image INT,
	id_comic INT,
	id_story INT,
	id_event INT,
	id_serie INT,
	FOREIGN KEY (id_image) REFERENCES tb_image (id),
	FOREIGN KEY (id_comic) REFERENCES tb_comic (id),
	FOREIGN KEY (id_story) REFERENCES tb_story (id),
	FOREIGN KEY (id_event) REFERENCES tb_event (id),
	FOREIGN KEY (id_serie) REFERENCES tb_serie (id)
)ENGINE InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_character (name, description, modified, id_image, id_comic, id_story, id_event, id_serie) VALUES ('Spiderman', 'The best hero', '2019-01-01', 1, 1, 1, 1, 1);
INSERT INTO tb_character (name, description, modified, id_image, id_comic, id_story, id_event, id_serie) VALUES ('Hulk', 'The strongest hero', '2020-01-01',  2, 2, 2, 2, 2);
INSERT INTO tb_character (name, description, modified, id_image, id_comic, id_story, id_event, id_serie) VALUES ('Thor', 'god of Thunder', '2020-02-28',  3, 3, 3, 3, 3);
INSERT INTO tb_character (name, description, modified, id_image, id_comic, id_story, id_event, id_serie) VALUES ('Ironman', 'The richest hero', '2020-01-15',  4, 4, 4, 4, 4);
INSERT INTO tb_character (name, description, modified, id_image, id_comic, id_story, id_event, id_serie) VALUES ('Captain America', 'the most boring hero', '2020-01-01',  5, 5, 5, 5, 5);