*基于SQLite*



SQLite 
ACID - 在写入和更新数据库的过程中，保证事务是可靠的。
原子性（atomicity）：要么全部完成，要么什么都不做。
一致性（consistency）：插入的数据符合预设规则，保持数据库的一致性。
隔离性（isolation）：多事务并发访问
持久性（durability）：事务对数据库的修改持久保存在数据库中。

SQLite被集成在用户程序中。

处理主键以外，SQLite不强制进行类型检查。
SQLite不进行类型检查，你可以把字符串插入到整数列中。

支持并发，同一时间只有一个线程进行资料写入。

http://www.ch-werner.de/javasqlite/

DDL
Craete 
Alert
Drop

DML
insert
update

DQL
select

select *
from students
where name == "Sun" and stud

select *
from students
where name == "Sun" or name == "zhang"

alter table students add column age int

alter table students rename to tbl;

select *
from tbl
where stuId between 1 and 2

commit

select sum(age)
from tbl

select sum(age)
from tbl
group by name

drop table table-name

select * 
from company
where salary > 10000;

select * 
from company
where salary = 20000;

select * 
from company
where salary != 20000;

select * 
from company
where salary <> 20000;

select * 
from company
where salary >= 20000;



and
between
exists
in
not in
like
glob
not
is null
is
is not
||
unique

select * 
from company
where age < 30 and salary > 2000
order by salary desc

select * 
from company
where name like "M%"

select * 
from company
where age in (23, 25);

select * 
from company
where age between 20 and 30

select 1 + 1 as col

select count (*)
as "total"
from company 

select CURRENT_TIMESTAMP

select * 
from company
where address is not null

update company 
set address = "Rich Mond"
where name = "Mark"

delete from company
where address is null


delete from company; // del all

select * 
from company
where name like "___" // 3 characters

select * 
from company
where salary glob "200*"

select * 
from company
where salary glob "??.??"

select * 
from company
order by salary desc
limit 3; // 1st - 3rd

select * 
from company
order by salary desc
limit 3 offset 1; // 2nd - 4th

select * 
from company
order by name

select name, sum(salary)
from company
group by name

select name, sum(salary)
from company
group by name
having count(name) = 2; // 重名

select distinct age
from company



data type:
	- null		// 空值
	- integer	// 整数
	- real 		// 8字节浮点数
	- text 		// 文本
	- blob 		// 二进制

create table company (
id     int primary key not null,
name   text            not null,
age    int             not null,
address char(50),
salary  real
);

---
学生表（students）：  
name  | stuId | classId
:-----| :-----| ------:
Yang  | 90200 | 201
John  | 90201 | 201
Mary  | 90202 | 202
Mike  | 90203 | 203

课程表（classes）：
id   | teachName
:--- | :-----
201  | Mr. Wang
202  | Mr. Zhang
203  | Ms. Yang

---

创建表  

``` sql
create table students (name text, stuId int, classId int);
create table classes (id int primary key unique not null, teachName text);
```

舍弃表  

```sql
drop table students
```

添加列

```sql
alter table classes add column name text;
```

插入记录 

```sql
insert into students values ('Yang', 90200, 201);
```

更新数据

```sql
update classes set name='English' where id=203;
```

查询所有name非空的记录

```sql
select * from classes where name is not null;
```

获得所有记录总数  

```sql
select count(*) from students;
```

列出学号最大的记录

```sql
select * from students order by stuId desc limit 0, 3
```

从两个表中查询数据

```sql
select stu.name, clas.name
from students as stu, classes as clas
where stu.classId = clas.id
```

Constraints：

create table t (
	name text not null unique,
	age int check (age > 0)
);

select *
from company cross join department

select *
from company inner join department 
on company.id = department.emp_id

