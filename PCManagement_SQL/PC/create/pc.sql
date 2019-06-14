create sequence pc_id_seq
	start with 1
	no cycle;


create table pc.pc(
pc_id integer default nextval('pc_id_seq'),
pc_name varchar(100) not null,
pc_category_id varchar(20) not null references pc.pc_category(pc_category_id),
use_category_id varchar(20) not null references pc.use_category(use_category_id),
pc_create_at_year integer not null,
pc_create_at date not null,
os_category_id varchar(20) not null references pc.os_category(os_category_id),
os_name varchar(50) not null,
cpu_category_id varchar(20) not null references pc.cpu_category(cpu_category_id),
cpu_name varchar(100) not null,
memory_capacity integer not null,
memory_capacity_unit_id char(2) not null references unit.byte_unit(unit_id),
note text not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(pc_id)
);
