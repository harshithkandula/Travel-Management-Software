use georgetravels;
create table ride(
  rid int primary key auto_increment,
  cab_id int,
  customer_name varchar(256),
  customer_phone_number varchar(256),
  source varchar(256),
  destination varchar(256),
  pickup_time varchar(256),
  drop_time varchar(256),
  distance int,
  fare int,
  foreign key(cab_id) references Cab(cab_id));