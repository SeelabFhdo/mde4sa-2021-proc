package de.fhdo.puls.chargingstationsharingcommand.kafka.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ParkingSpaceOffered;
import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

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

    @Override
    public ProducerFactory<String, ParkingSpaceOffered> parkingSpaceOfferedEventsProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, ParkingSpaceOffered> parkingSpaceOfferedEventsProducer() {
        return new KafkaTemplate<>(parkingSpaceOfferedEventsProducerFactory());
    }

    @Override
    public ProducerFactory<String, OfferedParkingSpaceWithdrawed> parkingSpaceWithdrawedEventsProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, OfferedParkingSpaceWithdrawed> parkingSpaceWithdrawedEventsProducer() {
        return new KafkaTemplate<>(parkingSpaceWithdrawedEventsProducerFactory());
    }

    @Override
    public ProducerFactory<String, ElectrifiedParkingSpaceOffered> electrifiedParkingSpaceOfferedEventsProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, ElectrifiedParkingSpaceOffered> electrifiedParkingSpaceOfferedEventsProducer() {
        return new KafkaTemplate<>(electrifiedParkingSpaceOfferedEventsProducerFactory());
    }

    @Override
    public ProducerFactory<String, OfferedElectrifiedParkingSpaceWithdrawed> electrifiedParkingSpaceWithdrawedEventsProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, OfferedElectrifiedParkingSpaceWithdrawed> electrifiedParkingSpaceWithdrawedEventsProducer() {
        return new KafkaTemplate<>(electrifiedParkingSpaceWithdrawedEventsProducerFactory());
    }
}
