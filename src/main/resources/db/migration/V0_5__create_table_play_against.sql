create table match
(
    id     serial,
    datetime date,
    stadium varchar,
    score_a     int                  not null
        constraint match_score_a_fk references goal(id),
    score_b     int                  not null
        constraint match_score_b_fk references goal(id),
    teamA_id           int                  not null
        constraint player_teamA_id_fk references team(id),
    teamB_id         int                  not null
        constraint player_teamB_id_fk references team(id),
    primary key (id)
);