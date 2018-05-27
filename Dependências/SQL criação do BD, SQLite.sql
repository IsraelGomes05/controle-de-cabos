-- Table: Cabo
CREATE TABLE Cabo (
	idCabo integer PRIMARY KEY UNIQUE,
	Descricao varchar (50),
	PossuiBobina CHAR
);

-- Table: Bobina
CREATE TABLE Bobina (
	idBobina integer PRIMARY KEY UNIQUE,
	id_Cabo integer,
	Quantidade numeric (7, 2),
	QtdAtual NUMERIC (7, 2),
	Ativo CHAR (1),
	FOREIGN KEY (id_Cabo) REFERENCES Cabo (idCabo)
);

-- Table: Login
CREATE TABLE Perfil_Usuario (
	idPerfil_Usuario integer PRIMARY KEY,
	Cadastrar_vendedor char(1),
	Cadastrar_usuarios char(1),
	Alterar_Cabos char(1),
	Alterar_pontas char(1),
	Alterar_Bobinas char(1),
	Exluir_Saidas char(1)
)

-- Table: Usuario
CREATE TABLE Usuario (
	idUsuarioINTEGER PRIMARY KEY AUTOINCREMENT,
	Senha VARCHAR (25),
	User VARCHAR (25) UNIQUE,
	id_Perfil_Usuario INTEGER,
	FOREIGN KEY(id_Perfil_Usuario) REFERENCES Perfil_Usuario (idPerfil_Usuario)
);

-- Table: Ponta
CREATE TABLE Ponta (
	idPonta integer PRIMARY KEY UNIQUE,
	id_Cabo integer,
	Quantidade numeric (7, 2),
	Localizacao varchar (25),
	FOREIGN KEY (id_Cabo) REFERENCES Cabo (idCabo)
);

-- Table: Vendedor
CREATE TABLE Vendedor (
	idVendedor integer PRIMARY KEY AUTOINCREMENT,
	Nome varchar(25) UNIQUE
);

-- Table: Saida
CREATE TABLE Saida (
	idSaida integer PRIMARY KEY AUTOINCREMENT,
	id_Cabo integer,
	id_Vendedor integer,
	Quantidade numeric (7, 2),
	Data DATE,
	FOREIGN KEY (id_Cabo) REFERENCES Cabo (idCabo),
	FOREIGN KEY (id_Vendedor) REFERENCES Vendedor (idVendedor)
);

