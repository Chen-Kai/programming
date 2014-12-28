*基于SQLite*

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
```sql
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
