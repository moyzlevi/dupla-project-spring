DROP TABLE addresses IF EXISTS;
CREATE TABLE addresses (
  id         INTEGER IDENTITY PRIMARY KEY,
  zip INTEGER NOT NULL,
  publicplace  VARCHAR(30) NOT NULL,
  district VARCHAR(30) NOT NULL,
  state VARCHAR(30) NOT NULL
);
