def creatgraph( e,v):
    G=[]
    for i in range(v):
        row=[]
        for j in range(v):
            row.append(0)
        G.append(row)


    for i in range(e):
        src=int(input("source:"))
        des=int(input("destination:"))
        w=int(input("weight"))
        G[src-1][des-1]=w
        G[des-1][src-1]=w
    print(G)
    return(G)




def findmcst(G,v):
    d=[]
    p=[]
    visited=[]
    for i in range(v):
        d.append(32767)
        p.append(0)
        visited.append(0)


    current=1
    d[current-1]=0
    visited[current-1]=1
    c=1

    while(c!=v):
        for i in range(0,v):
            if(G[current-1][i]!=0 and visited[i]!=1):
                if(G[current-1][i] < d[i]):
                    d[i] = G[current-1][i]
                    p[i] = current-1


        min1=32767
        for i in range(1,v):
            if(visited[i]!=1):
                if(d[i]<min1):
                    min1=d[i]

                    current=i+1

        visited[current-1]=1
        c+=1

    cost=0
    for i in d:
        cost+=i

    print(cost)
    print(d)
g=creatgraph(9,5)
findmcst(g,5)