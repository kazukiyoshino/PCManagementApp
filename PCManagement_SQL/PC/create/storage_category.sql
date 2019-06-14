create table pc.storage_category(
storage_category_id varchar(20),
storage_category_name varchar(20) unique not null,
pc_category_sort_number integer not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(storage_category_id)
);