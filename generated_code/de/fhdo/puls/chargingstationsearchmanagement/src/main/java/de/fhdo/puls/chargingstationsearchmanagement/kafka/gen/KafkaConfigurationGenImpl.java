package de.fhdo.puls.chargingstationsearchmanagement.kafka.gen;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ParkingSpaceOffered;
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

    @Value(value = "${kafka.group.parkingSpaceOfferedEvents}")
    protected String parkingSpaceOfferedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ParkingSpaceOffered> parkingSpaceOfferedEventsParkingSpaceOfferedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, parkingSpaceOfferedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ParkingSpaceOffered.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ParkingSpaceOffered> parkingSpaceOfferedEventsParkingSpaceOfferedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ParkingSpaceOffered> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(parkingSpaceOfferedEventsParkingSpaceOfferedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.parkingSpaceWithdrawedEvents}")
    protected String parkingSpaceWithdrawedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, OfferedParkingSpaceWithdrawed> parkingSpaceWithdrawedEventsParkingSpaceWithdrawedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, parkingSpaceWithdrawedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(OfferedParkingSpaceWithdrawed.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, OfferedParkingSpaceWithdrawed> parkingSpaceWithdrawedEventsParkingSpaceWithdrawedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, OfferedParkingSpaceWithdrawed> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(parkingSpaceWithdrawedEventsParkingSpaceWithdrawedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.electrifiedParkingSpaceOfferedEvents}")
    protected String electrifiedParkingSpaceOfferedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ElectrifiedParkingSpaceOffered> electrifiedParkingSpaceOfferedEventsElectrifiedParkingSpaceOfferedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, electrifiedParkingSpaceOfferedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ElectrifiedParkingSpaceOffered.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ElectrifiedParkingSpaceOffered> electrifiedParkingSpaceOfferedEventsElectrifiedParkingSpaceOfferedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ElectrifiedParkingSpaceOffered> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(electrifiedParkingSpaceOfferedEventsElectrifiedParkingSpaceOfferedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.electrifiedParkingSpaceWithdrawedEvents}")
    protected String electrifiedParkingSpaceWithdrawedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, OfferedElectrifiedParkingSpaceWithdrawed> electrifiedParkingSpaceWithdrawedEventsElectrifiedParkingSpaceWithdrawedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, electrifiedParkingSpaceWithdrawedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(OfferedElectrifiedParkingSpaceWithdrawed.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, OfferedElectrifiedParkingSpaceWithdrawed> electrifiedParkingSpaceWithdrawedEventsElectrifiedParkingSpaceWithdrawedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, OfferedElectrifiedParkingSpaceWithdrawed> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(electrifiedParkingSpaceWithdrawedEventsElectrifiedParkingSpaceWithdrawedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }
}
