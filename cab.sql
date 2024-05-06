use georgetravels;
create table cab (
 cab_id int auto_increment primary key,
 driver_name varchar(256),
 rt_number varchar(256),
 vehicle_type varchar(256),
 phone_number varchar(256),
 start_location varchar(256),
 end_location varchar(256),
 booking_status varchar(256)
);