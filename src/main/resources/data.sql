INSERT INTO users (first_name,
                   last_name,
                   email,
                   phone_number,
                   address,
                   gender,
                   date_of_birth,
                   role,
                   registered_at,
                   updated_at,
                   last_login_at,
                   profile_image_id,
                   password)
VALUES ('John', 'Doe', 'john.doe@example.com', '+123456789', '123 Main St, Springfield',
        'MALE', '1985-06-15', 'ROLE_USER', NOW(), NOW(), NOW(), NULL, 'password123'),

       ('Jane', 'Smith', 'jane.smith@example.com', '+198765432', '456 Elm St, Shelbyville',
        'FEMALE', '1990-09-23', 'ROLE_ADMIN', NOW(), NOW(), NOW(), NULL, 'password123'),

       ('Alice', 'Johnson', 'alice.johnson@example.com', '+1404555666', '789 Oak St, Capital City',
        'FEMALE', '1978-03-12', 'ROLE_STORE_MANAGER', NOW(), NOW(), NULL, NULL, 'password123'),

       ('Bob', 'Brown', 'bob.brown@example.com', '+1404333222', '321 Pine St, Springfield',
        'MALE', '1982-11-30', 'ROLE_CASHIER', NOW(), NOW(), NOW(), NULL, 'password123'),

       ('Emily', 'Davis', 'emily.davis@example.com', '+1404999888', '654 Maple St, Shelbyville',
        'FEMALE', '1995-02-05', 'ROLE_BRANCH_MANAGER', NOW(), NOW(), NULL, NULL, 'password123'),

       ('Michael', 'Green', 'michael.green@example.com', '+437879797', 'Vienna, Austria',
        'MALE', '1988-07-25', 'ROLE_USER', NOW(), NOW(), NULL, NULL, 'password123'),

       ('Sarah', 'Taylor', 'sarah.taylor@example.com', '+48111222333', 'Warsaw, Poland',
        'FEMALE', '1992-04-18', 'ROLE_USER', NOW(), NOW(), NOW(), NULL, 'password123'),

       ('Daniel', 'Lewis', 'daniel.lewis@example.com', '+4988776655', 'Berlin, Germany',
        'MALE', '1976-06-08', 'ROLE_STORE_MANAGER', NOW(), NOW(), NULL, NULL, 'password123'),

       ('Olivia', 'Bennett', 'olivia.bennett@example.com', '+447700900123', 'London, UK',
        'FEMALE', '1994-04-12', 'ROLE_CASHIER', NOW(), NOW(), NOW(), NULL, 'password123'),

       ('Liam', 'Anderson', 'liam.anderson@example.com', '+14158880000', 'San Francisco, USA',
        'MALE', '1989-01-22', 'ROLE_USER', NOW(), NOW(), NULL, NULL, 'password123'),

       ('John', 'Andrews', 'john.andrews2@example.com', '+380501112233', 'Kyiv, Ukraine', 'MALE', '1990-03-12',
        'ROLE_USER', '2024-01-10 10:00:00', '2024-01-10 10:00:00', '2024-01-15 10:00:00', NULL, 'Pass!jk12'),

       ('Maria', 'Kovalenko', 'maria.kovalenko2@example.com', '+380631234567', 'Lviv, Ukraine', 'FEMALE', '1994-07-22',
        'ROLE_CASHIER', '2024-02-02 09:10:00', '2024-02-02 09:10:00', '2024-02-05 09:30:00', NULL, 'Qwerty#92'),

       ('Alex', 'Smith', 'alex.smith3@example.com', '+380679998877', 'Berlin, Germany', 'MALE', '1988-11-05',
        'ROLE_STORE_MANAGER', '2023-12-11 14:00:00', '2023-12:11 14:00:00', '2024-01-02 14:00:00', NULL, 'Sm!th2024'),

       ('Emma', 'Brown', 'emma.brown4@example.com', '+380931112244', 'Warsaw, Poland', 'FEMALE', '1992-02-18',
        'ROLE_USER', '2024-03-15 11:25:00', '2024-03-15 11:25:00', '2024-03-18 11:25:00', NULL, 'EmmA@88k'),

       ('Dmytro', 'Havrylenko', 'dmytro.hav5@example.com', '+380951234111', 'Odesa, Ukraine', 'MALE', '1985-05-29',
        'ROLE_ADMIN', '2023-11-09 08:30:00', '2023-11-09 08:30:00', '2024-01-03 08:31:00', NULL, 'Dmitro#55'),

       ('Olena', 'Shevchenko', 'olena.shev6@example.com', '+380671234222', 'Kharkiv, Ukraine', 'FEMALE', '1995-10-01',
        'ROLE_USER', '2024-04-01 10:11:00', '2024-04-01 10:11:00', '2024-04-04 10:11:00', NULL, 'OlenA!45'),

       ('Michael', 'Turner', 'michael.turn7@example.com', '+380931234333', 'Hamburg, Germany', 'MALE', '1983-01-14',
        'ROLE_CASHIER', '2024-02-18 16:00:00', '2024-02-18 16:00:00', '2024-02-20 16:02:00', NULL, 'Turner$82'),

       ('Sara', 'Lopez', 'sara.lopez8@example.com', '+380501114455', 'Madrid, Spain', 'FEMALE', '1991-04-10',
        'ROLE_USER', '2024-01-28 17:20:00', '2024-01-28 17:20:00', '2024-02-01 17:20:00', NULL, 'SarA@109'),

       ('Mark', 'Davis', 'mark.davis9@example.com', '+380931225566', 'Vienna, Austria', 'MALE', '1989-06-21',
        'ROLE_BRANCH_MANAGER', '2023-10-17 12:00:00', '2023-10-17 12:00:00', '2023-12-29 12:00:00', NULL, 'DaVis!202'),

       ('Julia', 'Kravets', 'julia.krav10@example.com', '+380501228899', 'Dnipro, Ukraine', 'FEMALE', '1997-12-03',
        'ROLE_USER', '2024-03-18 09:10:00', '2024-03-18 09:10:00', '2024-03-21 09:10:00', NULL, 'Krav#77'),

       ('Victor', 'Klymenko', 'victor.klym11@example.com', '+380731234999', 'Zaporizhzhia, Ukraine', 'MALE',
        '1987-08-25', 'ROLE_CASHIER', '2023-12-05 13:45:00', '2023-12-05 13:45:00', '2024-01-08 14:00:00', NULL,
        'VicTor92@'),

       ('Andrea', 'Gonzalez', 'andrea.gonz12@example.com', '+380501115577', 'Barcelona, Spain', 'FEMALE', '1993-09-14',
        'ROLE_USER', '2024-02-09 08:09:00', '2024-02-09 08:09:00', '2024-02-11 08:10:00', NULL, 'Gonz@928'),

       ('Ihor', 'Melnyk', 'ihor.mel13@example.com', '+380661114477', 'Kyiv, Ukraine', 'MALE', '1990-01-30',
        'ROLE_ADMIN', '2023-11-23 11:00:00', '2023-11-23 11:00:00', '2023-12-14 11:00:00', NULL, 'Melnyk!12'),

       ('Olga', 'Rybak', 'olga.ryb14@example.com', '+380971114466', 'Lviv, Ukraine', 'FEMALE', '1994-10-11',
        'ROLE_USER', '2024-04-06 10:10:00', '2024-04-06 10:10:00', '2024-04-07 10:10:00', NULL, 'RybAk&44'),

       ('Andrew', 'White', 'andrew.white15@example.com', '+380931114455', 'London, UK', 'MALE', '1986-02-07',
        'ROLE_STORE_MANAGER', '2024-03-02 14:00:00', '2024-03-02 14:00:00', '2024-03-04 14:00:00', NULL, 'WhitE#551'),

       ('Natalia', 'Bielova', 'natalia.biel16@example.com', '+380501119922', 'Poltava, Ukraine', 'FEMALE', '1998-06-19',
        'ROLE_USER', '2024-01-14 09:00:00', '2024-01-14 09:00:00', '2024-01-16 09:00:00', NULL, 'NataliA!91'),

       ('Denis', 'Orlov', 'denis.orlov17@example.com', '+380991114333', 'Chernihiv, Ukraine', 'MALE', '1992-08-02',
        'ROLE_CASHIER', '2023-12-29 15:00:00', '2023-12-29 15:00:00', '2024-01-03 15:01:00', NULL, 'Orlov77@'),

       ('Maria', 'Vega', 'maria.vega18@example.com', '+380501776655', 'Lisbon, Portugal', 'FEMALE', '1996-05-08',
        'ROLE_USER', '2024-03-12 12:33:00', '2024-03-12 12:33:00', '2024-03-15 12:33:00', NULL, 'VegA!882'),

       ('Oleh', 'Bondar', 'oleh.bond19@example.com', '+380671114222', 'Uzhhorod, Ukraine', 'MALE', '1985-04-14',
        'ROLE_ADMIN', '2023-10-22 10:20:00', '2023-10-22 10:20:00', '2023-12-01 10:30:00', NULL, 'BondAr#23'),

       ('Anastasia', 'Sokolova', 'anastasia.sok20@example.com', '+380931118877', 'Kyiv, Ukraine', 'FEMALE',
        '1999-11-09', 'ROLE_USER', '2024-04-18 11:00:00', '2024-04-18 11:00:00', '2024-04-19 11:00:00', NULL,
        'SokoLoVa@8'),

       ('Taras', 'Maksymenko', 'taras.maks21@example.com', '+380931118001', 'Kyiv, Ukraine', 'MALE', '1991-07-15',
        'ROLE_USER', '2024-02-10 10:00:00', '2024-02-10 10:00:00', '2024-02-12 10:05:00', NULL, 'Taras!991'),

       ('Iryna', 'Lytvyn', 'iryna.lytvyn22@example.com', '+380501118002', 'Lviv, Ukraine', 'FEMALE', '1993-02-27',
        'ROLE_CASHIER', '2024-01-19 09:30:00', '2024-01-19 09:30:00', '2024-01-20 09:31:00', NULL, 'IryNa@227'),

       ('Oleksandr', 'Voitenko', 'oleks.voit23@example.com', '+380971118003', 'Odesa, Ukraine', 'MALE', '1984-10-09',
        'ROLE_ADMIN', '2023-11-14 13:00:00', '2023-11-14 13:00:00', '2023-12-01 13:02:00', NULL, 'Voit#442'),

       ('Natalia', 'Romaniuk', 'nat.roman24@example.com', '+380661118004', 'Ternopil, Ukraine', 'FEMALE', '1997-06-11',
        'ROLE_USER', '2024-04-05 08:45:00', '2024-04-05 08:45:00', '2024-04-06 08:45:00', NULL, 'RomaN@441'),

       ('Bogdan', 'Shevchuk', 'bohdan.shev25@example.com', '+380931118005', 'Rivne, Ukraine', 'MALE', '1990-03-29',
        'ROLE_BRANCH_MANAGER', '2023-12-18 12:00:00', '2023-12-18 12:00:00', '2024-01-03 12:01:00', NULL, 'BogD@n55'),

       ('Sophia', 'Melnychenko', 'sophia.mel26@example.com', '+380501118006', 'Warsaw, Poland', 'FEMALE', '1995-01-22',
        'ROLE_USER', '2024-03-01 11:12:00', '2024-03-01 11:12:00', '2024-03-05 11:12:00', NULL, 'SophiA#62'),

       ('Artem', 'Bondarenko', 'artem.bond27@example.com', '+380971118007', 'Kharkiv, Ukraine', 'MALE', '1988-09-14',
        'ROLE_CASHIER', '2023-10-28 15:30:00', '2023-10-28 15:30:00', '2023-12-10 15:33:00', NULL, 'ArtBOND@1'),

       ('Valeria', 'Hrytsenko', 'valeria.gry28@example.com', '+380931118008', 'Kyiv, Ukraine', 'FEMALE', '1999-05-06',
        'ROLE_USER', '2024-04-20 13:40:00', '2024-04-20 13:40:00', '2024-04-21 13:41:00', NULL, 'Val3riA!'),

       ('Serhii', 'Moroz', 'serhii.mor29@example.com', '+380501118009', 'Lviv, Ukraine', 'MALE', '1987-11-04',
        'ROLE_STORE_MANAGER', '2023-12-12 09:55:00', '2023-12-12 09:55:00', '2024-01-08 10:00:00', NULL, 'MoroZ$48'),

       ('Kateryna', 'Polishchuk', 'kat.pol30@example.com', '+380971118010', 'Odesa, Ukraine', 'FEMALE', '1993-07-19',
        'ROLE_USER', '2024-02-16 10:30:00', '2024-02-16 10:30:00', '2024-02-16 10:31:00', NULL, 'Kat3ryna$'),

       ('Yurii', 'Horbach', 'yurii.hor31@example.com', '+380931118011', 'Vinnytsia, Ukraine', 'MALE', '1985-08-11',
        'ROLE_ADMIN', '2023-10-07 14:40:00', '2023-10-07 14:40:00', '2023-12-09 14:40:00', NULL, 'YuRi!551'),

       ('Liza', 'Pavlenko', 'liza.pav32@example.com', '+380501118012', 'Dnipro, Ukraine', 'FEMALE', '1998-12-25',
        'ROLE_USER', '2024-03-22 11:20:00', '2024-03-22 11:20:00', '2024-03-24 11:20:00', NULL, 'LizAA@99'),

       ('Max', 'Koval', 'max.kov33@example.com', '+380971118013', 'Berlin, Germany', 'MALE', '1989-03-10',
        'ROLE_CASHIER', '2023-11-11 16:00:00', '2023-11-11 16:00:00', '2023-12-02 16:00:00', NULL, 'KovAL#33'),

       ('Anna', 'Sydorenko', 'anna.syd34@example.com', '+380931118014', 'Warsaw, Poland', 'FEMALE', '1994-01-03',
        'ROLE_USER', '2024-04-02 09:15:00', '2024-04-02 09:15:00', '2024-04-03 09:16:00', NULL, 'Sydor3nk0!'),

       ('Petro', 'Chornyi', 'petro.chor35@example.com', '+380501118015', 'Kyiv, Ukraine', 'MALE', '1983-06-07',
        'ROLE_BRANCH_MANAGER', '2023-12-03 13:30:00', '2023-12-03 13:30:00', '2024-01-03 13:32:00', NULL, 'Petro!441'),

       ('Diana', 'Miroshnyk', 'diana.miro36@example.com', '+380971118016', 'Odesa, Ukraine', 'FEMALE', '1997-04-14',
        'ROLE_USER', '2024-02-24 10:10:00', '2024-02-24 10:10:00', '2024-02-26 10:10:00', NULL, 'DiaNa$101'),

       ('Roman', 'Vasyliev', 'roman.vas37@example.com', '+380931118017', 'Khmelnytskyi, Ukraine', 'MALE', '1991-09-17',
        'ROLE_USER', '2024-03-10 12:00:00', '2024-03-10 12:00:00', '2024-03-13 12:00:00', NULL, 'RomVas!22'),

       ('Karina', 'Lysenko', 'karina.lysen38@example.com', '+380501118018', 'Kyiv, Ukraine', 'FEMALE', '1995-10-28',
        'ROLE_CASHIER', '2024-02-07 09:45:00', '2024-02-07 09:45:00', '2024-02-08 09:45:00', NULL, 'LysEnkO#5'),

       ('Ivan', 'Petryk', 'ivan.petr39@example.com', '+380971118019', 'Lviv, Ukraine', 'MALE', '1988-02-21',
        'ROLE_STORE_MANAGER', '2023-10-29 11:00:00', '2023-10-29 11:00:00', '2023-12-20 11:01:00', NULL, 'PetrIV@91'),

       ('Angelina', 'Taran', 'angelina.tar40@example.com', '+380931118020', 'Kharkiv, Ukraine', 'FEMALE', '1996-02-07',
        'ROLE_USER', '2024-03-05 08:20:00', '2024-03-05 08:20:00', '2024-03-06 08:20:00', NULL, 'Ang3Tar!'),

       ('Vitalii', 'Savchenko', 'vitalii.sav41@example.com', '+380501118021', 'Poltava, Ukraine', 'MALE', '1984-07-19',
        'ROLE_ADMIN', '2023-11-18 11:45:00', '2023-11-18 11:45:00', '2023-12-09 11:46:00', NULL, 'SavV!439'),

       ('Oksana', 'Krut', 'oksana.kru42@example.com', '+380971118022', 'Ternopil, Ukraine', 'FEMALE', '1993-03-01',
        'ROLE_USER', '2024-04-15 12:10:00', '2024-04-15 12:10:00', '2024-04-16 12:12:00', NULL, 'KrUtA@77'),

       ('Mykola', 'Tkach', 'mykola.tk43@example.com', '+380931118023', 'Lutsk, Ukraine', 'MALE', '1987-10-12',
        'ROLE_CASHIER', '2023-12-01 14:20:00', '2023-12-01 14:20:00', '2023-12-02 14:21:00', NULL, 'TkaCH#11'),

       ('Vira', 'Kushnir', 'vira.kush44@example.com', '+380501118024', 'Ivano-Frankivsk, Ukraine', 'FEMALE',
        '1998-01-19',
        'ROLE_USER', '2024-03-20 09:30:00', '2024-03-20 09:30:00', '2024-03-21 09:31:00', NULL, 'KuShN1R!'),

       ('Andrii', 'Kravchuk', 'andrii.krav45@example.com', '+380971118025', 'Kyiv, Ukraine', 'MALE', '1992-06-28',
        'ROLE_STORE_MANAGER', '2023-10-30 10:40:00', '2023-10-30 10:40:00', '2023-12-20 10:41:00', NULL, 'KraV!445'),

       ('Zoriana', 'Marchuk', 'zoriana.mar46@example.com', '+380931118026', 'Lviv, Ukraine', 'FEMALE', '1997-03-18',
        'ROLE_USER', '2024-04-07 08:05:00', '2024-04-07 08:05:00', '2024-04-07 08:06:00', NULL, 'ZoriaNA@4'),

       ('Taras', 'Shostak', 'taras.shos47@example.com', '+380501118027', 'Odesa, Ukraine', 'MALE', '1986-09-05',
        'ROLE_CASHIER', '2024-01-29 13:30:00', '2024-01-29 13:30:00', '2024-01-30 13:30:00', NULL, 'ShoStak$'),

       ('Yana', 'Vovk', 'yana.vov48@example.com', '+380971118028', 'Kyiv, Ukraine', 'FEMALE', '1994-06-22',
        'ROLE_BRANCH_MANAGER', '2023-12-14 09:55:00', '2023-12-14 09:55:00', '2024-01-08 09:55:00', NULL, 'VovK@889'),

       ('Marko', 'Lupenko', 'marko.lup49@example.com', '+380931118029', 'Sumy, Ukraine', 'MALE', '1983-04-16',
        'ROLE_USER', '2024-02-12 10:22:00', '2024-02-12 10:22:00', '2024-02-13 10:23:00', NULL, 'LuPENko!'),

       ('Kristina', 'Horbenko', 'kristina.hor50@example.com', '+380501118030', 'Kyiv, Ukraine', 'FEMALE', '1996-11-23',
        'ROLE_USER', '2024-03-17 11:33:00', '2024-03-17 11:33:00', '2024-03-19 11:33:00', NULL, 'KrisT!na2');
