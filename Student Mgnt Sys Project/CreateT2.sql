use db1; 
DROP TABLE T2;
CREATE TABLE db1.T2 (
  id int(11) NOT NULL AUTO_INCREMENT,
   #CreateZ.sql01 COL varchar(30) NOT NULL,
	T2C1 varchar(30) NOT NULL,
	T2C2 varchar(30) NOT NULL,
	T2C3 varchar(30) NOT NULL,
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` varchar(30) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` varchar(30) DEFAULT NULL,
  PRIMARY KEY (id)
);
