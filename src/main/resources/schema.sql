CREATE TABLE Account
(
    id_conta IDENTITY NOT NULL PRIMARY KEY,
    nome_responsavel VARCHAR(50) NOT NULL
);


CREATE TABLE Transaction
(
    id IDENTITY NOT NULL PRIMARY KEY,
    data_transferencia TIMESTAMP WITH TIME ZONE NOT NULL,
    valor NUMERIC (20,2) NOT NULL,
    tipo VARCHAR(15) NOT NULL,
    nomeOperador VARCHAR (50),
    accountId INT NOT NULL,

        CONSTRAINT FK_ACCOUNT
        FOREIGN KEY (accountId)
        REFERENCES Account(id_conta)
);