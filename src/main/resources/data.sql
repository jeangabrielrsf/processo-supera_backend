
INSERT INTO Account (id, nome_responsavel) VALUES (1,'Fulano');
INSERT INTO Account (id, nome_responsavel) VALUES (2,'Sicrano');

INSERT INTO Transaction (id,datatransferencia, valor, tipo, nomeOperador, accountId) VALUES (1,'2019-01-01 12:00:00+03',30895.46,'DEPOSITO', null, 1);
INSERT INTO Transaction (id,datatransferencia, valor, tipo, nomeOperador, accountId) VALUES (2,'2019-02-03 09:53:27+03',12.24,'DEPOSITO', null,2);
INSERT INTO Transaction (id,datatransferencia, valor, tipo, nomeOperador, accountId) VALUES (3,'2019-05-04 08:12:45+03',-500.50,'SAQUE', null,1);
INSERT INTO Transaction (id,datatransferencia, valor, tipo, nomeOperador, accountId) VALUES (4,'2019-08-07 08:12:45+03',-530.50,'SAQUE', null,2);
INSERT INTO Transaction (id,datatransferencia, valor, tipo, nomeOperador, accountId) VALUES (5,'2020-06-08 10:15:01+03',3241.23,'TRANSFERENCIA', 'Beltrano',1);
INSERT INTO Transaction (id,datatransferencia, valor, tipo, nomeOperador, accountId) VALUES (6,'2021-04-01 12:12:04+03',25173.09,'TRANSFERENCIA', 'Ronnyscley',2);
