package de.fhdo.puls.bookingmanagementcommand.kafka.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingCanceled;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingCreated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingUpdated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingCanceled;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingCreated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingUpdated;
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
    public ProducerFactory<String, ParkBookingCreated> parkBookingCreatedEventProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, ParkBookingCreated> parkBookingCreatedEventProducer() {
        return new KafkaTemplate<>(parkBookingCreatedEventProducerFactory());
    }

    @Override
    public ProducerFactory<String, ParkBookingUpdated> parkBookingUpdatedEventProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, ParkBookingUpdated> parkBookingUpdatedEventProducer() {
        return new KafkaTemplate<>(parkBookingUpdatedEventProducerFactory());
    }

    @Override
    public ProducerFactory<String, ParkBookingCanceled> parkBookingCanceledEventProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, ParkBookingCanceled> parkBookingCanceledEventProducer() {
        return new KafkaTemplate<>(parkBookingCanceledEventProducerFactory());
    }

    @Override
    public ProducerFactory<String, ParkAndChargeBookingCreated> parkAndChargeBookingCreatedEventProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, ParkAndChargeBookingCreated> parkAndChargeBookingCreatedEventProducer() {
        return new KafkaTemplate<>(parkAndChargeBookingCreatedEventProducerFactory());
    }

    @Override
    public ProducerFactory<String, ParkAndChargeBookingUpdated> parkAndChargeBookingUpdatedEventProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, ParkAndChargeBookingUpdated> parkAndChargeBookingUpdatedEventProducer() {
        return new KafkaTemplate<>(parkAndChargeBookingUpdatedEventProducerFactory());
    }

    @Override
    public ProducerFactory<String, ParkAndChargeBookingCanceled> parkAndChargeBookingCanceledEventProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    @Override
    public KafkaTemplate<String, ParkAndChargeBookingCanceled> parkAndChargeBookingCanceledEventProducer() {
        return new KafkaTemplate<>(parkAndChargeBookingCanceledEventProducerFactory());
    }
}
