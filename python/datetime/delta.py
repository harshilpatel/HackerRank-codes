#/usr/bin/python

import datetime
import pytz
import math
count = int(input())
for i in range(count):
    # a = input()
    # print a
    d1 = datetime.datetime.strptime(input(), "%a %d %b %Y %H:%M:%S %z").astimezone(pytz.utc)
    d2 = datetime.datetime.strptime(input(), "%a %d %b %Y %H:%M:%S %z").astimezone(pytz.utc)
    d = d1-d2
    print(d.seconds)
