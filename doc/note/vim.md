##### replace old str with new str
    :%s/<old>/<new>/gc 

##### insert timestamp  
    :r !date

##### del comments
    Ctrl + v > j > d

##### upper to lower
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
    
##### to to next (pre) one
    * (#)

##### indent all lines
    1. gg
    2. v
    3. G
    4. =


##### delete all lines
    1. gg
    2. v
    3. G
    4. :d

##### repeat last command
    .

##### switch positions of the words next to each other
    xp

##### switch positions of the lines next to each other
    ddp
    
##### insert a header for some lines
    1. Ctrl + v
    2. [hjkl]
    3. I
    4. edit
    5. Esc
    6. Esc

##### check spell
    :set spell

##### read the help doc of `spell` command
    :help spell

##### replace all 'key' with 'keyword'
    :%s/key/&word/g

##### delete from current character to matching character
    d%
