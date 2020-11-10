CREATE TABLE `teachers`(
   `uuid` varchar(180) NOT NULL,
   `name` varchar(255) DEFAULT NULL,
   `lastname` varchar(255) DEFAULT NULL,
   `created_at` date NOT NULL,
   `updated_at` date DEFAULT NULL,
   PRIMARY KEY(`uuid`)
)