import io.descoped.lds.api.persistence.PersistenceInitializer;
import io.descoped.lds.core.persistence.postgres.PostgresDbInitializer;

module io.descoped.lds.persistence.postgres {
    requires io.descoped.lds.persistence.api;
    requires java.sql;
    requires com.zaxxer.hikari;
    requires org.postgresql.jdbc;
    requires java.logging;
    requires jul_to_slf4j;
    requires io.reactivex.rxjava2;
    requires org.reactivestreams;

    opens postgres;

    provides PersistenceInitializer with PostgresDbInitializer;
}
