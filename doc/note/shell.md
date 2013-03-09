##### Change all mode of files in some dir
> chmod 755 DesignPattern/

##### find the files modified in 24 hours
> find . -name *.* -mtime -1

find . -type f -daystart -mtime -2 >> tmp

##### Find the contains 'git', and modified in last 24 hours.
> find . -name *git* -mtime -1

##### Show the file type of some file
> file [file-name-here]

##### Compare differences between file-a and file-b
> diff [file-a] [file-b]

> vimdiff

> gvimdiff

##### Show the data on some col
> cut -d[divider-here] -f[col-index-here]

##### Check spell correction
> aspell check [file-name-here]

##### Delete some characters in some file
tr -d [characters-to-be-deleted] < [file-name-here] > [file-name-here]

##### Translate lower characters to captals
> tr 'a-z' 'A-Z' < [file-name-here]

##### Replace some old characters to a new one in some file
> sed 's/[old]/[new]/g' [file-name-here]

##### print cpu info
> lscpu

##### print user id
> id

##### add a user
> useradd

##### change passwd for a user
passwd <user-name>

##### disable touch pad
> sudo rmmod psmouse

##### enable touch pad
> sudo modprobe psmouse

##### list the file names
grep -l <key-string> <file-name>

##### grep 2 key strings at one time
grep 'key1\|key2' <file-name>

##### find files by size [k, M, B]
> find . -size +2k -name "*.java"

##### find files newer than some file
find . -newer <file-name>

##### find all directories 
> find . -type d

##### fine all files (not dir)
> find . -type f

##### issue other command on the resulte of find command
##### 1. start with by using `-exec`
##### 2. refer to the result by using `{}`
##### 3. close the exec statement by using `\;`
> find . -exec ls -l {} \;

##### grep the lines start with a number (0-9)
> grep '^[0-9]' *

##### grep the lines start with two numbers
> grep '^[0-9]\{2\}' *

##### get the return value of last command
> !$

##### run last command as admin
> $ sudo !!

##### show the arguments of last command or the command itself
$ <Alt> + .

##### replace char in last command
> E.g.

> $ echo 'hallo'

$ ^a^e            # equals to echo 'hello'

##### get date from millisecond
$ date -d@<long number here>

##### run some command at midnight
> $ echo `date` | at midnight

##### show ASCII table
> $ man ascii

##### view cpu info
> $ cat /proc/cpuinfo

##### get total size of a dir
    $ du -sh <dir name>

##### generate a patch
    $ diff <file_old> <file_new> > <patch-file>

##### merge a patch
    $ patch <file_old> < <patch-file>

##### write the lines contain "key" from file_source into file_target
    $ sed -n '/key/w file_target' file_source

##### append the content of file_source to the line(s) contain(s) 'key' in file_target
    $ sed '/key/r file_target' file_source 

##### replace 'old' with 'new' in *.java files.
    $ sed -i 's/<old>/<new>/g' `find . -name '*.java'`
    
##### delete all lines contain "jsapi"
    sed -i "/jsapi/d" `find . -name '*.html'`

##### rm all empty directories
    find -type d -empty -delete
