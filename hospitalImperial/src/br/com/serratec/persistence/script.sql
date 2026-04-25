create table hospital(
	id_hospital serial primary key,
	nome varchar(100) not null,
	cnpj char(18) unique not null
);
create type cobertura as enum('Regional', 'Nacional');
create table plano_saude(
	id_plano serial primary key,
	nome varchar(100) unique not null,
	telefone varchar(25) not null,
	cobertura cobertura
);
create table credenciamento(
	id_credenciamento serial primary key,
	data date default current_date,
	id_plano int not null references plano_saude(id_plano) on delete restrict,
	id_hospital int not null references hospital(id_hospital) on delete restrict
);
create table paciente(
	id_paciente serial primary key,
	nome varchar(100) not null,
	cpf char(14) unique not null,
	telefone varchar(25) not null,
	id_plano int references plano_saude(id_plano) on delete restrict
);
create type turno as enum('Manhã','Tarde','Noite');
create table enfermeira(
	id_enfermeira serial primary key,
	nome varchar(100) not null,
	cre varchar(30) unique not null,
	turno_atual turno,
	id_enfermeira_chefe int references enfermeira(id_enfermeira) on delete restrict
);
create table medico(
	id_medico serial primary key,
	nome varchar(100) not null,
	especialidade varchar(80) not null,
	crm char(9) unique not null
);
create table ala(
	id_ala serial primary key,
	tipo varchar(50) not null,
	leitos_disponiveis int check(leitos_disponiveis >= 0),
	id_enfermeira int not null references enfermeira(id_enfermeira) on delete restrict,
	id_hospital int not null references hospital(id_hospital) on delete restrict
);
create type ocupacao as enum('Ocupado', 'Livre', 'Em manutenção');
create table leito(
	id_leito serial primary key,
	status ocupacao,
	id_ala int not null references ala(id_ala) on delete restrict
);
create type tipo_at as enum ('Consulta', 'Emergência', 'Revisão');
create type status_at as enum ('Realizado', 'Cancelado', 'Agendado');
create table atendimento(
	id_atendimento serial primary key,
	data timestamp default current_timestamp,
	tipo tipo_at,
	status status_at,
	observacoes text,
	id_medico int not null references medico(id_medico) on delete restrict,
	id_paciente int not null references paciente(id_paciente) on delete restrict
);
create type un as enum('un', 'mg', 'ml','g');
create table medicamentos(
	id_medicamentos serial primary key,
	nome varchar(150) not null,
	data date default current_date,
	dosagem decimal(10,2) not null check(dosagem >= 0),
	unidade un,
	id_atendimento int not null references atendimento(id_atendimento) on delete restrict
);
create table internacao(
	id_internacao serial primary key,
	data_entrada timestamp default current_timestamp,
	data_saida timestamp not null,
	id_leito int not null references leito(id_leito) on delete restrict,
	id_atendimento int not null references atendimento(id_atendimento) on delete restrict
);
create type tipo_lab as enum('Interno', 'Externo');
create table laboratorio(
	id_laboratorio serial primary key,
	nome varchar(100) not null,
	tipo tipo_lab
);
create type result_ex as enum('Normal', 'Alterado', 'Crítico');
create table exame(
	id_exame serial primary key,
	data_solicitacao timestamp default current_timestamp,
	tipo varchar(100) not null,
	custo decimal(10,2) not null check(custo >= 0),
	descricao text,
	resultado result_ex,
	laudo bytea,
	id_laboratorio int not null references laboratorio(id_laboratorio) on delete restrict,
	id_atendimento int not null references atendimento(id_atendimento) on delete restrict
);
create type status_fa as enum ('Pendente', 'Pago', 'Cancelado', 'Em análise');
drop type
create table fatura(
	id_fatura serial primary key,
	valor decimal(10,2) check(valor >= 0),
	forma_pagamento varchar(50) not null,
	status status_fa,
	data_emissao date default current_date,
	data_vencimento date not null,
	id_internacao int references internacao(id_internacao) on delete restrict,
	id_atendimento int references atendimento(id_atendimento) on delete restrict,
	id_exame int references exame(id_exame) on delete restrict
);
create table nota_fiscal(
	id_nota serial primary key,
	nome_emissor varchar(100),
	descricao text,
	valor decimal(10,2),
	iss decimal(10,2),
	pis decimal(10,2),
	cofins decimal(10,2),
	irpj decimal(10,2),
	csll decimal(10,2),
	id_fatura int not null references fatura(id_fatura) on delete restrict
);

insert into hospital (nome, cnpj)
values ('Hospital Imperial','20.173.767/0001-26');

insert into paciente (nome,cpf,telefone,id_plano)
values
('Ana Beatriz Silva','123.456.789-01','(24) 98765-4321',1),
('Bruno Henrique Oliveira','234.567.890-11','(21) 97654-3210',2),
('Carla Regina Mendes','345.678.901-22','(22) 96543-2109',2),
('Daniel Souza Santos','456.789.012-33','(24) 95432-1098',3),
('Eduarda Lopes Ferreira','567.890.123-44','(24) 94321-0987',4),
('Fábio Augusto Rocha','678.901.234-55','(21) 93210-9876',5),
('Gabriela Martins Costa','789.012.345-66','(24) 92109-8765',6),
('Hugo Leonardo Lima','890.123.456-77','(24) 91098-7654',7),
('Isabela Cristina Duarte','901.234.567-88','(24) 90987-6543',8),
('Victor Hugo Reis','012.345.678-99','(21) 99876-5432',9),
('Matheus Mendonça Cogliatti','111.598.243-09','(24) 99453-7854',10);

insert into medico (nome,especialidade,crm)
values
('Dra. Helena Valente','Neurocirurgiã','123456-RJ'),
('Dr. Marcos Veras',' Pediatra','987654-RJ'),
('Dra. Beatriz Lins','Oncologista','456789-RJ'),
('Dr. Samuel Farias','Cardiologista','112233-RJ'),
('Dra. Clarice Montenegro','Psiquiatra','554433-RJ'),
('Dr. Thiago Alencar','Ortopedista','667788-SP'),
('Dra. Isadora Pimentel','Endocrinologista','990011-RJ'),
('Dr. Ricardo Drumond','Dermatologista','223344-SC'),
('Dra. Sofia Mendonça','Ginecologista ','778899-RJ'),
('Dr. Hugo Cavalcanti','Infectologista','334455-RJ');

insert into medicamentos (nome, dosagem, unidade,id_atendimento)
values
('Paracetamol',7,'mg',1),
('Dipirona Sódica',4,'ml',2),
('Amoxicilina',1,'mg',3),
('Ibuprofeno',3,'mg',3),
('Omeprazol',2,'un',5),
('Losartana',10,'mg',6),
('Dexametasona',5,'mg',7),
('Insulina',1,'ml',10),
('Simeticona ',4,'ml',8),
('Metformina',3,'mg',10);

insert into enfermeira (nome, cre, id_enfermeira_chefe, turno_atual)
values
('Ana Silva', 'rj12345', null, 'Manhã'),
('Carlos Souza', 'rj67890', 1, 'Tarde'),
('Mariana Oliveira', 'rj11223', 2, 'Noite'),
('Ricardo Santos', 'sc44556', 3, 'Manhã'),
('Beatriz Costa', 'rj77889', 4, 'Tarde'),
('Fernando Lima', 'rj99001', 5, 'Noite'),
('Juliana Pereira', 'rj33445', 6, 'Tarde'),
('Lucas Mendes', 'sp55667', 7, 'Manhã'),
('Patrícia Rocha', 'rj88990', 8, 'Noite'),
('Camila Antunes', 'rj22334', 9, 'Manhã');

insert into fatura (valor, forma_pagamento, status, data_vencimento, id_internacao, id_atendimento, id_exame) 
values
(1500.00, 'Cartão de Crédito', 'Pago', '2026-05-10', null, null, 1),
(250.00, 'Dinheiro', 'Pendente', '2026-04-25', null, null, 2),
(3400.00, 'Convênio', 'Em análise', '2026-05-15', null, null, 3),
--(120.00, 'Pix', 'Pago', '2026-04-20', null, null, 4), (cancelado pelo cliente)
(5000.00, 'Boleto', 'Cancelado', '2026-03-30', null, null, 5),
(850.00, 'Cartão de Débito', 'Pago', '2026-05-01', null, null, 6),
(1200.00, 'Convênio', 'Em análise', '2026-06-01', null, null, 7),
(450.00, 'Pix', 'Pendente', '2026-04-28', null, null, 8),
--(950.00, 'Dinheiro', 'Pago', '2026-04-21', null, null, 9), (cancelado pelo cliente)
(2100.00, 'Cartão de Crédito', 'Pendente', '2026-05-05', null, null, 10),
(150.00, 'Cartão de Crédito', 'Pago', '2026-05-10', null, 1, null),
(25.00, 'Dinheiro', 'Pendente', '2026-04-25', null, 2, null),
(34.00, 'Convênio', 'Em análise', '2026-05-15', null, 3, null),
(120.00, 'Pix', 'Pago', '2026-04-20', null, 4, null),
(50.00, 'Boleto', 'Cancelado', '2026-03-30', null, 5, null),
(85.00, 'Cartão de Débito', 'Pago', '2026-05-01', null, 6, null),
(120.00, 'Convênio', 'Em análise', '2026-06-01', null, 7, null),
(40.00, 'Pix', 'Pendente', '2026-04-28', null, 8, null),
(95.00, 'Dinheiro', 'Pago', '2026-04-21', null, 9, null),
(2100.00, 'Cartão de Crédito', 'Pendente', '2026-05-05', null, 10, null),
(1500.00, 'Cartão de Crédito', 'Pago', '2026-05-10', 31, null, null),
(250.-0, 'Dinheiro', 'Pendente', '2026-04-25', 32, null, null),
(3400.00, 'Convênio', 'Em análise', '2026-05-15', 33, null, null),
(120.00, 'Pix', 'Pago', '2026-04-20', 34, null, null),
(5000.00, 'Boleto', 'Cancelado', '2026-03-30', 35, null, null),
(850.00, 'Cartão de Débito', 'Pago', '2026-05-01', 36, null, null),
(12000.00, 'Convênio', 'Em análise', '2026-06-01', 37, null, null),
(450.00, 'Pix', 'Pendente', '2026-04-28', 38, null, null),
(95.00, 'Dinheiro', 'Pago', '2026-04-21', 39, null, null),
(2100.00, 'Cartão de Crédito', 'Pendente', '2026-05-05', 40, null, null);

select * from ala;
select * from atendimento;
select * from credenciamento;
select * from enfermeira;
select * from exame;

select * from fatura;

select * from hospital;
select * from internacao;
select * from laboratorio;
select * from leito;
select * from medicamentos;
select * from medico;

select * from nota_fiscal;

select * from paciente;
select * from plano_saude;