create database advanced_java;
show databases;

use advanced_java;


create table Student(stud_id int, stud_name varchar(20), marks INT);

insert into Student values(001,"harish",65),(002,"ravi",75),(003,"manjunath",87);

select * from student;
DELIMITER //
 create procedure `advanced_java`.`getStudent`(id int)
begin
   select stud_id,stud_name,marks
   from student
   where stud_id=id;
end
// DELIMITER ;
call getStudent(1);

 