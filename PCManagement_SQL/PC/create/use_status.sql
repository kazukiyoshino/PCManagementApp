create table pc.use_status(
pc_id integer references pc.pc(pc_id),
use_status_history_id integer not null references pc.use_status_history(use_status_history_id),
create_at timestamp not null,
update_at timestamp not null,
primary key(pc_id)
);