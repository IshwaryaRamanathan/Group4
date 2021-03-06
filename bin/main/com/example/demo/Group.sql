create table subjects(subjectid int, subjectname varchar(30));
insert into subjects values(1,'English');
select * from subjects;

create table students(studentid int, studentname varchar(30), username varchar(30), password varchar(30));
insert into students values(101,'Akshay','akshay101','aksh');
insert into students values(102,'Pavithra','pavithra102','pavi');
select * from students;

create table staffs(staffid int, staffname varchar(30), department varchar(30), username varchar(30), password varchar(30));
insert into staffs values(201,'Vijay','Admin','vijay201','vijay007');
insert into staffs values(202,'Anitha','Faculty','anitha202','ani659');
select * from staffs;

create table questions(questionnumber int, subjectid int, question varchar(255));
insert into questions values(1,1,'What is your name?');
insert into questions values(2,1,'What is your favorite colour?');
insert into questions values(3,1,'What is your hobby?');
select * from questions;

create table answersheets(studentid int, subjectid int, questionnumber int, response varchar(255));
insert into answersheets values(101,1,1,'Akshay');
insert into answersheets values(101,1,2,'White');
insert into answersheets values(101,1,3,'Black');
select * from answersheets;

create table answerkeys(subjectid int, questionnumber int, answer varchar(255));
insert into answerkeys values(1,1,'Akshay');
insert into answerkeys values(1,2,'White');
insert into answerkeys values(1,3,'Listening Songs');
select * from answerkeys;

create table results(studentid int,subjectid int,result int);
insert into results values(101,1,0);
select * from results;
delete from results where studentid=101;

drop table answerkeys,answersheets;