-- liquibase formatted sql
-- changeset sombriks:changeset_2023_05_01_12_00_00-carga_incremental_situacao.sql

insert into estados_documento (id, nome)
values (3, 'encerrado');

-- rollback delete from estados_documento;
