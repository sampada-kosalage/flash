use db1;
DROP TABLE P1;
CREATE TABLE db1.P1 (
  id int(11) NOT NULL AUTO_INCREMENT,
   #CreateZ.sql01 COL varchar(30) NOT NULL,
	P1C1 varchar(30) NOT NULL,
	P1C2 varchar(30) NOT NULL,
	P1C3 varchar(30) NOT NULL,
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` varchar(30) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` varchar(30) DEFAULT NULL,
  PRIMARY KEY (id)
); 