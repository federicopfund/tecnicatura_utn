###  Sistemas operativos y fundamentos de Linux ###
<br />

>![linux](linux.png)

##

**Comandos utilizados**

<details>
<summary>Comandos Basicos en Linux </summary>
<br />

Operaciones generales:
- `clear` = Limpia la terminal

Operaciones de directorio:
- `pwd` = Mostrar el directorio actual. Ejemplo :
Output: `/home/$USER`
- `ls` = Listar carpetas y archivos. Ejemplo
 Output: `Desktop  Downloads  Pictures  Documents`
- `cd [dirname]` = Cambie de directorio a `[dir]`
- `mkdir [dirname]` = Hacer o Crear directorio [dirname]
- `cd ..` = Ir al directorio.
Operaciones de archivo:

- `touch [filename]` = Crear filename]
- `rm [filename]` = Eliminar [filename]
- `rm -r [dirname]` = Eleminar un directorio no vacío y todos los archivos en él
- `rm -d [dirname]` or `rmdir [dirname]` = Eliminar un directorio vacío

Navegación en el sistema de archivos:
- `cd usr/local/bin` = Navegar por múltiples dirs (ruta relativa - relativa al directorio actual). Mover al directorio `bin`
- `cd ../..` = Sube 2 jerarquías, así que ve al directorio `usr`
- `cd /usr` = Alternativa para ir a `usr` directamente (ruta absoluta)
- `cd [absolute path]` = Mover a cualquier lugar proporcionando la ruta completa
- `cd $home` = Ir a mi directorio personal (ruta absoluta)
- `cd ~` = Acceso directo alternativo para ir al directorio de inicio
- `ls /etc/network` = Lista de carpetas y archivos del directorio `red`

Más operaciones de archivos y directorios
- `mv [filename] [new_filename]` = Cambiar el nombre del archivo a un nuevo nombre
- `cp -r [dirname] [new_dirname]` = Copiar dirname a new_dirname recursivamente significado incluyendo los archivos
- `cp [filename] [new_filename]` = Copiar nombre de archivo a new_filename

Algunos comandos más útiles 
- `ls -R [dirname]` = Mostrar dirs y archivos, sino también sub dirs y archivos
- `history` = Da una lista de todos los comandos pasados escritos en la sesión de terminal actual
- `history 20` = Mostrar lista de los últimos 20 comandos
- `CTRL + r` = historial de búsqueda

- `CTRL + c` = Orden stop current
- `CTRL + SHIFT + v` = Pegar texto copiado en el terminal
- `ls -a` = Ver archivos ocultos también
- `cat [filename]` = Mostrar el contenido del archivo
- `cat .bash_history` = Mostrar el contenido del archivo
- `cat Documents/java-app/Readme.md` = Mostrar el contenido del archivo

Mostrar información del sistema operativo
- `uname -a` = Mostrar sistema y núcleo
- `cat /etc/os-release` =  Mostrar información del OS 
- `lscpu` = Mostrar información de hardware, p. ej., la CPU que tiene, etc.
- `lsmem` = Mostrar información de memoria


Ejecutar comandos como superusuario
- `sudo [some command]` = Permite a los usuarios regulares ejecutar programas con los privilegios de seguridad del superusuario o root
- `su - admin` = Cambiar de usuario  a admin
</details>


******

<details>
<summary>Instalación de software en Linux - Package Manager </summary>
<br />

Administrador de paquetes de APT:
- `sudo apt search [package_name]` = Buscar un paquete dado
- `sudo apt install [package_name]` = Instalar un paquete dado
- `sudo apt install [package_name] [package_name2]` = Instalar varios paquetes con un comando
- `sudo apt remove [package_name]` = Quitar el paquete instalado
- `sudo apt update` = Actualiza el índice de paquetes. Muestra los últimos cambios desde los repositorios APT


Administrador de paquetes de APT-GET:
- `sudo apt-get install [package_name]` = Instalar paquete con el gestor de paquetes apt-get

Administrador de paquetes de SNAP
- `sudo snap install [package_name]` = Instalar un paquete dado


</details>

******

<details>
<summary> Trabajar con Vim Editor</summary>
<br />

Instalar Vim, si no está disponible:
- `sudo apt install vim` 

Hay 2 modos de:
- Modo de comando: modo predeterminado, todo se interpreta como un comando
- Modo de inserción: Permite introducir texto

Comandos de Vim:
- `vim [filename]` = Abrir archivo con Vim
- `Press i key` = Cambiar al modo de inserción
- `Press esc key` = Cambiar al modo de comando
- `Type :wq` = Escribir archivo en disco y salir de Vim
- `Type :q!` = Salir de Vim sin guardar los cambios
- `Type dd` = Borrar toda la línea
- `Type d10` = Eliminar las siguientes 10 líneas
- `Type u` = Deshacer
- `Type A` = Saltar al final de la línea y cambiar al modo de inserción
- `Type 0` = Saltar al inicio de la línea
- `Type $` = Saltar al final de la línea
- `Type 12G` = Ir a la línea 12
- `Type 16G` = Ir a la línea 16
- `Type /pattern` = Búsqueda de patrón, p.ej. `/nginx`
    - `Type n` = Saltar al próximo partido
    - `Type N` = Buscar en dirección opuesta
- `Type :%s/old/new` = Reemplazar 'viejo' con 'nuevo' en todo el archivo

</details>

******


<details>
<summary> Cuentas y grupos de Linux (usuarios y permisos)</summary>
 <br />

**Ubicaciones de los archivos de control de acceso:**
- /etc/passwd
- /etc/shadow
- /etc/group
<!-- -->
- `sudo adduser [username]` = Crear un nuevo usuario
- `sudo passwd [username]` = Cambiar la contraseña de un usuario
- `su - [username]` = Iniciar sesión como nombre de usuario ('su' = abreviatura de usuario sustituto o conmutador)
- `su -` = iniciar sesión como root

<!-- -->
- `sudo groupadd [groupname]` = Crear nuevo grupo (Sistema asigna el siguiente GID disponible)
- `sudo adduser [username]` = Cambiar al modo de inserción

**Nota 2 diferentes comandos de usuario/grupo:**<br />
`adduser`, `addgroup`, `deluser`,  `delgroup` = Comandos interactivos, más fáciles de usar<br />
`useradd`, `groupadd`,  `userdel`,  `groupdel` = Utilidades de bajo nivel, más información necesita proporcionada por usted mismo

- `sudo usermod [OPTIONS] [username]` = Modificar una cuenta de usuario
- `sudo usermod -g devops $USER` = Asignar `devops` como el grupo principal para el usuario `$USER`
- `sudo delgroup $USER` = Elimina el grupo  `$USER`
- `groups` = Mostrar grupos a los que pertenece el usuario actual registrado
- `groups [username]` = Mostrar grupos del nombre de usuario dado
- `sudo useradd -G devops $USER` = Crear usuario `$USER` y añadir `$USER` al grupo 'devops' (-G = grupo secundario, no primario)
- `sudo gpasswd -d $USER devops` =Elimina usuario `$USER` del grupo 'devops'


</details>

******

<details>
<summary>Propiedad de archivos y permisos (usuarios y permisos) </summary>
 <br />

- `ls -l` = Imprimir archivos en un formato de listado largo, puede ver la propiedad y los permisos del archivo.

**Ownership:**
- `sudo chown [username]:[groupname] [filename]` = cambiar la propiedad
- `sudo chown tom:admin test.txt` = Cambiar la propiedad del archivo 'test.txt' a 'tom' y grupo 'admin'
- `sudo chown admin test.txt` = Cambiar la propiedad del usuario 'test.txt' 'admin
- `sudo chgrp devops test.txt` = Hacer el propietario del grupo 'devops' del archivo test.txt

**Posibles permisos de archivo (simbólico):**
- r = Leer
- w = Escribir
- x = Ejecutar
- '-' = Sin autorización

**Cambiar permisos de archivo para diferentes propietarios**

Los permisos de archivo se pueden cambiar para:
- u = propietario
- g = Grupo
- o = Otros (todos los demás usuarios)

Menos (-) elimina el permiso
- `sudo chmod -x api` = Toma el permiso 'ejecutar' para la carpeta 'api' de todos los propietarios
- `sudo chmod g-w config.yaml` = Quita el permiso de 'escritura' para el archivo 'config.yaml' del grupo 

Más (+) añade permiso
- `sudo chmod g+x config.yaml` = Agregar permiso 'ejecutar' para el archivo 'config.yaml' al grupo 
- `sudo chmod u+x script.sh` = Añadir 'ejecutar' permiso para el archivo 'script.sh' al usuario 
- `sudo chmod o+x script.sh` = Añadir 'ejecutar' permiso para el archivo 'script.sh' a otro 

Cambiar varios permisos para un propietario
- `sudo chmod g=rwx config.yaml` = Asignar permisos 'read write execute' al grupo
- `sudo chmod g=r-- config.yaml` = Asignar solo permiso de 'lectura' al grupo

Cambiar permisos con valores numéricos

Establecer permisos para todos los propietarios con 3 dígitos, 1 dígito para cada propietario_ [Modo Absoluto vs Simbólico](https://docs.oracle.com/cd/E19455-01/805-7229/6j6q8svd8/)

- 0 = Sin permiso
- 1 = Ejecutar
- 2 = Escribir
- 3 = Ejecutar + Escribir
- 4 = Leer
- 5 = Lectura + Ejecución
- 6 = Lectura + Escritura
- 7 = Lectura + Escritura + Ejecución
<!-- -->
- `sudo chmod 777 script.sh` = rwx (Leer, Escribir y Ejecutar) permiso para todos para el archivo 'script.sh'
- `sudo chmod 740 script.sh` = Dar al usuario todos los permisos (7), dar permiso de solo lectura de grupo (4), dar otro no permiso (0)


</details>

******

<details>
<summary>Introducción a Shell Scripting</summary>
 <br />

Cree y abra el archivo setup.sh en el editor vim: <br />
`vim setup.sh`

En el archivo setup.sh:
```sh
#!/bin/bash

echo "Configurar y configurar el servicio"

# save file with 
ESC :wq 

# hacer ejecutable el archivo
chmod u+x setup.sh

# script de ejecución
./setup.sh 
bash setup.sh
```

</details>

******

<details>
<summary> Conceptos y sintaxis </summary>
 <br />

**Variables:**
```sh
#!/bin/bash

echo "Configuración y configuración del servidor"

file_name=config.yaml
config_files=$(ls config)

echo "usando Archivo $file_name para configurar algo"
echo "aquí están todos los archivos de configuración: $config_files"
```

**condiciones:**
```sh
#!/bin/bash

echo "Configuración y configuración del servidor"

file_name=config.yaml
config_dir=$1

if [ -d "$config_dir" ]
then
 echo "lectura del contenido del directorio de configuración"
 config_files=$(ls "$config_dir")
else 
 echo "config dir no encontrado. Crear uno"
 mkdir "$config_dir"
 touch "$config_dir/config.sh"
fi


# ejemplo condicional para comprobar el archivo
# if [ -f "config.yaml" ]

# ejemplo condicional para verificar números
# num_files=xx
# if [ "$num_files" -eq 10 ]

# ejemplo condicional para comprobar cadenas
user_group=$2
if [ "$user_group" == "nana" ]
then 
 echo "configurar el servidor"
elif [ "$user_group" == "admin" ]
then
	echo "administer the server" 
else
 echo "No hay permiso para configurar el servidor. grupo de usuarios incorrecto"
fi

echo "usando Archivo $file_name para configurar algo"
echo "aquí están todos los archivos de configuración: $config_files"
```

**User input:**
```sh
#!/bin/bash

echo "Lectura de la entrada del usuario"

read -p "Por favor introduzca su contraseña: " user_pwd
echo "gracias por tu contraseña $user_pwd"
```

**Parámetros del script:**
```sh
#!/bin/bash

echo "todos los parámetros:: $*"
echo "número de parámetros: $#"

echo "usuario $1"
echo "grupo $2"
```


**Ejecución con parámetros de script:**

`./example.sh name lastname # 2 params`

`./example.sh "name lastname" # 1 param`

`bash example name lastname`

**bucles:**
```sh
#!/bin/bash

echo "todos los parámetros: $*"
echo "número de parámetros: $#"

for param in $*
 do 
  if [ -d "$param" ] 
  then
   echo "ejecutar scripts en la carpeta de configuración"
   ls -l "$param"
  fi 

  echo $param
 done

sum = 0
while true
 do 
	read -p "enter a score" score

  if [ "$score" == "q" ]
  then
   break
  fi

  sum=$(($sum+$score))
  echo "total score: $sum"
 done
```

</details>

******


<details>
<summary> Conceptos & sintaxis </summary>
 <br />

**Functions:**
```sh
#!/bin/bash

echo "todos los parámetros: $*"
echo "número de parámetros: $#"

for param in $*
 do 
  if [ -d "$param" ] 
  then
   echo "ejecutar scripts en la carpeta de configuración"
   ls -l "$param"
  fi 

  echo $param
 done

# Función de declaración
function sum {
  sum = 0
	while true
	 do 
		read -p "intruduce un puntaje:" score
	
	  if [ "$score" == "q" ]
	  then
	   break
	  fi
	
	  sum=$(($sum+$score))
	  echo "total puntaje: $sum"
	 done
}

# Invocar función
sum

function create_file() {
	file_name=$1
  is_shell_script=$2
  touch $file_name
  echo "archivo $file_name creado" 

  if [ "$is_shell_script" = true ]
  then
		chmod u+x $file_name
		echo "añadido permiso de ejecución"
	fi
}
# Invocar con parámetros diff
create_file test.txt
create_file myfile.yaml
create_file myscript.sh

# Función con valor de retorno
function sum() {
	total=$(($1+$2))
  return $total
}

sum 2 10
result=$?

echo "suma de 2 y 10 es $result"
```

</details>

******

<details>
<summary> Comandos de Linux - pipeline y redireccionamientos</summary>
<br />

**Pipe & Less:**

Pipe comando:
- `|` = Comando de tubería = Canaliza la salida del comando anterior como una entrada al siguiente comando

Less comando:
- `less [filename]` = Muestra el contenido de un archivo o una salida de comando, una página a la vez. Y permite navegar hacia adelante y hacia atrás a través del archivo


Diferentes ejemplos de tuberías/casos de uso:
- `cat /var/log/syslog | less` = Canaliza la salida del archivo 'syslog' a menos programa.
- `ls /usr/bin | less` = Canaliza la salida de `ls` comando 
- `history | less` = Canaliza la salida del comando history a menos programa.

**Pipe & Grep:**

Grep comando:
- `grep [pattern]` = Busca un patrón particular de caracteres y muestra todas las líneas que contienen ese patrón

Más ejemplos de tuberías/casos de uso:
- `history | grep sudo` = Busque cualquier comando de comandos de historia, que tienen 'sudo' palabra en ella
- `history | grep "sudo chmod"` = Busque cualquier comando de comandos de historia, que tienen 'sudo chmod' frase en ella
- `history | grep sudo | less` =  La salida de historial pasará la salida a grep y el filtro para 'sudo' y esta salida será nuevamente canalizada o pasada a menos programa
- `ls /usr/bin/ | grep java` = Filtro ls de salida para java
- `cat Documents/java-app/config.yaml | grep ports` = Ver todas las apariciones de 'ports' en el archivo config.yaml
**Redirecciones en Linux:**
- `>` = Redirect Operator = Toma la salida del comando anterior y la envía a un archivo que usted da.

Diferentes ejemplos de redirecciones/casos de uso:
- `history | grep sudo > sudo-commands.txt` = Redirigir la salida a un archivo 'sudo-commands.txt'
- `cat sudo-commands.txt > sudo-rm-commands.txt` = Redirigir la salida del archivo 'sudo-commands.txt' al archivo 'sudo-rm-commands.txt'

- `history | grep rm > sudo-rm-commands.txt` = Redirigir la salida de comandos de historial filtrado al archivo existente 'sudo-rm-commands.txt'. Nota: El contenido del archivo será _overwritten_
- `history | grep rm >> sudo-rm-commands.txt` = Redirigir la salida de comandos de historial filtrado al archivo existente 'sudo-rm-commands.txt'. Nota: El contenido del archivo será _appended_

</details>

******

<details>
<summary>variables de entorno</summary>
<br />

_Las variables almacenan información. Las variables de entorno están disponibles para todo el entorno. _
_Una variable de entorno consiste en _name=value_ pair. _

**Variables de entorno existentes:**
- `SHELL=/bin/bash`= shell por defecto, en este caso bash
- `HOME=/home/nana`= directorio personal del usuario actual
- `USER=nana` = usuario actualmente conectado


<!-- -->
- `printenv` = Enumerar todas las variables de entorno
- `printenv | less` = Listar todas las variables de entorno con menos programa
- `printenv [environment variable]` = Valor de visualización de la variable de entorno dada, p.ej. `printenv USER`
- `printenv | grep USER` = Filtrar variables de entorno, que tienen 'USER' en el nombre
<!-- -->
- `echo $USER` = Valor de impresión de la variable de entorno USER

**Cree sus propias variables de entorno:**
- `export DB_USERNAME=dbuser` = Establecer la variable de entorno 'DB_USERNAME' con el valor 'dbuser'
- `export DB_PASSWORD=secretpwdvalue` = Establecer la variable de entorno 'DB_PASSWORD' con el valor 'secretpwdvalue'
- `export DB_NAME=mydb` = Establecer la variable de entorno 'DB_NAME' con el valor 'mydb'
- `printenv | grep DB` = Filtrar variables de entorno para caracteres 'DB'
- `export DB_NAME=newdbname` = Establecer la variable de entorno 'DB_NAME' en un nuevo valor 'newdbname'

**Eliminar variables de entorno:**
- `unset DB_NAME` = Eliminar variable con el nombre 'DB_NAME'

**Variables de entorno persistentes:**

Variables de entorno persistentes con el archivo de configuración específico del shell:
_Las variables de entorno establecidas en la terminal solo están disponibles en la sesión de la terminal actual. _

Agregue variables de entorno al archivo '~/.bashrc' o al archivo 'rc' de su shell específico. Las variables establecidas en este archivo se cargan cada vez que se introduce un shell de inicio de sesión de bash.
- `export DB_USERNAME=dbuser`
- `export DB_PASSWORD=secretvl`
- `export DB_NAME=mydb`
En terminal de nuevo:
- `source ~/.bashcrc` = Cargar los nuevos env vars en la sesión de shell actual

Variables de entorno persistentes en todo el sistema:
- ~./bashrc =específicos del usuario
- /etc/environment = sistema, lo que significa que todos los usuarios tendrán acceso a las variables

**Variable de entorno PATH:**
- `PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin` = Lista de directorios a archivos ejecutables, separados por ':'. Le dice al shell qué directorios a ssearch para el ejecutable en respuesta a nuestro comando ejecutado
- `PATH=$PATH:/home/nana` = Anexar la carpeta /home/$USER
al valor $PATH existente


</details>

******

<details>
<summary>Networking</summary>
<br />

Comandos de red útiles:
- `ip`= uno de los comandos básicos. Para configurar nuevos sistemas y asignar IPs a la solución de problemas de sistemas existentes. Puede mostrar información de direcciones, manipular el enrutamiento, además de mostrar varios dispositivos, interfaces y túneles de la red.
- `ifconfig`= para configurar y solucionar problemas de redes. Desde entonces ha sido reemplazado por el comando `ip` 
- `netstat`= herramienta para imprimir conexiones de red, tablas de enrutamiento, estadísticas de interfaz, conexiones de enmascaramiento y membresías multicast
- `ps aux` =
  - ps = muestra información sobre una selección de los procesos activos
  - a =  mostrar procesos para todos los usuarios
  - u = mostrar el usuario/propietario del proceso
  - x = también muestran procesos no conectados a un terminal
- `nslookup` = Buscar consultas relacionadas con DNS
- `ping` =  Para comprobar la conectividad entre dos nodos

</details>

******

<details>
<summary>SSH - Secure Shell</summary>
<br />

Connecting via SSH: `ssh username@SSHserver`
- `ssh root@129.82.11.93`= Conectar con el usuario root a la dirección del servidor IP
- `ssh-keygen -t rsa`= Crear par de claves SSH con algoritmo 'rsa'. El par de claves SSH se almacena en la ubicación predeterminada `~/. ssh`
- `ls .ssh/`= Mostrar el contenido de la carpeta . ssh, que tiene:
  - `id_rsa` = clave privada
  - `id_rsa.pub` = clave pública
- `ssh -i .ssh/id_rsa root@129.82.11.93` = Conéctese con el usuario root a la dirección de servidor 129.82.11.93 con la ubicación de archivo de clave privada especificada (.ssh/id_rsa = predeterminado, pero puede especificar una diferente como esta)

Dos archivos utilizados por SSH:
- `~/.ssh/known_hosts` = permite al cliente autenticar el servidor para comprobar que no se conecta a un imitador
- `~/.ssh/authorized_keys` = permite al servidor autenticar al usuario

</details>

******
