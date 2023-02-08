DROP TABLE usuarios IF EXISTS;

CREATE TABLE usuarios (
  id          INTEGER PRIMARY KEY,
  name        VARCHAR,
  birth_date  DATE
);

INSERT INTO usuarios (id, name, birth_date) VALUES (1, 'Pedro', '1995-03-04');
INSERT INTO usuarios (id, name, birth_date) VALUES (2, 'Juan', '1987-03-22');
INSERT INTO usuarios (id, name, birth_date) VALUES (3, 'Ana', '1999-02-12');
INSERT INTO usuarios (id, name, birth_date) VALUES (4, 'Maria', '2003-07-27');
INSERT INTO usuarios (id, name, birth_date) VALUES (5, 'Lucas', '1970-08-05');

SELECT * FROM usuarios;