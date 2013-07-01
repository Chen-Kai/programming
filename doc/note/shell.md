##### 更改某个目录下所有文件的属性（读写模式）
	$ chmod 755 -R <dir-name>

##### 找到1天（24小时）内被修改过的文件
	$ find . -type f -mtime -1

##### 查看某个文件的文件类型
	$ file <file-name>

##### 比较两个文件
	$ diff --side-by-side <file-a> <file-b>
	$ vimdiff <file-a> <file-b>
	$ gvimdiff <file-a> <file-b>

##### Show the data on some col
	$ cut -d[divider-here] -f[col-index-here]

##### Check spell correction
	$ aspell check [file-name-here]

##### Delete some characters in some file
tr -d [characters-to-be-deleted] < [file-name-here] 	$ [file-name-here]

##### 将某个文件中的所有小写字母变成大写字母
	$ tr 'a-z' 'A-Z' < <file-name-here>

##### Replace some old characters to a new one in some file
	$ sed 's/[old]/[new]/g' <file-name-here>

##### 显示CPU信息
	$ lscpu

##### 显示用户id信息
	$ id

##### 添加一个用户
	$ useradd

##### 修改某个用户的密码
	$ passwd <user-name>

##### 禁用触摸板
	$ sudo rmmod psmouse

##### 启动触摸板
	$ sudo modprobe psmouse

##### 查找包含key1或key2的行
	grep 'key1\|key2' <file-name>

##### find files by size [k, M, B]
	$ find . -size +2k -name "*.java"

##### 找到比某个文件更新的文件
	$ find . -newer <file-name>

##### 找到所有的文件夹
	$ find . -type d

##### 找到所有的文件（非文件夹）
	$ find . -type f

##### issue other command on the resulte of find command
##### 1. start with by using `-exec`
##### 2. refer to the result by using `{}`
##### 3. close the exec statement by using `\;`
	$ find . -exec ls -l {} \;

##### 找到不是以数字开头的行
	$ grep '^[0-9]' *

##### grep the lines start with two numbers
	$ grep '^[0-9]\{2\}' *

##### 显示上条命令的返回值
	$ !$

##### run last command as admin
	$ $ sudo !!

##### show the arguments of last command or the command itself
	$ <Alt	$ + .

##### replace char in last command
	$ echo 'hallo'
	$ ^a^e            # equals to echo 'hello'

##### get date from millisecond
	$ date -d@<long number here>

##### run some command at midnight
	$ $ echo `date` | at midnight

##### show ASCII table
	$ man ascii

##### view cpu info
	$ cat /proc/cpuinfo

##### get total size of a dir
	$ du -sh <dir name>

##### generate a patch
	$ diff <file_old	$ <file_new	$ 	$ <patch-file>

##### merge a patch
	$ patch <file_old	$ < <patch-file>

##### write the lines contain "key" from file_source into file_target
	$ sed -n '/key/w file_target' file_source

##### append the content of file_source to the line(s) contain(s) 'key' in file_target
	$ sed '/key/r file_target' file_source 

##### replace 'old' with 'new' in *.java files.
	$ sed -i 's/<old>/<new>/g' `find . -name '*.java'`
    
##### 删除包含"jsapi"的行
	$ sed -i "/jsapi/d" `find . -name '*.html'`

##### rm all empty directories
	$ find -type d -empty -delete
    
##### replace all "\" with "/"
	$ echo 'F:\dev\android\sdk\platforms\android-8' | sed 's/\\/\//g'
	F:/dev/android/sdk/platforms/android-8

##### execute two commands at the same time
	$ mkdir <name> && cd <name>
	e.g. mkdir dir && cd dir

##### change all the files mode in some dir recursively
	$ chmod -R 755

##### 删除所有空行
	$ sed '/^$/d'

##### grep 不包含@的行
	$ grep -v -n "@" <file>

##### grep所有不包含Tab字符（'\t'）的行
	$ grep -vn $'\t' a.txt

##### 找到所有不以.md结尾的文件并删除之
	$ find . ! -name '*.md' -type f

##### 查看进程树
	$ pstree

##### 查看硬盘使用情况
	$ df -h

##### 查看某个文件夹占用地盘空间大小
	$ du -sh

##### 查看某个文件夹及其所有子文件夹占用磁盘空间大小
	$ du -h

##### 列出莫个文件中不重复的行
	$ uniq users

##### 以mb为单位查看内存使用情况
	$ free -m

##### 将所有文件名中的空格替换为下划线
	$ find . -type f | rename 's/ /_/g'

##### 整词匹配"look", look匹配，looking不匹配
	$ grep -r -w 'look' shell.md

##### zip某个文件夹
	$ zip -r a.zip a/

##### unzip某个压缩包
	$ unzip -d a/ a.zip # or 
	$ unzip a.zip

##### 查看日历
	$ cal

##### 使用`diff`命令比较连个文件
    $ diff --side-by-side <txt-file-a> <txt-file-b>

##### 查找到某些文件并移动到某一路径
	$ find . -type f -exec mv -t .backup/ {} \+

##### 产出所有空文件夹
	$ find . -type d -empty -delete
