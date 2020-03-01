CREATE TABLE tb_comic (
	id INT PRIMARY KEY AUTO_INCREMENT,
	available INT,
	returned INT
)ENGINE InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tb_comic_summary (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(150),
	id_comic INT,
	FOREIGN KEY (id_comic) REFERENCES tb_comic (id)
)ENGINE InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_comic (available, returned) VALUES ('35', '10');
INSERT INTO tb_comic (available, returned) VALUES ('37', '5');
INSERT INTO tb_comic (available, returned) VALUES ('42', '7');
INSERT INTO tb_comic (available, returned) VALUES ('21', '2');
INSERT INTO tb_comic (available, returned) VALUES ('36', '4');

INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Amazing Spider-Man (1999) #530', '1');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Amazing Spider-Man (1999) #531', '1');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('AMAZING SPIDER-MAN VOL. 10: NEW AVENGERS TPB (Trade Paperback)', '1');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Indestructible Hulk (2012 - 2014)', '2');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Age of Heroes (2010) #1', '3');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Age of Heroes (2010) #2', '3');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Age of Heroes (2010) #3', '3');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Iron Man 2020 (1994) #1', '4');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Iron Man by Design (2010) #1', '4');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Iron Man: Extremis Directors Cut (2010) #1', '4');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Captain America (2002) #20', '5');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Captain America (1968) #133', '5');
INSERT INTO tb_comic_summary (name, id_comic) VALUES ('Captain America (1968) #136', '5');