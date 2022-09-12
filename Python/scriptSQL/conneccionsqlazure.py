
from ast import List
import pyodbc 
# Some other example server values are
# server = 'localhost\sqlexpress' # for a named instance
# server = 'myserver,port' # to specify an alternate port

server = 'tcp:miservidors.database.windows.net,1433' 
database = 'miBaseDeDatosDeEjemplo' 
username = 'db' 
password = '' 
# Specifying the ODBC driver, server name, database, etc. directly


## Obtener la información de conexión

def conectaAK47(server,database,username,password):
    with pyodbc.connect('DRIVER={ODBC Driver 18 for SQL Server};SERVER='+server+';DATABASE='+database+';UID='+username+';PWD='+ password) as conn:
        with conn.cursor() as cursor:
        ## hacemos la primer consulta
            cursor.execute('''SELECT TOP 20 pc.Name as CategoryName, p.name as ProductName
                            FROM SalesLT.ProductCategory pc
                            JOIN SalesLT.Product p
                            ON pc.productcategoryid = p.productcategoryid;''')
        
            row = cursor.fetchone()
            while row:
                print('name:', row[1])   # access by column index (zero-based)

                print (str(row[0]) + " " + str(row[1]))
                
                if not row:
                    break
            else:
                print(row)
                print(f"podemos acceder a los nombre: {row[0]}")
                
def conecta(server,database,username,password):
    conentado = pyodbc.connect('DRIVER={ODBC Driver 18 for SQL Server};SERVER='+server+';DATABASE='+database+';UID='+username+';PWD='+ password)              
    # Create a cursor from the connection
    cursor = conentado.cursor()
    return cursor
  
    
    
def consultaSQL(consulta):
    cursor = conecta(server,database,username,password)
    on=cursor.execute(consulta)
    
    #print(help(on))

        
consulta='''SELECT TOP 20 pc.Name as CategoryName, p.name as ProductName
                            FROM SalesLT.ProductCategory pc
                            JOIN SalesLT.Product p
                            ON pc.productcategoryid = p.productcategoryid;'''
consultaSQL(consulta)