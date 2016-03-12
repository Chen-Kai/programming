- 类
	- `File` - 代表系统中的一个文件（或者目录）
	- 列出当前目录下的所有文件
	``` java
		File file = new File(".");
		System.out.println(file);
		File[] subFiles = file.listFiles();
		if (subFiles != null) {
		    for (File f : subFiles) {
			System.out.println(f);
		    }
		}
	```  
	-  


