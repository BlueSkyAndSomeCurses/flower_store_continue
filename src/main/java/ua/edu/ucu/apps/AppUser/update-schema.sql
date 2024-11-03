CREATE TABLE app_user
(
    id            BIGINT NOT NULL,
    email         VARCHAR(255),
    gender        SMALLINT,
    date_of_birth date,
    CONSTRAINT pk_appuser PRIMARY KEY (id)
);