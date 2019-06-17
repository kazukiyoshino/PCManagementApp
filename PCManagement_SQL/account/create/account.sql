create table account.account(
account_id varchar(50),
account_passsword varchar(200) not null,
role_name varchar(20) not null,
create_at timestamp not null,
update_at timestamp not null,
primary key(account_id)
);
