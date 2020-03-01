CREATE TABLE tb_story (
	id INT PRIMARY KEY AUTO_INCREMENT,
	available INT,
	returned INT
)ENGINE InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tb_story_summary (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(150),
	kind VARCHAR(60),
	id_story INT,
	FOREIGN KEY (id_story) REFERENCES tb_story (id)
)ENGINE InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_story (available, returned) VALUES ('135', '20');
INSERT INTO tb_story (available, returned) VALUES ('137', '15');
INSERT INTO tb_story (available, returned) VALUES ('142', '17');
INSERT INTO tb_story (available, returned) VALUES ('121', '12');
INSERT INTO tb_story (available, returned) VALUES ('136', '14');

INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('Interior #483', 'interiorStory', '1');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('Cover #486', 'cover', '1');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('Interior #487', 'interiorStory', '1');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('INCREDIBLE HULK (1999) #62', 'cover', '2');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('THOR (1998) #76', 'cover',  '3');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('Interior #877', 'interiorStory', '3');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('Interior #879', 'interiorStory', '3');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('Iron Man 2020 (1994) #1', 'cover', '4');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('Iron Man by Design (2010) #1', 'cover', '4');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('Iron Man: Extremis Directors Cut (2010) #1', 'cover', '4');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('X-MEN (2004) #186', 'cover', '5');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('THOR (1998) #81', 'cover', '5');
INSERT INTO tb_story_summary (name, kind, id_story) VALUES ('3 of ?', 'cover', '5');