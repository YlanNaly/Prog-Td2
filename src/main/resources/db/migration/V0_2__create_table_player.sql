create table player
(
    id     serial,
    name varchar,
    number int not null ,
    team_id           int                  not null
    constraint player_team_id_fk references team(id),
    primary key (id)
);