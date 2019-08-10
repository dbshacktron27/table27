CREATE TABLE `message_queue`.`queue_info` (
  `queue_message` VARCHAR(150) NOT NULL,
  `queue_size` INT NULL,
  PRIMARY KEY (`queue_message`));


CREATE TABLE `message_queue`.`queue_message` (
  `queue_message_id` INT NOT NULL AUTO_INCREMENT,
  `queue_message` VARCHAR(150) NULL,
  `message_status` TINYINT(4) NULL,
  PRIMARY KEY (`queue_message_id`),
  INDEX `queue_message_fk_idx` (`queue_message` ASC) VISIBLE,
  CONSTRAINT `queue_message_fk`
    FOREIGN KEY (`queue_message`)
    REFERENCES `message_queue`.`queue_info` (`queue_message`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
