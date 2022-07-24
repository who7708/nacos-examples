CREATE TABLE `user`
(
    `id`   bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(10)         NOT NULL DEFAULT '',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;