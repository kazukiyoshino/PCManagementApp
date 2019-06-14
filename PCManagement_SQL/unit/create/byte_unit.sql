create table unit.byte_unit(
unit_id char(2),
unit_name char(2) unique not null,
unit_sort_bigger integer not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(unit_id)
);