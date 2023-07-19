CREATE TABLE Account
(
    id IDENTITY NOT NULL PRIMARY KEY,
    nome_responsavel VARCHAR(50) NOT NULL
);


CREATE TABLE Transaction
(
    id IDENTITY NOT NULL PRIMARY KEY,
    datatransferencia TIMESTAMP WITH TIME ZONE NOT NULL,
    valor NUMERIC (20,2) NOT NULL,
    tipo VARCHAR(15) NOT NULL,
    nomeoperador VARCHAR (50),
    accountid INT NOT NULL,

        CONSTRAINT FK_ACCOUNT
        FOREIGN KEY (accountid)
        REFERENCES Account(id)
);