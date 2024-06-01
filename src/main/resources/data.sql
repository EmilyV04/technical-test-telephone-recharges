INSERT INTO OPERATOR (id, name) VALUES
(1, 'Tigo'),
(2, 'Movistar'),
(3, 'Comcel'),
(4, 'Uff');

INSERT INTO SELLER (id, name) VALUES
(1, 'Ana'),
(2, 'Pablo');

INSERT INTO RECHARGE (id, phone, value_recharge, operator_id, seller_id) VALUES
(1, '3216549875', 10000, 1, 2),
(2, '3258967418', 50000, 3, 1);
