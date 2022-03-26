use furnitureerp;
DROP TABLE C1;
CREATE TABLE db1.C1 (
  id int(11) NOT NULL AUTO_INCREMENT,
   #CreateZ.sql01 COL varchar(30) NOT NULL,
	C1P1id varchar(30) NOT NULL,
	C1C2 varchar(30) NOT NULL,
	C1C3 varchar(30) NOT NULL,
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` varchar(30) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` varchar(30) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
