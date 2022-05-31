package nl.isaac.devblog.apollomissions.api.config;

import javax.inject.Singleton;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyOrderStrategy;

import io.quarkus.jsonb.JsonbConfigCustomizer;

@Singleton
public class JsonSerializationCustomizer implements JsonbConfigCustomizer {
    public void customize(final JsonbConfig config) {
        config.withPropertyOrderStrategy(PropertyOrderStrategy.ANY);
    }
}
