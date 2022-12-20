create table match
(
    id     serial,
    datetime date,
    stadium varchar,
    teamA_id           int                  not null
        constraint player_teamA_id_fk references team(id),
    teamB_id         int                  not null
        constraint player_teamB_id_fk references team(id),
    primary key (id)
);