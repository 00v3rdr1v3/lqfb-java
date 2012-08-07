The project lqfb-entities generates JPA Entities from an existing lqfb schema (user www-data).
As a Unit-Test it creates a new schema in a different database (lqfb-test) and writes some test data in it.

The db connection information has to be changed in the following files

/src/main/ressources/META_INF/hibernate.properties
/src/main/ressources/META_INF/persistence.xml
/src/main/ressources/hibernate.cfg.xml
/src/test/ressources/hibernate.cfg.xml

As the lqfb-schema is somewhat complicated. Some of the tables can't be automatically reengineered at the moment, we are working on a solution.