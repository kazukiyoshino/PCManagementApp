create table pc.os_category(
os_category_id varchar(20),
os_category_name varchar(20) unique not null,
os_category_sort_number integer not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(os_category_id)
);