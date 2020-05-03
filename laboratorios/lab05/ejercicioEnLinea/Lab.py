import numpy as np

# Code from https://www.geeksforgeeks.org/bipartite-graph/ given in Lab guide
def __init__(self, V):
    self.V = V
    self.graph = [[0 for column in range(V)] \
                  for row in range(V)]

def isBipartite(self, src):


    colorArr = [-1] * self.V


    colorArr[src] = 1


    queue = []
    queue.append(src)


    while queue:
        u = queue.pop()


        if self.graph[u][u] == 1:
            return False;

        for v in range(self.V):


            if self.graph[u][v] == 1 and colorArr[v] == -1:


                colorArr[v] = 1 - colorArr[u]
                queue.append(v)


            elif self.graph[u][v] == 1 and colorArr[v] == colorArr[u]:
                return False


    return True
def function():
    info = ["3", "3", "0 1", "1 2", "2 0", "3", "2", "0 1", "2 1", "9", "8", "0 1", "0 2", "0 3", "0 4", "0 5", "0 6",
            "0 7", "0 8"]  # Datos con instrucciones
    listaInstrucciones = []  # Lista con diferentes paquetes de instrucciones

    n = len(info)
    listita = []
    listita.append(info[0])
    listita.append(info[1])

    for i in range(2, n):
        if len(info[i]) == 1 and len(info[i + 1]) == 1:
            listaInstrucciones.append(listita)
            listita = []
            listita.append(info[i])

        else:
            listita.append(info[i])
    listaInstrucciones.append(listita)

    m = len(listaInstrucciones)

    for j in range(0, m):
        if isBipartite() == True:
            print("BICOLORABLE")
        else:
            print("NOT BICOLORABLE")




