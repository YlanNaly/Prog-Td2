create table match
(
    id     serial,
    datetime date,
    stadium varchar,
    team_id           int                  not null
        constraint player_team_id_fk references team(id),
    primary key (id)
);