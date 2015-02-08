###### 设置环境变量
    $ vi ~/.bashrc
    $ export PATH=/home/null/dev/android/sdk/platform-tools:$PATH
    $ export PATH=/usr/lib/jvm/jdk1.6.0_32/bin:$PATH

###### 在Ubuntu 12.04上安装Gnome
    $ sudo apt-get install gnome-panel
    
###### 好用的软件
* Kazam Screencastear（录屏）
* astah（绘制UML图）

###### Solutions
> The package system is broken.
Check if you are using third party repositories. If so disable them, since they are a common source of problems.
Furthermore run the following command in a Terminal: apt-get install -f

    $ sudo apt-get install -f

> Requires installation of untrusted packages.
The action would require the installation of packages from not authenticated sources.

    $ sudo apt-get update
    $ sudo apt-get upgrade
    
###### install ia32-libs on 64-bit Ubuntu OS (12.04)
    $ sudo apt-get install ia32-libs

###### how to install *.deb file
    $ sudo dpkg -i *.deb

###### install Java 7 on Ubuntu 12.04
    $ sudo add-apt-repository ppa:webupd8team/java
    $ sudo apt-get update
    $ sudo apt-get install oracle-java7-installer

###### 查看Ubuntu版本
	$ lsb_release -a

###### 下载文件
	$ wget -c https://github.com/cstrap/monaco-font/raw/master/Monaco_Linux.ttf

###### 解决“Could not get lock /var/lib/dpkg/lock-open”错误提示
	$ sudo rm /var/cache/apt/archives/lock 
	$ sudo rm /var/lib/dpkg/lock

###### 安装yum
	$ sudo apt-get install yum

###### 安装optipng（压缩PNG文件）
	$ sudo apt-get install optipng

###### 压缩图片
	$ optipng pic.png

###### 查看不同
	$ vimdiff 文件名 文件名
	$ gvimdiff 文件名 文件名
	$ diff --side-by-side 文件名 文件名

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

###### 找到所有的文件夹
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

###### 查找以start开头的字符串
	$ grep '\<start' 文件名

###### 查找以end结尾的字符串
	$ grep 'end\>' 文件名

###### 隐藏路径
	$ export PS1="~$ "

###### 查看图片文件
	$ eog 文件名

###### 设置时间显示格式
	$ date "+%Y-%m-%d %H:%M:%S"

###### 查看系统启动时间
	$ uptime

###### 翻页查看翻页
	$ more
	$ less 

###### 查看文件头
	$ head -n行数 文件名

###### 查看文件尾
	$ tail -n行数 文件名

###### 查看所有PCI设备
	$ lspci -v

###### 查看所有USB设备
	$ lsusb -v

###### 查看所有加载的驱动
	$ lsmod

###### 立即关机
	$ shutdown -h now
	$ poweroff

###### 立即重启
	$ shutdown -r now
	$ reboot

###### 5分钟后关机
	$ shutdown -h +5

###### 23点关机
	$ shutdown -h 23:00

###### 查看文件类型
	$ file 文件名

###### 查找当前目录下所有读写模式为775的文件
	$ find . -perm 775

###### 窗口尺寸++
	$ `Ctrl` + `Shift` + `+`

###### 窗口尺寸--
	$ `Ctrl` + `-`

###### 把文件复制到另一个服务器(复制文件夹加 -r 参数)
	$ scp file user@ip:file

###### 下载文件
	$ wget https://www.apache.org/dist/tomcat/tomcat-6/v6.0.43/bin/apache-tomcat-6.0.43-windows-x86.zip

###### 查看网络连接信息 
	$ netstat

###### 修改更新源 
	$ sudo /etc/apt/sources.list
	$ sudo apt-get clean
	$ sudo apt-get update --fix-missing
	$ sudo apt-get upgrade
Aliyun 源头
```
deb http://mirrors.aliyun.com/ubuntu/ precise main restricted universe multiverse
deb http://mirrors.aliyun.com/ubuntu/ precise-security main restricted universe multiverse
deb http://mirrors.aliyun.com/ubuntu/ precise-updates main restricted universe multiverse
deb http://mirrors.aliyun.com/ubuntu/ precise-proposed main restricted universe multiverse
deb http://mirrors.aliyun.com/ubuntu/ precise-backports main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ precise main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ precise-security main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ precise-updates main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ precise-proposed main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ precise-backports main restricted universe multiverse
```
# 删除所有的
 (`C#####trl` +`c  `m`)
	$ sed 's/^M//g' `find . -name '*.java'` -i

###### 查看MD5校验值(较老)
	$ md5sum a.c

###### 查看SHA校验值(安全性高)
	$ sha1sum du.sh

###### backup big file
	$ dd if=du.sh of=du.sh.bak

###### check free memeory
	$ free -m

###### 
	$ watch -n 1 cat /proc/meminfo
	$ watch -n 1 free -m
###### 
	$ sudo sysctl -w vm.drop_caches=3

###### install open jdk 7 and vim
	$ sudo apt-get install openjdk-7-jdk
	$ sudo apt-get install vim
