创建表  
`create table stu(id integer primary key, name text, age integer);`

舍弃表  
  drop table stu

插入数值  
`insert into stu(name, age) values("Mary", 23);`

查询所有age非空的record  
`select * from stu where age not null;`

获得所有记录总数  
`select count(*) from stu;`


