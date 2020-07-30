alter table servidor add column cargo_id bigserial;
alter table servidor add foreign key (cargo_id) references cargo;
