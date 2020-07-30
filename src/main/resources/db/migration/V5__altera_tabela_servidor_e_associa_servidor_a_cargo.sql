alter table servidor add column cargo_id bigserial;
alter table servidor add foreign key (cargo_id) references cargo;

update servidor set cargo_id = 1  where id = 1;
update servidor set cargo_id = 2  where id = 2;
update servidor set cargo_id = 3  where id = 3;
