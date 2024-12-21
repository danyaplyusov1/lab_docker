FROM 'liquibase/liquibase:4.24-alpine'

COPY changelog /liquibase/changelog
COPY config /liquibase/config

RUN find /liquibase/ -type f -exec dos2unix $f \;