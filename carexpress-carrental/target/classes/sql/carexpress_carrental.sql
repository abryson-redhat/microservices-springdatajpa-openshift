SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

CREATE USER carexpress WITH PASSWORD 'expre$$';

CREATE DATABASE carexpress
  WITH OWNER = carexpress
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'C'
       LC_CTYPE = 'C'
       CONNECTION LIMIT = -1;

 
CREATE SCHEMA carexpress;

ALTER SCHEMA carexpress OWNER TO carexpress;

SET search_path = carexpress, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

-- CREATE UNIQUE INDEX description_idx ON description USING btree (name);

-- CREATE INDEX description_idx_2 ON description USING btree (lower((short_description)::text));

-- CREATE UNIQUE INDEX email_idx_2 ON email USING btree (email_address_type, email_address) WHERE (active = true);

-- ALTER TABLE ONLY area
--     ADD CONSTRAINT area_restaurant_id_fkey FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id);



CREATE TABLE carexpress.car (
	id SERIAL PRIMARY KEY,
	make character varying(128) NOT NULL,
	model character varying(128) NOT NULL,
	year numeric(4,0) NOT NULL,
	description text,
	carclass character varying(32) NOT NULL,
	rental_class character varying(64) NOT NULL,
	color character varying(128) NOT NULL,
	milage integer NOT NULL,
	date_time timestamp without time zone NOT NULL,
	date_time_tz character(2) NOT NULL
	
);

ALTER TABLE carexpress.car OWNER TO carexpress;

--CREATE SEQUENCE seq_car
--    START WITH 1
--    INCREMENT BY 1
--    NO MINVALUE
--    NO MAXVALUE
--    CACHE 1;

-- ALTER TABLE seq_car OWNER TO carexpress;

-- ALTER SEQUENCE seq_car OWNED BY car.car_id;

-- ALTER TABLE ONLY car
--     ADD CONSTRAINT car_pkey PRIMARY KEY (car_id);

CREATE TABLE carexpress.customer (
  id SERIAL PRIMARY KEY,
  first_name character varying(128) NOT NULL,
  middle_name character varying(128) NOT NULL,
  last_name character varying(128) NOT NULL,
  prefix character varying(32) NOT NULL,
  suffix character varying(32) NOT NULL,
  level character varying(32) NOT NULL,
  phone_nbr character varying(10) NOT NULL,
  address_id integer,
  date_time timestamp without time zone NOT NULL,
  date_time_tz character(2) NOT NULL

);



ALTER TABLE carexpress.customer OWNER TO carexpress;

-- CREATE SEQUENCE seq_customer
--    START WITH 1
--    INCREMENT BY 1
--    NO MINVALUE
--    NO MAXVALUE
--    CACHE 1;

-- ALTER TABLE seq_customer OWNER TO carexpress;

-- ALTER SEQUENCE seq_customer OWNED BY customer.customer_id;

-- ALTER TABLE ONLY customer
--    ADD CONSTRAINT customer_pkey PRIMARY KEY (customer_id);

CREATE UNIQUE INDEX customer_idx ON carexpress.customer USING btree (phone_nbr);
CREATE INDEX customer_idx_2 ON carexpress.customer USING btree (upper((last_name)::text), upper((first_name)::text));    
    
CREATE TABLE carexpress.agent (
	id SERIAL PRIMARY KEY,
	first_name character varying(128) NOT NULL,
  	middle_name character varying(128) NOT NULL,
  	last_name character varying(128) NOT NULL,
  	prefix character varying(32),
  	suffix character varying(32),
    date_time timestamp without time zone NOT NULL,
    date_time_tz character(2) NOT NULL
);

ALTER TABLE carexpress.agent OWNER TO carexpress;

-- CREATE SEQUENCE seq_agent
--    START WITH 1
--    INCREMENT BY 1
--    NO MINVALUE
--    NO MAXVALUE
--    CACHE 1;

-- ALTER TABLE seq_agent OWNER TO carexpress;

-- ALTER SEQUENCE seq_agent OWNED BY agent.agent_id;

-- ALTER TABLE ONLY agent
--    ADD CONSTRAINT agent_pkey PRIMARY KEY (agent_id);

CREATE INDEX agent_idx ON carexpress.agent USING btree (upper((last_name)::text), upper((first_name)::text));    
    
    
CREATE TABLE carexpress.reservation (
	id SERIAL PRIMARY KEY,
	reservation_date DATE NOT NULL,
	reservation_time TIME without time zone NOT NULL,
	reservation_time_tz char(2) NOT NULL,
	return_date DATE NOT NULL,
	return_time TIME without time zone NOT NULL,
	return_time_tz char(2) NOT NULL,
	customer_id integer NOT NULL,
	reservation_location_id integer NOT NULL,
	return_location_id integer NOT NULL,
	booking_agent_id integer NOT NULL,
	return_agent_id integer NOT NULL,
	nbr_of_days numeric(4,0) NOT NULL,
  	date_time timestamp without time zone NOT NULL,
  	date_time_tz character(2) NOT NULL
	
);

ALTER TABLE carexpress.reservation OWNER TO carexpress;

-- CREATE SEQUENCE seq_reservation
--    START WITH 1
--    INCREMENT BY 1
--    NO MINVALUE
--    NO MAXVALUE
--    CACHE 1;

-- ALTER TABLE seq_reservation OWNER TO carexpress;

-- ALTER SEQUENCE seq_reservation OWNED BY reservation.reservation_id;

-- ALTER TABLE ONLY reservation
--    ADD CONSTRAINT reservation_pkey PRIMARY KEY (reservation_id);

CREATE UNIQUE INDEX reservation_idx ON carexpress.reservation USING btree (reservation_location_id, reservation_date, reservation_time);

CREATE TABLE carexpress.address (
	id SERIAL PRIMARY KEY,
    address_line_1 character varying(256) NOT NULL,
    address_line_2 character varying(256),
    address_line_3 character varying(256),
    city character varying(128) NOT NULL,
    state character(2) NOT NULL,
    zip character varying(12) NOT NULL,
    country character(2) NOT NULL,
    timezone character(2)
);


ALTER TABLE carexpress.address OWNER TO carexpress;

-- CREATE SEQUENCE seq_address
--    START WITH 1
--    INCREMENT BY 1
--    NO MINVALUE
--    NO MAXVALUE
--    CACHE 1;

-- ALTER TABLE seq_address OWNER TO carexpress;

-- ALTER SEQUENCE seq_address OWNED BY address.address_id;

-- ALTER TABLE ONLY address
--    ADD CONSTRAINT address_pkey PRIMARY KEY (address_id);

CREATE INDEX address_idx ON carexpress.address USING btree (country, state, zip, city, address_line_1));
    
CREATE TABLE carexpress.location ( 
	id SERIAL PRIMARY KEY,
	name character varying(256) NOT NULL,
	address_id integer NOT NULL,
	phone_nbr character varying(10) NOT NULL,
	days_open character(7) NOT NULL,
	hour_open character(14) NOT NULL,
	hour_close character(14) NOT NULL,
	location_tz character(2) NOT NULL,
  	date_time timestamp without time zone NOT NULL,
  	date_time_tz character(2) NOT NULL	
);

ALTER TABLE carexpress.location OWNER TO carexpress;

-- CREATE SEQUENCE seq_location
--    START WITH 1
--    INCREMENT BY 1
--    NO MINVALUE
--    NO MAXVALUE
--    CACHE 1;

-- ALTER TABLE seq_location OWNER TO carexpress;

-- ALTER SEQUENCE seq_location OWNED BY location.location_id;

-- ALTER TABLE ONLY location
--     ADD CONSTRAINT location_pkey PRIMARY KEY (location_id);

CREATE UNIQUE INDEX location_idx ON carexpress.location USING btree (name);

CREATE TABLE carexpress.dropoff (
	id SERIAL PRIMARY KEY,
	dropoff_date DATE NOT NULL,
	dropoff_time TIME without time zone NOT NULL,
	dropoff_time_tz char(2) NOT NULL,
	customer_id integer NOT NULL,
	return_location_id integer NOT NULL,
	return_agent_id integer NOT NULL,
	nbr_of_days numeric(4,0) NOT NULL,
  	date_time timestamp without time zone NOT NULL,
  	date_time_tz character(2) NOT NULL
	
);

ALTER TABLE carexpress.dropoff OWNER TO carexpress;

-- CREATE SEQUENCE seq_dropoff
--    START WITH 1
--    INCREMENT BY 1
--    NO MINVALUE
--    NO MAXVALUE
--    CACHE 1;

-- ALTER TABLE seq_dropoff OWNER TO carexpress;

-- ALTER SEQUENCE seq_dropoff OWNED BY dropoff.dropoff_id;

-- ALTER TABLE ONLY dropoff
--    ADD CONSTRAINT dropoff_pkey PRIMARY KEY (dropoff_id);

CREATE UNIQUE INDEX dropoff_idx ON carexpress.dropoff USING btree (return_location_id, dropoff_date, dropoff_time);

-- INSERT INTO films (code, title, did, date_prod, kind)
--     VALUES ('T_601', 'Yojimbo', 106, '1961-06-16', 'Drama');
-- current_timestamp
-- current_time
-- current_date

    
INSERT INTO carexpress.address (address_line_1, address_line_2, address_line_3, city, state, zip, country, timezone)
    VALUES ('2004 Savannah Highway', null, null, 'Charleston', 'SC', '29414', 'US', 'ET');
    
INSERT INTO carexpress.address (address_line_1, address_line_2, address_line_3, city, state, zip, country, timezone)
    VALUES ('2440 Savannah Highway', null, null, 'Charleston', 'SC', '29414', 'US', 'ET');
    
INSERT INTO carexpress.address (address_line_1, address_line_2, address_line_3, city, state, zip, country, timezone)
    VALUES ('208 Easy St', null, null, 'Johns Island', 'SC', '29444', 'US', 'ET');

INSERT INTO carexpress.address (address_line_1, address_line_2, address_line_3, city, state, zip, country, timezone)
    VALUES ('199 DaMan St', null, null, 'Johns Island', 'SC', '29443', 'US', 'ET');
    
INSERT INTO carexpress.car (make, model, year, description, carclass, rental_class, color, milage, date_time, date_time_tz) 
	VALUES ('Jeep', 'Wrangler X', 2009, 'A hoppin boppin mud sloggin beastie', 'OFF ROAD', 'STANDARD', 'BLACK', 12000, current_timestamp, 'ET');
	
INSERT INTO carexpress.car (make, model, year, description, carclass, rental_class, color, milage, date_time, date_time_tz) 
	VALUES ('Chrysler', '300', 2018, 'A smokin road ragin beastie', '4 DOOR', 'PREMIUM', 'CHERRY RED', 11999, current_timestamp, 'ET');

INSERT INTO carexpress.car (make, model, year, description, carclass, rental_class, color, milage, date_time, date_time_tz) 
	VALUES ('Infinity', 'Q80', 2018, 'A cruise ship with wheels', 'SUV', 'LUXURY', 'CHAMPAIGN', 10999, current_timestamp, 'ET');
	
INSERT INTO carexpress.customer (first_name, middle_name, last_name, prefix, suffix, level, phone_nbr, address_id, date_time, date_time_tz) 
	VALUES ('Samuel', 'L', 'Jackson', '', '', 'GOLD', '8422071019', 3, current_timestamp, 'ET');

INSERT INTO carexpress.customer (first_name, middle_name, last_name, prefix, suffix, level, phone_nbr, address_id, date_time, date_time_tz)	
	VALUES ('Denzel', 'H', 'Washington', '', 'Jr', 'PLATINUM', '8032987645', 4, current_timestamp, 'ET');
	
INSERT INTO carexpress.location (name, address_id, phone_nbr, days_open, hour_open, hour_close, location_tz, date_time, date_time_tz)	
	VALUES ('Store 1', 1, '8432927777', '0111111', '00080808080808', '00171717171713', 'ET', current_timestamp, 'ET');
	
INSERT INTO carexpress.location (name, address_id, phone_nbr, days_open, hour_open, hour_close, location_tz, date_time, date_time_tz)	
	VALUES ('Store 2', 2, '8437650198', '0111111', '00080808080808', '00171717171713', 'ET', current_timestamp, 'ET');
	
INSERT INTO carexpress.agent (first_name, middle_name, last_name, prefix, suffix, date_time, date_time_tz) 
	VALUES ('Tom', 'E', 'Brady', '', '', current_timestamp, 'ET');
	
INSERT INTO carexpress.agent (first_name, middle_name, last_name, prefix, suffix, date_time, date_time_tz) 
	VALUES ('Alvin', 'M', 'Kamara', '', '', current_timestamp, 'ET');
	
INSERT INTO carexpress.reservation (reservation_date, reservation_time, reservation_time_tz, return_date, return_time, return_time_tz, customer_id, 
                         reservation_location_id, return_location_id, booking_agent_id, return_agent_id, nbr_of_days, date_time, date_time_tz)
       VALUES ('2018-02-27', '13:00:05', 'ET', '2018-02-28', '14:05:00', 'ET', 1, 1, 1, 1, 1, 1, current_timestamp, 'ET');
       
INSERT INTO carexpress.reservation (reservation_date, reservation_time, reservation_time_tz, return_date, return_time, return_time_tz, customer_id, 
                         reservation_location_id, return_location_id, booking_agent_id, return_agent_id, nbr_of_days, date_time, date_time_tz)
       VALUES ('2018-02-27', '14:05:05', 'ET', '2018-02-28', '14:10:00', 'ET', 2, 2, 2, 2, 2, 2, current_timestamp, 'ET');
                         
INSERT INTO carexpress.dropoff (dropoff_date, dropoff_time, dropoff_time_tz, customer_id, return_location_id, return_agent_id, nbr_of_days, 
                     date_time, date_time_tz)
            VALUES ('2018-02-28', '14:05:00', 'ET', 1, 1, 1, 2, current_timestamp, 'ET');
            
INSERT INTO carexpress.dropoff (dropoff_date, dropoff_time, dropoff_time_tz, customer_id, return_location_id, return_agent_id, nbr_of_days, 
                     date_time, date_time_tz)
            VALUES ('2018-02-28', '14:10:00', 'ET', 2, 2, 2, 2, current_timestamp, 'ET');
            
COMMIT;