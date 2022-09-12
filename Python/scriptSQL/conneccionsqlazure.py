
import pyodbc 
# Some other example server values are
# server = 'localhost\sqlexpress' # for a named instance
# server = 'myserver,port' # to specify an alternate port
server = 'tcp:miservidors.database.windows.net,1433' 
database = 'miBaseDeDatosDeEjemplo' 
username = 'db' 
password = 'supremacontraseñaparabobosquehackeancuentas' 
# Specifying the ODBC driver, server name, database, etc. directly


## Obtener la información de conexión
with pyodbc.connect('DRIVER={ODBC Driver 18 for SQL Server};SERVER='+server+';DATABASE='+database+';UID='+username+';PWD='+ password) as conn:
    with conn.cursor() as cursor:
        ## hacemos la primer consulta
        cursor.execute('''SELECT TOP 20 pc.Name as CategoryName, p.name as ProductName
                            FROM SalesLT.ProductCategory pc
                            JOIN SalesLT.Product p
                            ON pc.productcategoryid = p.productcategoryid;''')
        
        row = cursor.fetchone()
        while row:
            print (str(row[0]) + " " + str(row[1]))
            row = cursor.fetchone()
            
