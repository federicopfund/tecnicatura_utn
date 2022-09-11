
# Diccionarios
ServiceAzure = {
    'Redes':
        {
            'AVN': 'Azure Virtual Network',
            'ALB': 'Azure Load Balancer',
            'AAG': 'Azure Application Gateway',
            'AVPNG':'Azure VPN Gateway',
            'ADNS':'Azure DNS',
            'ACDN': 'Azure Content Delivery Network',
            'ADDoSP':'Azure DDoS Protection',
            'ATM':'Azure Traffic Manager',
            'AER':'Azure ExpressRoute',
            'ANW':'Azure Network Watcher',
            'AF':'Azure Firewall',
            'AVWAN':'Azure Virtual WAN'
        },
    'Almacenamientos':
        {
            'ABS':'Azure Blob Storage',
            'AFS':'Azure File Storage',
            'AQS':'Azure Queue Storage',
            'ATS':'Azure Tabke Storage',
            
            
        },
    'BasesDeDatos':
        {
            'ACDB':'Azure Cosmo DB',
            'ASQLD':'Azure SQL Database',
            'ADFM':'Azure Database for MySQL',
            'ADFP':'Azure Databse for PostgreSQL',
            'SQLSAVM':'SQL Server Azure Virtual Machine',
            'ASA':'Azure Synapse Analytics',
            'ADMS':'Azure Database Migration Server',
            'ACFR':'Azure Cache for Redis',
            'ADFM':'Azure Database for MariaDB'
        },
    'Web':
        {
            'AAS':'Azure App Service',
            'ANH':'Azure Notification Hubs',
            'ACS':'Azure API Management',
            'ACS':'Azure Cognitive Search',
            'CWAA': 'Caracteristicas Web Apps de Azure',
            'SAS':'Servicio Azure SignalR'
        },
    'IoT':
        {
         'IoTC':'IoT Central',
         'AIOH':'Azure Iot Hub',
         'IoTE':'IoT Edge'
           
        },
    'Macrodatos':
        {
            'ASA':'Azure Synapse Analytics',
            'HDA':'HDInsight de Azure',
            'AD':'Azure Databricks'
        
        },
    'IA':
        {
            'AMLS':'Azure Machine Learning Service',
            'AMLS':'Azure ml Studio',
            
        },
    'DevOps':
        {
        'AD':'Azure DevOps',
        'ADL':'Azure DevTest Labs',
        'SDLC':'Ciclo de vida del desarrollo de software'
        }
     
}
print(ServiceAzure)
# Determinar la cantidad de elementos
print(len(ServiceAzure))
# Acceder a un elemento con la llave(key)
print(ServiceAzure['DevOps'])  # nos mostrará el valor referenciado a esa llave
# otra forma de recuperar un elemento
print(ServiceAzure.get('IA'))
# Modificar los elementos
ServiceAzure['DevOps']['SDLC'] = 'Ciclo de vida del desarrollo de  NEW software'
print(ServiceAzure['DevOps']['SDLC'] )
# Como recorrer los elementos
#%%
for key,service in ServiceAzure.items():
    print('Servicios {} : {}'.format(key,service))  # Esto nos permitirá acceder solo a las llaves
#%%
# Necesitamos una función para recorrer un diccionario
for key,service in ServiceAzure.items():
    print(key,service)
#%%
# Otras maneras de acceder a un diccionario
for serviceKey in ServiceAzure.keys():  # Usamos esta función para acceder a las llaves
    print(serviceKey)  # Muestra solo las llaves
#%%
for service in ServiceAzure.values():  # usamos esta función para acceder a los valores
    print(service)
#%%
# Comprobar la existencia de algun elemeno
print('AB' in ServiceAzure)  # Devuelve un valor booleano de la comprobacion.
# Agregar un elemento
ServiceAzure['IA']['IAD'] = 'Inteligencia Artificial Distribuida'
print(ServiceAzure)
# Eliminar un elemento
ServiceAzure.pop('IA')
print('IA' in ServiceAzure)
print(ServiceAzure)
# Vaciar un diccionario
ServiceAzure.clear()
print(ServiceAzure)
# Eliminar un diccionario
del ServiceAzure