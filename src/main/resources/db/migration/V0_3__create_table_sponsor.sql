create table sponsor
(
    id     serial,
    name varchar,
    team_id           int                  not null
    constraint sponsor_team_id_fk references team(id),
    primary key (id)
);