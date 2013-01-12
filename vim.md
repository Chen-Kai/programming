# replace old str with new str
:%s/[old]/[new]/gc 

# insert timestamp
:r !date

# del comments
Ctrl + v > j > d

# upper to lower
Ctrl + v > [j, k, h, l] > u

# execute shell command
:! <shell command here>

# highlight key word during searching
:set hlsearch
