SET NAMES utf8mb4;

USE streetfighter;

INSERT INTO LUCHADOR
    (Id_Luchador, Nombre, Edad, Nacionalidad, Estatura, Peso, Potencia, Velocidad, Fisico)
VALUES
    ( 1, 'Ryu',     26, 'Japón',       175,  85, 30, 29, 31),
    ( 2, 'Ken',     25, 'EEUU',        175,  86, 32, 31, 27),
    ( 3, 'Guile',   42, 'EEUU',        185, 100, 34, 25, 31),
    ( 4, 'Chun-Li', 19, 'China',       165,  58, 20, 35, 35),
    ( 5, 'Honda',   40, 'Japón',       189, 170, 40, 20, 30),
    ( 6, 'Dhalsim', 58, 'India',       176,  65, 27, 34, 29),
    ( 7, 'Blanka',  27, 'Brasil',      184,  98, 29, 34, 27),
    ( 8, 'Vega',    24, 'España',      186,  80, 27, 39, 24),
    ( 9, 'Zangief', 44, 'Rusia',       213, 160, 38, 22, 30),
    (10, 'Dee Jay', 31, 'Jamaica',     189,  87, 28, 28, 34),
    (11, 'T.Hawk',  39, 'México',      206, 112, 36, 24, 30),
    (12, 'Cammy',   26, 'Reino Unido', 168,  65, 23, 40, 27),
    (13, 'Balrog',  35, 'EEUU',        198, 118, 39, 24, 27),
    (14, 'Sagat',   49, 'Tailandia',   225, 150, 37, 31, 22),
    (15, 'M.Bison', 51, 'Desconocida', 210, 115, 34, 32, 34);


INSERT INTO USUARIO
    (Id_Usuario, Nombre, Contrasenia, Total_Victorias, Total_Derrotas)
VALUES
    (1, 'joaquin', 'Joaquin2026!', 19, 9),
    (2, 'rafael', 'Rafael2026!', 23, 11),
    (3, 'novato', 'Novato2026!', 0, 0),
    (4, 'maestro', 'Maestro2026!', 80, 5);


INSERT INTO DESBLOQUEO
    (Id_Luchador, Id_Usuario, Victorias, Derrotas)
VALUES
    ( 1, 1,  6, 2),
    ( 2, 1,  3, 1),
    ( 3, 1,  1, 2),
    ( 4, 1,  4, 0),
    ( 5, 1,  2, 3),
    ( 8, 1,  2, 1),
    (12, 1,  1, 0),
    ( 1, 2,  2, 2),
    ( 2, 2,  5, 1),
    ( 3, 2,  3, 3),
    ( 4, 2,  0, 1),
    ( 5, 2,  7, 2),
    ( 9, 2,  3, 0),
    (13, 2,  2, 1),
    (14, 2,  1, 1),
    ( 1, 3,  0, 0),
    ( 2, 3,  0, 0),
    ( 3, 3,  0, 0),
    ( 4, 3,  0, 0),
    ( 5, 3,  0, 0),
    ( 1, 4,  5, 0),
    ( 2, 4,  5, 0),
    ( 3, 4,  5, 1),
    ( 4, 4,  5, 0),
    ( 5, 4,  5, 0),
    ( 6, 4,  5, 1),
    ( 7, 4,  5, 0),
    ( 8, 4,  5, 0),
    ( 9, 4,  5, 1),
    (10, 4,  5, 0),
    (11, 4,  5, 0),
    (12, 4,  5, 1),
    (13, 4,  5, 0),
    (14, 4,  5, 0),
    (15, 4, 10, 1);
