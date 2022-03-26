CREATE DATABASE sms;
use sms;
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `type` smallint DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `status` smallint DEFAULT NULL,
  `lastlogin` timestamp NULL DEFAULT NULL,
  `nofailedlogins` smallint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `admission` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int DEFAULT NULL,
  `course_id` int DEFAULT NULL,
  `date_of_admission` date DEFAULT NULL,
  `admission_by` int DEFAULT NULL,
  `fees_charged` double DEFAULT NULL,
  `fees_paid` double DEFAULT NULL,
  `fees_balance` double DEFAULT NULL,
  `payment_type` smallint DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `referral` varchar(30) DEFAULT NULL,
  `asn_no` varchar(30) DEFAULT NULL,
  `location_id` int DEFAULT NULL,
  `counsellor_id` int DEFAULT NULL,
  `dttm` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `attendence` (
  `id` int NOT NULL AUTO_INCREMENT,
  `session_id` int DEFAULT NULL,
  `student_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `batch` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `course_id` int DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `batchstudents` (
  `id` int NOT NULL AUTO_INCREMENT,
  `batch_id` int DEFAULT NULL,
  `student_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `certificate` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int DEFAULT NULL,
  `course_id` int DEFAULT NULL,
  `grade` varchar(30) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `performance` varchar(30) DEFAULT NULL,
  `comments` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `communication` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` smallint DEFAULT NULL,
  `from1` int DEFAULT NULL,
  `to1` int DEFAULT NULL,
  `subject` varchar(128) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `dttm` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `counsell_student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dttm` datetime DEFAULT NULL,
  `counsell_by_id` int DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `requirement` varchar(30) DEFAULT NULL,
  `interest_area` varchar(30) DEFAULT NULL,
  `suggested_course` varchar(30) DEFAULT NULL,
  `expected_joining` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `education` varchar(30) DEFAULT NULL,
  `more_info` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `counsellor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `type` smallint DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `status` smallint DEFAULT NULL,
  `lastlogin` timestamp NULL DEFAULT NULL,
  `nofailedlogins` smallint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `course` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hours` int DEFAULT NULL,
  `fees` int DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `coursesubjecttopic` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_id` int DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `topic_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `documents` (
  `id` int NOT NULL AUTO_INCREMENT,
  `bytype` int DEFAULT NULL,
  `typeid` int DEFAULT NULL,
  `docname` varchar(30) DEFAULT NULL,
  `document` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `exam` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `type` smallint DEFAULT NULL,
  `student_id` int DEFAULT NULL,
  `course_id` int DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `topic_id` int DEFAULT NULL,
  `marks` smallint DEFAULT NULL,
  `dttm` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `faculty` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `type` smallint DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `status` smallint DEFAULT NULL,
  `lastlogin` timestamp NULL DEFAULT NULL,
  `nofailedlogins` smallint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `feedback` (
  `id` int NOT NULL AUTO_INCREMENT,
  `from1` varchar(30) DEFAULT NULL,
  `for1` varchar(30) DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `suggestion` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `level` int DEFAULT NULL,
  `dttm` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `institute` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `type` smallint DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `status` smallint DEFAULT NULL,
  `lastlogin` timestamp NULL DEFAULT NULL,
  `nofailedlogins` smallint DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `location` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `facility` varchar(30) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `contact_person` varchar(30) DEFAULT NULL,
  `phone_number` varchar(30) DEFAULT NULL,
  `classrooms` varchar(30) DEFAULT NULL,
  `labs` varchar(30) DEFAULT NULL,
  `details` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `lookup` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(30) DEFAULT NULL,
  `scode` varchar(30) DEFAULT NULL,
  `icode` int DEFAULT NULL,
  `value` varchar(30) DEFAULT NULL,
  `fixed` char(1) DEFAULT NULL,
  `enabled` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `project` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `scope` varchar(255) DEFAULT NULL,
  `domain` varchar(30) DEFAULT NULL,
  `technology` varchar(30) DEFAULT NULL,
  `type` smallint DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `project_student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int DEFAULT NULL,
  `project_id` int DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `deadline` date DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `question_bank` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_id` int DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `topic_id` int DEFAULT NULL,
  `set_id` int DEFAULT NULL,
  `question` varchar(30) DEFAULT NULL,
  `a` varchar(30) DEFAULT NULL,
  `b` varchar(30) DEFAULT NULL,
  `c` varchar(30) DEFAULT NULL,
  `d` varchar(30) DEFAULT NULL,
  `correct` char(1) DEFAULT NULL,
  `complexcity` smallint DEFAULT NULL,
  `answer_time` smallint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `question_paper` (
  `id` int NOT NULL AUTO_INCREMENT,
  `set_id` int DEFAULT NULL,
  `total_number_of_question` int DEFAULT NULL,
  `number_of_questions_to_answer` int DEFAULT NULL,
  `question` varchar(30) DEFAULT NULL,
  `marks` int DEFAULT NULL,
  `answer` varchar(30) DEFAULT NULL,
  `allocated_time` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `schedule` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_id` int DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `location_id` int DEFAULT NULL,
  `faculty_id` int DEFAULT NULL,
  `batch_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `session` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `location_id` int DEFAULT NULL,
  `venue_id` int DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  `course_id` int DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `topic_id` int DEFAULT NULL,
  `faculty_id` int DEFAULT NULL,
  `batch_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `education` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `lastlogin` timestamp NULL DEFAULT NULL,
  `nofailedlogins` smallint DEFAULT NULL,
  `status` smallint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `studymaterial` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_id` int DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `topic_id` int DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `subject` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hours` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `topic` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hours` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `transaction` (
  `id` int NOT NULL AUTO_INCREMENT,
  `admission_id` int DEFAULT NULL,
  `student_id` int DEFAULT NULL,
  `type` smallint DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `receipt` varchar(30) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `narration` varchar(30) DEFAULT NULL,
  `dttm` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `phone_no` varchar(12) DEFAULT NULL,
  `email_id` varchar(30) DEFAULT NULL,
  `user_type` smallint DEFAULT NULL,
  `lastlogin` timestamp NULL DEFAULT NULL,
  `nofailedlogin` smallint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `venue` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `location_id` int DEFAULT NULL,
  `type` smallint DEFAULT NULL,
  `details` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;
