-- auto Generated on 2017-09-09 17:09:01 
-- DROP TABLE IF EXISTS `user`; 
CREATE TABLE user(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `user_uuid` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user_uuid',
    `user_token` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user_token',
    `user_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user_name',
    `user_create_time` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user_create_time',
    `user_avatr` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user_avatr',
    `user_status` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user_status',
    `user_permission` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'user_permission',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'user';
