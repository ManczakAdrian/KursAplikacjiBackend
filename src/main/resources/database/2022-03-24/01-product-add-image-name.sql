--liquibase formatted sql
--changeset amanczak:2
alter table product add image varchar(128) after currency