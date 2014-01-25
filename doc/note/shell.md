###### 更改某个目录下所有文件的属性（读写模式）
	$ chummed 755 -R 路径名

###### 找到1天（24小时）内被修改过的文件
	$ find . -type f -mtime -1

###### 查看某个文件的文件类型
	$ file 文件名

###### 比较两个文件之间的不同
	$ diff --side-by-side 文件名 文件名
	$ vimdiff 文件名 文件名
	$ gvimdiff 文件名 文件名

###### Show the data on some col
	$ cut -d<divider-here> -f<col-index-here>

###### 对某文件进行拼写检查
	$ aspell check 文件名

###### 删除某文件中的某个字符
	$ tr -d 要删除的字符 文件名

###### 将某个文件中的空白字符都替换成'\t'
	$ tr [:space:] '\t' 文件名

###### 将某个文件中的所有小写字母变成大写字母
	$ tr 'a-z' 'A-Z' < 文件名

###### 替换某文件中的某个字符串
	$ sed 's/旧字符串/新字符串/g' 文件名

###### 显示CPU信息
	$ lscpu

###### 显示用户id信息
	$ id

###### 添加一个用户
	$ useradd

###### 修改某个用户的密码
	$ passwd 用户名

###### 禁用触摸板
	$ sudo rmmod psmouse

###### 启动触摸板
	$ sudo modprobe psmouse

###### 查找包含key1或key2的行
	grep '关键字\|另一个关键字' 文件名

###### 查找所有大于2k的Java文件 [k, M, B]
	$ find . -size +2k -name '*.java'

###### 找到比某个文件更新的文件
	$ find . -newer 文件名

###### 找到所有的文件夹（非普通文件）
	$ find . -type d

###### 找到所有的文件（非文件夹）
	$ find . -type f

###### issue other command on the resulte of find command
###### 1. start with by using `-exec`
###### 2. refer to the result by using `{}`
###### 3. close the exec statement by using `\;`
	$ find . -exec ls -l {} \;

###### 找到不是以数字开头的行
	$ grep '^[0-9]' *

###### grep the lines start with two numbers
	$ grep '^[0-9]\{2\}' *

###### 显示上条命令的返回值
	$ !$

###### 执行上条shell命令
	$ !!

###### 使用超级用户身份执行上条shell命令
	$ sudo !!

###### show the arguments of last command or the command itself
	$ <Alt	$ + .

###### 替换上条命令中的某个字符串
	$ echo 'hallo'
	$ ^老字符串^新字符串            # equals to echo 'hello'

###### 把当前毫秒转为日期
	$ date -d@当前毫秒

###### 在午夜执行echo命令
	$ echo `date` | at midnight

###### 显示 ASCII 表
	$ man ascii

###### 显示CPU信息
	$ cat /proc/cpuinfo

###### get total size of a dir
	$ du -sh 路径名

###### generate a patch
	$ diff <file_old	$ <file_new	$ 	$ <patch-file>

###### merge a patch
	$ patch <file_old	$ < <patch-file>

###### write the lines contain "key" from file_source into file_target
	$ sed -n '/key/w file_target' file_source

###### append the content of file_source to the line(s) contain(s) 'key' in file_target
	$ sed '/key/r file_target' file_source 

###### replace 'old' with 'new' in *.java files.
	$ sed -i 's/<old>/<new>/g' `find . -name '*.java'`
    
###### 删除包含"jsapi"的行
	$ sed -i "/jsapi/d" `find . -name '*.html'`

###### rm all empty directories
	$ find -type d -empty -delete
    
###### replace all "\" with "/"
	$ echo 'F:\dev\android\sdk\platforms\android-8' | sed 's/\\/\//g'
	F:/dev/android/sdk/platforms/android-8

###### execute two commands at the same time
	$ mkdir <name> && cd <name>
	e.g. mkdir dir && cd dir

###### change all the files mode in some dir recursively
	$ chmod -R 755

###### 删除所有空行
	$ sed '/^$/d'

###### grep 不包含@的行
	$ grep -v -n "@" <file>

###### grep所有不包含Tab字符（'\t'）的行
	$ grep -vn $'\t' a.txt

###### 找到所有不以.md结尾的文件并删除之
	$ find . ! -name '*.md' -type f

###### 查看进程树
	$ pstree

###### 查看硬盘使用情况
	$ df -h

###### 查看某个文件夹占用地盘空间大小
	$ du -sh

###### 查看某个文件夹及其所有子文件夹占用磁盘空间大小
	$ du -h

###### 列出莫个文件中不重复的行
	$ uniq users

###### 以mb为单位查看内存使用情况
	$ free -m

###### 将所有文件名中的空格替换为下划线
	$ find . -type f | rename 's/ /_/g'

###### 整词匹配"look", look匹配，looking不匹配
	$ grep -r -w 'look' shell.md

###### zip某个文件夹（a）
	$ zip -r a.zip a/

###### unzip某个压缩包
	$ unzip -d a/ a.zip # or 
	$ unzip a.zip

###### 查看日历
	$ cal

###### 使用`diff`命令比较连个文件
	$ diff --side-by-side <txt-文件名> <txt-文件名>

###### 查找到某些文件并移动到某一路径
	$ find . -type f -exec mv -t .backup/ {} \+

###### 产出所有空文件夹
	$ find . -type d -empty -delete

###### 查看上条命令的返回值
	$ echo $?

###### 查看a.out
	$ hexdump -C a.out

###### 阅读elf文件
	$ readelf -a a.out

###### 提取a.out的指令到text.bin中
	$ objcopy -O binary -j .text a.out text.bin

###### 提取a.out的数据到data.bin中
	$ objcopy -O binary -j .data a.out data.bin

###### 显示硬盘设备信息（list block devices）
	$ lsblk

###### 查看之前使用过的shell命令
	$ history

###### 在历史shell命令中查找并执行
	Ctrl + R

###### 在当前目录查找java或xml文件
	$ find . -name '*.java' -or -name '*.xml'
	
###### 在删除文件前进行问询
	$ rm -i 文件名
