create table pc.storage(
pc_id integer references pc.pc(pc_id),
storage_category_id varchar(20) not null references pc.storage_category(storage_category_id),
storage_capacity integer not null,
byte_unit_id char(2) not null references unit.byte_unit(unit_id),
create_at timestamp not null,
update_at timestamp not null,
primary key(pc_id)
);