-- 2) 데이터베이스 생성 후 계정에 권한 부여
-- 데이터베이스(스키마) 생성
CREATE DATABASE Gelato;
-- CREATE SCHEMA Gelato;

-- GRANT ALL PRIVILEGES ON Gelato.* TO 'ohgiraffers'@'%'; 

SHOW GRANTS FOR 'ohgiraffers'@'%';

USE Gelato;