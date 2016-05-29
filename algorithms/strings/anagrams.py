# harshil912@gmail.com
# hackerrank anagram

tests = int(raw_input().strip())

for i in range(tests):
    a = list(raw_input().strip())
    if (len(a) % 2) != 0:
        print "-1"
        continue
    
    # a.sort()
    b = a[:len(a)/2]
    c = a[len(a)/2:]
    
    b.sort()
    c.sort()
    
    to_change = 0
    
    for j in range(len(b)):
        if b[j] != c[j]:
            to_change += 1
    
    print to_change 