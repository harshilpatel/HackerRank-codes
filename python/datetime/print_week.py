#/usr/bin/python3

import datetime
a = input()
# print a
d = datetime.datetime.strptime(a, "%m %d %Y")
print(datetime.datetime.strftime(d, "%A").upper())
