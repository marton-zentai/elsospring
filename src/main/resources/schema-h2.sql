DROP TABLE IF EXISTS Blogger;

CREATE TABLE Blogger(
id BIGINT NOT NULL,
name VARCHAR(100),
age INT,
PRIMARY KEY (id)
);

DROP TABLE IF EXISTS Story;

CREATE TABLE Story(
id BIGINT NOT NULL,
title VARCHAR(100),
content VARCHAR(400),
posted DATE,
blogger_id INT,
PRIMARY KEY (id)
);