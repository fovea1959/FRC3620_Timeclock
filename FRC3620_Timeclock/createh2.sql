CREATE SCHEMA IF NOT EXISTS SA;

CREATE CACHED TABLE IF NOT EXISTS SA.PERSONS (
    PERSON_ID INTEGER auto_increment primary key,
    LASTNAME VARCHAR(255),
    FIRSTNAME VARCHAR(255),
    MENTOR SMALLINT default 0,
);

CREATE CACHED TABLE IF NOT EXISTS SA.WORKSESSIONS (
    WORKSESSION_ID INTEGER auto_increment primary key,
    PERSON_ID INTEGER NOT NULL,
    START_DATE TIMESTAMP NOT NULL,
    ORIGINAL_START_DATE TIMESTAMP NOT NULL,
    END_DATE TIMESTAMP,
    ORIGINAL_END_DATE TIMESTAMP,
);

CREATE CACHED TABLE IF NOT EXISTS SA.CORRECTIONS (
    CORRECTION_ID INTEGER auto_increment primary key,
    WORKSESSION_ID INTEGER NOT NULL,
    START_OR_END VARCHAR(5) NOT NULL,
    NEW_DATE TIMESTAMP NOT NULL,
    OLD_DATE TIMESTAMP,
    CORRECTION_DATE TIMESTAMP NOT NULL,
    CORRECTED_BY INTEGER NOT NULL,
);
