use furnitureerp;
DROP TABLE T3;
CREATE TABLE db1.T3 (
  id int(11) NOT NULL AUTO_INCREMENT,
   #CreateZ.sql01 COL varchar(30) NOT NULL,
	T3C1 varchar(30) NOT NULL,
	T3C2 varchar(30) NOT NULL,
	T3C3 varchar(30) NOT NULL,
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` varchar(30) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` varchar(30) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
