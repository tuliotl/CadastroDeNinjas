
-- V2: Migration para adicionar a coluna de RANK na tabelaa de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);