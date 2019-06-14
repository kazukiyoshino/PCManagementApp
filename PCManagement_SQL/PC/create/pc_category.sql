create table pc.pc_category(
pc_category_id varchar(20),
pc_category_name varchar(20) unique not null,
pc_category_sort_number integer not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(pc_category_id)
);