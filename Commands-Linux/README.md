###  Sistemas operativos y fundamentos de Linux ###
<br />
![linux](linux.png)

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
