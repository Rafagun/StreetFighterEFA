SET NAMES utf8mb4;

USE streetfighter;

INSERT INTO LUCHADOR
    (Id_Luchador, Nombre, Edad, Nacionalidad, Estatura, Peso, Potencia, Velocidad, Fisico, Descripcion)
VALUES
    ( 1, 'Ryu',     26, 'Japón',       175,  85, 30, 29, 31, 'Luchador entrenado por Gouken famoso por su potente Hadoken, golpe ganador con el que derrotó a Sagat en el primer torneo y lo hirió gravemente.'),
    ( 2, 'Ken',     25, 'EEUU',        175,  86, 32, 31, 27, 'Descendiente de una rica familia estadounidense, su padre pagó para formarle en kárate. Discípulo de Gouken igual que Ryu pretende ser el mejor luchador del mundo, por encima de Ryu.'),
    ( 3, 'Guile',   42, 'EEUU',        185, 100, 34, 25, 31, 'Ingresa al torneo para poner a M.Bison bajo custodia por ser el asesino de su mejor amigo Charlie, sólo la victoria sobre el mismo le hará enfrentarse a él y poder derrotarlo.'),
    ( 4, 'Chun-Li', 19, 'China',       165,  58, 20, 35, 35, 'Artista marcial experta y oficial de la Interpol. Sin descanso, ella busca venganza por la muerte de su padre a manos del líder de la organización criminal Shadaloo, M.Bison.'),
    ( 5, 'Honda',   40, 'Japón',       189, 170, 40, 20, 30, 'Luchador de sumo profesional de Japón que entra al torneo para demostrar que el sumo es el mejor estilo de lucha del mundo por lo que retará a todo el que pretenda enfrentarse a él.'),
    ( 6, 'Dhalsim', 58, 'India',       176,  65, 27, 34, 29, 'Pacifista pero entró a un torneo de lucha para recaudar dinero para su aldea empobrecida. Ha dedicado su vida a la meditación lo que le permite expulsar fuego por la boca y estirar su cuerpo.'),
    ( 7, 'Blanka',  27, 'Brasil',      184,  98, 29, 34, 27, 'Hombre brasileño cuyo cuerpo ha sido infectado con demasiada clorofila proveniente de las selvas donde vive. Es famoso por su movimiento especial eléctrico y sus movimientos rodantes.'),
    ( 8, 'Vega',    24, 'España',      186,  80, 27, 39, 24, 'Luchador español contratado por Shadaloo que utiliza un estilo de lucha muy particular en el que mezcla una rápida habilidad de esquiva parecida a la esgrima con una potente garra.'),
    ( 9, 'Zangief', 44, 'Rusia',       213, 160, 38, 22, 30, 'Luchador ruso acostumbrado a entrenar con grandes osos. Es un luchador lento, pero si logra agarrarte, estás acabado. Ingresa al evento por motivos económicos.'),
    (10, 'Dee Jay', 31, 'Jamaica',     189,  87, 28, 28, 34, 'Cantante que se interesó en un torneo de lucha como medio para ganar popularidad. Su fortaleza viene de un desastre en un concierto que le hizo ganar una onda expansiva en sus puños.'),
    (11, 'T.Hawk',  39, 'México',      206, 112, 36, 24, 30, 'Ingresa al torneo para vengar a sus compatriotas indios nativos, ya que M.Bison destruyó su asentamiento por el oro y la cantidad de riquezas que poseían.'),
    (12, 'Cammy',   26, 'Reino Unido', 168,  65, 23, 40, 27, 'Tiene algunos lazos misteriosos con M.Bison, es una especialista de las fuerzas especiales del ejército británico conocido como Delta Red.'),
    (13, 'Balrog',  35, 'EEUU',        198, 118, 39, 24, 27, 'Ex boxeador profesional que trabaja bajo las órdenes de M.Bison en la organización criminal de Shadaloo. Lucha pura y exclusivamente con los puños.'),
    (14, 'Sagat',   49, 'Tailandia',   225, 150, 37, 31, 22, 'Integrante de Shadaloo, ingresa al torneo por venganza contra Ryu que años antes en una pelea le causó la cicatriz que tiene en el pecho.'),
    (15, 'M.Bison', 51, 'Desconocida', 210, 115, 34, 32, 34, 'Líder de la organización criminal de Shadaloo. Es el organizador principal del torneo, aunque realmente es una tapadera, es un contrabandista de armas y drogas cegado por el poder.');

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
