def sor(a):
    for i in range(0, len(a)):
        curent = a[i]
        j = i - 1
        while j > 0:
            print i, j, a[j], a[j - 1], ' : ', a
            if a[j] < a[j - 1]:
                tmp = a[j]
                a[j] = a[j - 1]
                a[j - 1] = tmp
            j = j - 1


a = [ 9, 2, 1, 6, 3]

print a
sor(a)
print a