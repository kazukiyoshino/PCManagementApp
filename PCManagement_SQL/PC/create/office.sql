create table pc.office(
pc_id integer references pc.pc(pc_id),
office_exist boolean not null,
office_name varchar(100) not null default '',
create_at timestamp not null default current_timestamp,
update_at timestamp not null default current_timestamp,
primary key(pc_id)
);