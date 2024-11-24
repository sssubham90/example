-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
create table MyEntity (id bigint not null, field varchar(255), primary key (id));
create sequence MyEntity_SEQ start with 1 increment by 50;
