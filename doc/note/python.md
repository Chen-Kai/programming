###### 让py文件具有可执行
	#!/usr/bin/python
	print 'hi'

###### 编译hi.py，生成hi.pyc
	import py_compile
	py_compile.compile("hi.py")

###### 编译hi.py，生成hi.pyo
	python -O -m py_compile hi.py

###### 查看变量var在内存中的地址
	id(var)

###### 整除运算
	3 // 2 # 1

###### 乘方运算
	2 ** 3 # 8

###### 查看数据类型
	type('a')
	type(1)

###### 文档
	"""doc content"""
	
###### 原始格式字符串
	r"raw\tstring"

###### 字符串过滤
	"abc  ".strip() # abc

###### 字符串替换
	"abc".replace("a", "b") # bbc
	
###### 字符串格式化
	txt = "He is %d ages old in %d." % (52, 2013)

###### 创建文件夹
	os.mkdir("folder")
