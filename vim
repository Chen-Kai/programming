# replace old str with new str
:%s/[old]/[new]/gc 

# insert timestamp
:r !date
