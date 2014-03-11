##### 设置环境变量
    $ vi ~/.bashrc
    $ export PATH=/home/null/dev/android/sdk/platform-tools:$PATH
    $ export PATH=/usr/lib/jvm/jdk1.6.0_32/bin:$PATH

##### 在Ubuntu 12.04上安装Gnome
    $ sudo apt-get install gnome-panel
    
##### 好用的软件
* Kazam Screencastear（录屏）
* astah（绘制UML图）

##### Solutions
> The package system is broken.
Check if you are using third party repositories. If so disable them, since they are a common source of problems.
Furthermore run the following command in a Terminal: apt-get install -f

    $ sudo apt-get install -f

> Requires installation of untrusted packages.
The action would require the installation of packages from not authenticated sources.

    $ sudo apt-get update
    $ sudo apt-get upgrade
    
##### install ia32-libs on 64-bit Ubuntu OS (12.04)
    $ sudo apt-get install ia32-libs

##### how to install *.deb file
    $ sudo dpkg -i *.deb

##### install Java 7 on Ubuntu 12.04
    $ sudo add-apt-repository ppa:webupd8team/java
    $ sudo apt-get update
    $ sudo apt-get install oracle-java7-installer

##### 查看Ubuntu版本
	$ lsb_release -a
