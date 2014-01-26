#!/usr/bin/python
for i in range(3):
	print 'for ' + str(i) 
else:
	print 'for]'

i = 0
while i < 3:
	print 'while ' + str(i)
	i = i + 1
else:
	print 'while]'

aList = [0, 1, 2]

# list's length
print len(aList)

# list's type
print type(aList)

print 2 in aList

print 9 in aList

aList.pop(1)

# var's memory address
print id(aList)

del aList
