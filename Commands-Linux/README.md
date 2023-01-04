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
- `cd /home/nana` = Ir a mi directorio personal (ruta absoluta)
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
