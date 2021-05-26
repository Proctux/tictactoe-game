CREATE TABLE apspoo.resultado_partida (
                cd_resultado INTEGER NOT NULL,
                nm_perdedor VARCHAR(40) NOT NULL,
                nm_ganhador VARCHAR(40) NOT NULL,
                bl_empate BOOLEAN NOT NULL,
                CONSTRAINT resultado_partida_pk PRIMARY KEY (cd_resultado)
);


CREATE TABLE apspoo.jogador (
                cd_jogador SERIAL NOT NULL,
                nm_jogador VARCHAR(40) NOT NULL,
                qt_vitorias INTEGER NOT NULL,
                qt_derrotas INTEGER NOT NULL,
                qt_empates INTEGER NOT NULL,
                CONSTRAINT jogador_pk PRIMARY KEY (cd_jogador)
);


CREATE TABLE apspoo.partida (
                cd_partida SERIAL NOT NULL,
                cd_resultado INTEGER NOT NULL,
                cd_jogador INTEGER NOT NULL,
                CONSTRAINT partida_pk PRIMARY KEY (cd_partida)
);


ALTER TABLE apspoo.partida ADD CONSTRAINT resultado_partida_partida_fk
FOREIGN KEY (cd_resultado)
REFERENCES apspoo.resultado_partida (cd_resultado)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE apspoo.partida ADD CONSTRAINT jogador_partida_fk
FOREIGN KEY (cd_jogador)
REFERENCES apspoo.jogador (cd_jogador)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
