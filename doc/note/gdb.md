### 编译，并把调试信息加入到a中
	$ cc -g a.c -o a

### 查看源码
	list

### 在`main`函数处设置断点
	b main

### 运行程序
	r

### 下一步
	n

### 继续执行
	c

### 查看函数呼叫栈
	bt

### 查看以l开头的命令
	l
	<Tab>
	<Tab>

### 查看表达式的值
	print <表达式>

### 查看变量i的内存地址
	x &i
	x/4xb &i

### 设置变量i的值
	set var i = 0x01

### 打印变量、函数名的类型
	ptype i
	ptype &i
	ptype main

### 查看i是啥
	whatis i
