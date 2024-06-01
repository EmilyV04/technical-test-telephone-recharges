INSERT INTO OPERATOR (id, name) VALUES
(11, 'Tigo'),
(21, 'Movistar'),
(31, 'Comcel'),
(41, 'Uff');

INSERT INTO SELLER (id, name) VALUES
(11, 'Ana'),
(21, 'Pablo');

INSERT INTO RECHARGE (id, phone, value_recharge, operator_id, seller_id) VALUES
(11, '3216549875', 10000, 11, 21),
(21, '3258967418', 50000, 31, 11);
