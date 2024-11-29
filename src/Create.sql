CREATE DATABASE IF NOT EXISTS ecommerce;

USE ecommerce;

CREATE TABLE IF NOT EXISTS produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    descricao TEXT NOT NULL,
    peso DECIMAL(10, 2) NOT NULL,
    quantidade INT NOT NULL,
    unidade ENUM('metro', 'metro quadrado', 'litro', 'kg') NOT NULL
);