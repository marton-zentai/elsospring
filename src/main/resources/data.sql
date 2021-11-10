INSERT INTO BLOGGER (name, age) VALUES ('Gyula', 21);
INSERT INTO BLOGGER (name, age) VALUES ('Krisz', 30);

INSERT INTO STORY (content, title, posted, blogger_id) VALUES ('DOG_CONTENT', 'DOG', '2017-10-24', (SELECT id FROM BLOGGER WHERE name = 'Gyula'));
INSERT INTO STORY (content, title, posted, blogger_id) VALUES ('CAT_CONTENT', 'CAT', CURRENT_DATE(), (SELECT id FROM BLOGGER WHERE name = 'Gyula'));

INSERT INTO STORY (content, title, posted, blogger_id) VALUES ('RAT_CONTENT', 'RAT', '2017-10-25', (SELECT id FROM BLOGGER WHERE name = 'Krisz'));
INSERT INTO STORY (content, title, posted, blogger_id) VALUES ('FISH_CONTENT', 'FISH', CURRENT_DATE(), (SELECT id FROM BLOGGER WHERE name = 'Krisz'));