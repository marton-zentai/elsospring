INSERT INTO BLOGGER (id, name, age) VALUES (1, 'Gyula', 21);
INSERT INTO BLOGGER (id, name, age) VALUES (2, 'Krisz', 30);


INSERT INTO STORY (id, content, title, posted, blogger_id) VALUES (1, 'DOG_CONTENT', 'DOG', '2017-10-24', (SELECT id FROM BLOGGER WHERE name = 'Gyula'));
INSERT INTO STORY (id, content, title, posted, blogger_id) VALUES (2, 'CAT_CONTENT', 'CAT', CURRENT_DATE(), (SELECT id FROM BLOGGER WHERE name = 'Gyula'));

INSERT INTO STORY (id, content, title, posted, blogger_id) VALUES (3, 'RAT_CONTENT', 'RAT', '2017-10-25', (SELECT id FROM BLOGGER WHERE name = 'Krisz'));
INSERT INTO STORY (id, content, title, posted, blogger_id) VALUES (4, 'FISH_CONTENT', 'FISH', CURRENT_DATE(), (SELECT id FROM BLOGGER WHERE name = 'Krisz'));