##### replace old str with new str
    :%s/<old>/<new>/gc 

##### 插入时间戳
    :r !date

##### del comments
    Ctrl + v > j > d

##### 大小写转换
    Ctrl + v > [j, k, h, l] > u

##### execute shell command
    :! <shell command here>
    
##### execute shell command
    :shell
    $ <shell command here>
    $ exit

##### highlight key word during searching
    :set hlsearch
    
##### find matches number
    :%s/<key-string-here>//gn

##### lower2upper or upper2lower
    ~

##### change a word to lowercase (uppercase)
    1. v  
    2. e
    3. u (U)
    
##### go to match "()" or "[]" or "{}"
    %

##### go to defined place
    gd
   
##### 跳转到下一个该字符串出现的地方
    * (#)

##### 格式化所有行
    1. gg
    2. v
    3. G
    4. =


##### 删除所有行
    1. gg
    2. v
    3. G
    4. :d

##### 重复执行上一命令
    .

##### 交换相邻的两个字符
    xp

##### 交换相邻的两行
    ddp
    
##### insert a header for some lines
    1. Ctrl + v
    2. [hjkl]
    3. I
    4. edit
    5. Esc
    6. Esc

##### 打开拼写检查
    :set spell

##### 查看spell命令的帮助文档
    :help spell

##### replace all 'key' with 'keyword'
    :%s/key/&word/g

##### delete from current character to matching character
    d%

##### set encoding
    :set encoding=utf-8

##### replace all "..", "...", "....", ".....", "......" with "..."
    :%s[.]\{2,6}/.../g

##### match non Chinese
    /[\x00-\xfff]

##### replace multiple spaces with one space
    :%s/[ ]\+/ /g

##### show character under cursor as ascii
    ga

##### show character under cursor as utf8, including Unicode stuff, hex codes etc
    g8

##### replace unicode 160 with unicode 32 (space)
    :%s/[\xa0-\xa0]/ /g

##### format corrent line
    ==

##### format the whole file
    gg=G

##### add a indent
    >>

##### delete a indent
    <<

##### indent automatically
    :set smartindent

##### 显示空白字符，tab, $等
    :set list

##### 隐藏空白字符
    :set list!

##### Backward cursor position
    ``

##### Add bookmark
    :ma <bookmark-name>

##### Goto some bookmark 
    '<bookmark-name>

##### 删除所有行首的数字
e.g.
1. 
12. 
	:%s/^\d\+\.\s\?//g 

##### 从当前行开始,在中文字符前面加--
	:,$s/[ ]\?[^\x00-\xff]\+/--&/gc

##### 从某一行开始替换
	:n,$s/<old>/<new>/gc

##### 删除所有空行
    :g/^$/d
    
##### 删除所有空行（包含那些只有空格、Tab符的行）
    :g/^\s*$/d
,$s/[\x00-\xff]\+\s\+/&@/gc

##### 跳转到函数头{
	[[

##### 跳转到函数尾}
	]]
