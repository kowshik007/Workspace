create database knowuros_development;
create user knowuros_devuser identified by 'knowuros';
grant all privileges on knowuros_development.* to knowuros_devuser;
show databases;
use knowuros_development;