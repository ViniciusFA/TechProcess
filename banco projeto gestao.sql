create database Gestao Controle
create table cadastroentrada

(cadentrada_codigo primary key,
cadentrada_motorista varchar (50),
cadentrada_RG varchar (9),
cadentrada_habilitação varchar (11),
cadentrada_placa varchar (7),
cadentrada_veiculo int(10),
cadentrada_telefone numeric (9),
cadentrada_notafiscal numeric(44),
cadentrada_data date,
cadastro_hora date,
cadentrada_agregado varchar(40),
cadentrada_retirada varchar (40),
cadsaida_razaosocial varchar(50),
cadentrada_observação varchar (300))
go

create table cadastrosaída
(cadsaida_codigo primary key,
cadsaida_motorista varchar(50),
cadsaida_RG varchar(9),
cadsaida_habilitação varchar(11),
cadsaida_placa varchar (7),
cadsaida_veiculo int (10),
cadsaida_telefone numeric (9),
cadsaida_notafiscal numeric (44),
cadsaida_data date,
cadsaida_hora date,
cadsaida_agregado/retira varchar (40),
cadsaida_razaosocial varchar(50)
cadsaida_observacao  varchar (300))
go


