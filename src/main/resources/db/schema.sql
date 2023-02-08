DROP TABLE users IF EXISTS;

CREATE TABLE users (
  id          INTEGER PRIMARY KEY,
  name        VARCHAR,
  birth_date  DATE
);