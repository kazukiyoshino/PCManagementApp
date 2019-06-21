insert into account.account values('admin','password',current_timestamp,current_timestamp);

insert into pc.pc values(1,'test_pc_name','note','not_using','2019',current_date,'windows','10','intel','core i7',16,'GB','test_note',current_timestamp,current_timestamp);
insert into pc.office values(1,true,'test_office_name',current_timestamp,current_timestamp);
insert into pc.storage values(1,'HDD',2,'TB',current_timestamp,current_timestamp);


insert into pc.pc values(2,'test_pc_name_second','desktop','not_using','2016','2016-12-31','mac','OS12','amd','Ryzen5',8,'GB','test_note_second',current_timestamp,current_timestamp);
insert into pc.office values(2,false,'',current_timestamp,current_timestamp);
insert into pc.storage values(2,'SSD',500,'MB',current_timestamp,current_timestamp);

insert into pc.pc values(3,'test_pc_name_third','other','not_using','2014','2014-12-31','other','unkwoun','Other','unknoun',512,'MB','test_note_third',current_timestamp,current_timestamp);
insert into pc.office values(3,false,'',current_timestamp,current_timestamp);
insert into pc.storage values(3,'Other',500,'GB',current_timestamp,current_timestamp);