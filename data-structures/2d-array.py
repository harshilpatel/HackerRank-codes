size = 6
a = []


for i in range(size):
    a.append([int(i) for i in raw_input().split()])

max = -100
for i in range(4):
    for j in range(4):
        temp = 0
        for k in range(i,i+3):
            for l in range(j,j+3):
                temp += a[k][l]
        temp -= (a[i+1][j] + a[i+1][j+2])
        if temp > max:
            max = temp
print max