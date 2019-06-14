create table pc.cpu_category(
cpu_category_id varchar(20),
cpu_category_name varchar(20) unique not null,
cpu_category_sort_number integer not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(cpu_category_id)
);