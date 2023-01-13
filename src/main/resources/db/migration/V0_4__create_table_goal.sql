create table goal
(
    id     serial,
    scoring_time varchar ,
    player_id int not null
    constraint goal_player_id_fk references player(id),
    primary key (id)
);