###### replace old str with new str
    :%s/<old>/<new>/gc 

###### insert timestamp  
    :r !date

###### del comments
    Ctrl + v > j > d

###### upper to lower
    Ctrl + v > [j, k, h, l] > u

###### execute shell command
    :! <shell command here>

###### highlight key word during searching
    :set hlsearch
    
###### find matches number
    :%s/<key-string-here>//gn

###### lower2upper or upper2lower
    ~

###### change a word to lowercase (uppercase)
    1. v  
    2. e
    3. u (U)
