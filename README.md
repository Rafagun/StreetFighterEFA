# Street Fighter — Base de datos con Docker

La base de datos MySQL del proyecto se ejecuta en un contenedor Docker mediante Docker Compose. No es necesario instalar MySQL en el equipo.

## Requisitos

- Tener **Docker** instalado y en ejecución (en Windows, Docker Desktop).

## Inicializar la base de datos

Desde una terminal, situado en la carpeta del proyecto (donde está el archivo `docker-compose.yml`), ejecutar:

```bash
docker compose up -d
```

Este comando:

- Descarga la imagen de MySQL si no está disponible en el equipo.
- Crea y arranca el contenedor `mysql_streetfighter` en segundo plano (`-d`).
- La primera vez, crea la base de datos `streetfighter` junto con su usuario y sus datos iniciales.

Para comprobar que el contenedor está en marcha:

```bash
docker compose ps
```

## Detener la base de datos

```bash
docker compose down
```

Detiene y elimina el contenedor, pero **los datos se conservan** en el volumen de Docker. Al volver a ejecutar `docker compose up -d`, la base de datos estará tal como se dejó.

### Reiniciar la base de datos a su estado original

```bash
docker compose down -v
```

El parámetro `-v` elimina también el volumen donde se guardan los datos. Al ejecutar de nuevo `docker compose up -d`, la base de datos se crea desde cero y vuelve a su **estado original**: se pierden todos los cambios realizados.

## Puertos

En el `docker-compose.yml`, el mapeo de puertos tiene el formato:

```
"puerto_del_equipo:puerto_del_contenedor"
```

El proyecto usa:

```yaml
ports:
  - "3307:3306"
```

- **3306**: puerto en el que escucha MySQL dentro del contenedor. No se modifica.
- **3307**: puerto del equipo por el que se accede a la base de datos.

Se usa el 3307 en lugar del 3306 para evitar conflictos con una instalación local de MySQL, que ocupa el 3306 por defecto. Si al arrancar aparece el error `ports are not available ... bind: Only one usage of each socket address`, significa que el puerto del equipo ya está en uso. En ese caso, hay que cambiar el número de la izquierda por otro libre y actualizar la URL de conexión (ver siguiente apartado).

## Configuración de la conexión

La aplicación Java lee los datos de conexión del archivo:

```
src/main/java/resources/db.properties
```

```properties
database.driver=com.mysql.cj.jdbc.Driver
database.url=jdbc:mysql://localhost:3307/streetfighter?allowPublicKeyRetrieval=true&useSSL=false
database.user=...
database.password=...
```

- **`localhost:3307`**: el puerto debe coincidir con el de la **izquierda** en `ports` del `docker-compose.yml`. Si se cambia allí, hay que cambiarlo también aquí.
- **`streetfighter`**: debe coincidir con `MYSQL_DATABASE` del `docker-compose.yml`.
- **`allowPublicKeyRetrieval=true&useSSL=false`**: necesarios para que el conector de MySQL 8 pueda autenticarse sin SSL en local.
- **`database.user` / `database.password`**: deben coincidir con `MYSQL_USER` y `MYSQL_PASSWORD` del `docker-compose.yml`.

> **Nota:** los valores de `environment` del `docker-compose.yml` solo se aplican cuando la base de datos se crea por primera vez. Si se modifican después, hay que ejecutar `docker compose down -v` y `docker compose up -d` para que tengan efecto.
