create table employee (
    id INT NOT NULL UNIQUE
    name  varchar(20) null,
    address varchar(20) null,
    gender varchar(20) null,
    contact  varchar(20) null,
    departentid  INT FOREIGN KEY REFERENCES department(id)
);


create table department(
    id INT NOT NULL UNIQUE
    departmentname varchar(20) null,
);

create table address (
    id INT NOT NULL UNIQUE
    street1 varchar(20) null,
    street2 varchar(20) null,
    city varchar(20) null,
    state varchar(20) null,
);