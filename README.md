### Environment variables

Override defaults. Can use helper script to source envvars:

```bash
source ./scripts/export_env.sh .env
```

Environment variables for application service (default) to run locally:

```bash
APP_POSTGRES_HOST="postgres"
APP_POSTGRES_USERNAME="stus"
APP_POSTGRES_PASSWORD="password"
APP_POSTGRES_DATABASE="laba"
APP_POSTGRES_PORT="5432"
APP_PORT="8871"
```
### Start

```sh
docker compose build
docker compose up [-d]
```
