DROP TABLE usuarios IF EXISTS;

CREATE TABLE usuarios (
  id          INTEGER PRIMARY KEY,
  name        VARCHAR,
  birth_date  DATE
);