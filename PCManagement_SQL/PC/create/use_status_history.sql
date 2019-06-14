create table pc.use_status_history(
use_status_history_id integer,
pc_id integer not null references pc.pc(pc_id),
account_id varchar(50) not null references account.account(account_id),
start_at date not null,
deadline_at date not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(use_status_history_id)
);