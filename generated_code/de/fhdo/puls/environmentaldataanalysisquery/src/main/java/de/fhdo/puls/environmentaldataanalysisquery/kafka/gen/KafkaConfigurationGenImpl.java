package de.fhdo.puls.environmentaldataanalysisquery.kafka.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentDataReceived;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitCreated;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitUpdated;
import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.listener.SeekToCurrentErrorHandler;
import org.springframework.kafka.support.serializer.JsonDeserializer;

public abstract class KafkaConfigurationGenImpl implements KafkaConfigurationGen {

    @Value(value = "${kafka.bootstrapAddress}")
    protected String bootstrapAddress;

    @Bean()
    @Override
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return new KafkaAdmin(configs);
    }

    @Value(value = "${kafka.group.environmentDataReceivedEvents}")
    protected String environmentDataReceivedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, EnvironmentDataReceived> environmentDataReceivedEventsEnvironmentDataReceivedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, environmentDataReceivedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(EnvironmentDataReceived.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, EnvironmentDataReceived> environmentDataReceivedEventsEnvironmentDataReceivedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, EnvironmentDataReceived> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(environmentDataReceivedEventsEnvironmentDataReceivedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.environmentSensorUnitCreatedEvents}")
    protected String environmentSensorUnitCreatedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, EnvironmentSensorUnitCreated> environmentSensorUnitCreatedEventsEnvironmentSensorUnitCreatedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, environmentSensorUnitCreatedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(EnvironmentSensorUnitCreated.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, EnvironmentSensorUnitCreated> environmentSensorUnitCreatedEventsEnvironmentSensorUnitCreatedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, EnvironmentSensorUnitCreated> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(environmentSensorUnitCreatedEventsEnvironmentSensorUnitCreatedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.environmentSensorUnitUpdatedEvents}")
    protected String environmentSensorUnitUpdatedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, EnvironmentSensorUnitUpdated> environmentSensorUnitUpdatedEventsEnvironmentSensorUnitUpdatedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, environmentSensorUnitUpdatedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(EnvironmentSensorUnitUpdated.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, EnvironmentSensorUnitUpdated> environmentSensorUnitUpdatedEventsEnvironmentSensorUnitUpdatedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, EnvironmentSensorUnitUpdated> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(environmentSensorUnitUpdatedEventsEnvironmentSensorUnitUpdatedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }
}
