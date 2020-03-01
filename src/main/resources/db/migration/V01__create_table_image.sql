CREATE TABLE tb_image (
	id INT PRIMARY KEY AUTO_INCREMENT,
	path VARCHAR(255),
	extension VARCHAR(5)
)ENGINE InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_image (path, extension) VALUES ('/marvel-api/src/main/resources/images/spider-man.jpg', 'jpg');
INSERT INTO tb_image (path, extension) VALUES ('/marvel-api/src/main/resources/images/hulk.jpg', 'jpg');
INSERT INTO tb_image (path, extension) VALUES ('/marvel-api/src/main/resources/images/thor.jpg', 'jpg');
INSERT INTO tb_image (path, extension) VALUES ('/marvel-api/src/main/resources/images/ironman.jpg', 'jpg');
INSERT INTO tb_image (path, extension) VALUES ('/marvel-api/src/main/resources/images/captainamerica.jpg', 'jpg');