FROM 'postgres:16.0-alpine'

COPY entrypoint /docker-entrypoint-initdb.d/

RUN for f in /docker-entrypoint-initdb.d/*; do dos2unix $f; done