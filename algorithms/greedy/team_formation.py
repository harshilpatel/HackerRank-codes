# harshil912@gmail.com

test_cases = int(raw_input())


test_case_list = []
for i in range(test_cases):
    test_case_list.append( [int(i) for i in raw_input().strip().split(' ')] )

for i in test_case_list:
    i.sort()
    i.reverse()
    teams = []
    team = []
    team.append(i[0])
    
    for item in range(1, len(i)):
        if i[item] + 1 != i[item - 1]:
            teams.append(team)
            team = []
        else:
            team.append(i[item])
    if len(i) > 0:
        teams.append(i)

    if [] in teams:
        teams.remove([])
    for i in teams:
        i = list(set(i))
    print teams