create table pc.use_category(
use_category_id varchar(20),
use_category_name varchar(20) unique not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(use_category_id)
);
