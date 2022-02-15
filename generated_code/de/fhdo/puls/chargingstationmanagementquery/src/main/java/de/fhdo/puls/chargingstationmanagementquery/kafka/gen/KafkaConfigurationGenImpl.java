package de.fhdo.puls.chargingstationmanagementquery.kafka.gen;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ElectrifiedParkingSpaceCreated;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceCreated;
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

    @Value(value = "${kafka.group.parkingSpaceCreatedEvents}")
    protected String parkingSpaceCreatedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ParkingSpaceCreated> parkingSpaceCreatedEventsParkingSpaceCreatedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, parkingSpaceCreatedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ParkingSpaceCreated.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ParkingSpaceCreated> parkingSpaceCreatedEventsParkingSpaceCreatedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ParkingSpaceCreated> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(parkingSpaceCreatedEventsParkingSpaceCreatedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.ElectrifiedParkingSpaceCreatedEvents}")
    protected String electrifiedParkingSpaceCreatedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ElectrifiedParkingSpaceCreated> electrifiedParkingSpaceCreatedEventsElectrifiedParkingSpaceCreatedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, electrifiedParkingSpaceCreatedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ElectrifiedParkingSpaceCreated.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ElectrifiedParkingSpaceCreated> electrifiedParkingSpaceCreatedEventsElectrifiedParkingSpaceCreatedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ElectrifiedParkingSpaceCreated> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(electrifiedParkingSpaceCreatedEventsElectrifiedParkingSpaceCreatedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }
}
