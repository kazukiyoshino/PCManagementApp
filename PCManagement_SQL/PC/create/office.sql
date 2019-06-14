create table pc.office(
pc_id integer references pc.pc(pc_id),
office_exist boolean not null,
office_name varchar(100) not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(pc_id)
);