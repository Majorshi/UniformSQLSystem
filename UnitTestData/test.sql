drop database testSQLtest;
create database testSQLtest;
use testSQLtest;
create table testSQLtest.student(id int,name varchar(30),age int,sex int,num varchar(15));
create table testSQLtest.course(
c_id int,
credit float,
course varchar(100),
c_introduction varchar(500),
week int,
sequence int 
);
create table testSQLtest.stu_course(
c_id int,
id int,
score float
);
create table testSQLtest.stu_class(
cla_id varchar(10),
id int
);
insert into student values(20150001,'小明',20,0,'18810402345');
insert into student values(20150002,'Tony',21,1,'18810403710');
insert into student values(20150003,'Adam',23,0,'18810409888');
insert into student values(20150010,'小华',22,1,'18810409432');
insert into student values(20150101,'小成',21,1,'18810456721');
insert into student values(20150302,'Tina',20,0,'07667899000');
insert into student values(20150367,'诺一',22,1,'01077223311');
insert into student values(20150450,'大俊',21,1,'18810409837');
insert into student values(20150786,'夏天',21,0,'18810407836');
insert into course values(2201,6.0,'高数','大学必修课程',1,3);
insert into course values(2202,3.0,'数据结构','大学软件专业必修',1,4);
insert into course values(2203,4.0,'算法','大学软件专业必修',2,3);
insert into course values(2204,3.5,'程序设计','学生提升能力的课程',2,1);
insert into course values(2205,2.0,'java','面向对象的语言',1,2);
insert into course values(2215,3.0,'C语言','理工科学生必修课程',3,3);
insert into stu_class values('0811102',20150001);
insert into stu_class values('0811102',20150002);
insert into stu_class values('0811102',20150003);
insert into stu_class values('0811101',20150010);
insert into stu_class values('0811101',20150101);
insert into stu_class values('0811101',20150302);
insert into stu_class values('0811101',20150367);
insert into stu_class values('0811103',20150450);
insert into stu_class values('0811103',20150786);
insert into stu_course values(2201,20150001,89);
insert into stu_course values(2201,20150002,80);
insert into stu_course values(2201,20150003,79);
insert into stu_course values(2201,20150010,81);
insert into stu_course values(2201,20150101,82);
insert into stu_course values(2201,20150302,85);
insert into stu_course values(2201,20150367,59);
insert into stu_course values(2201,20150450,56);
insert into stu_course values(2201,20150786,90);
insert into stu_course values(2202,20150001,81);
insert into stu_course values(2202,20150002,83);
insert into stu_course values(2202,20150003,74);
insert into stu_course values(2202,20150010,82);
insert into stu_course values(2202,20150101,81);
insert into stu_course values(2202,20150302,86);
insert into stu_course values(2202,20150367,52);
insert into stu_course values(2202,20150450,51);
insert into stu_course values(2202,20150786,92);