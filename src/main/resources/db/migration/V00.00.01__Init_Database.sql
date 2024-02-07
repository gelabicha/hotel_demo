create table hotel (
hotel_id serial primary key,
hotel_name VARCHAR(255),
hotel_address VARCHAR(255),
hotel_phone VARCHAR(255)
);

create table room(
room_id serial primary key,
hotel_id int,
room_type VARCHAR(255),
pricepernight DECIMAL(10, 2),
description VARCHAR(255),
pet_friendly boolean default false,
room_status boolean default true,
FOREIGN KEY (hotel_id) REFERENCES hotel(hotel_id)
);

create table guest(
guest_id serial primary key,
personal_number VARCHAR(255),
firstname VARCHAR(255),
lastname VARCHAR(255),
dateofbirth date,
address VARCHAR(255),
phone VARCHAR(255),
email VARCHAR(255)
);

create table booking(
booking_id serial primary key,
guest_id int,
room_id int,
checkinDate timestamp,
checkoutDate timestamp,
bookingOff boolean default false,
bookingOffDate timestamp,
totalPrice DECIMAL(10, 2),
FOREIGN KEY (guest_id) REFERENCES guest(guest_id),
FOREIGN KEY (room_id) REFERENCES room(room_id)
);

create table history(
history_id serial primary key,
guest_id int,
room_id int,
checkinDate timestamp,
checkoutDate timestamp,
bookingoff boolean default false,
bookingOffDate timestamp,
FOREIGN KEY (guest_id) REFERENCES guest(guest_id),
FOREIGN KEY (room_id) REFERENCES room(room_id)
);
