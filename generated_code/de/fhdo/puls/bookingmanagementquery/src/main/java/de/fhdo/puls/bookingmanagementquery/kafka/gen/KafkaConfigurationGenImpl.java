package de.fhdo.puls.bookingmanagementquery.kafka.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBookingCanceled;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBookingCreated;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBookingUpdated;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingCanceled;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingCreated;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingUpdated;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpaceOffered;
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

    @Value(value = "${kafka.group.parkBookingCreatedEvents}")
    protected String parkBookingCreatedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ParkBookingCreated> parkBookingCreatedEventsParkBookingCreatedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, parkBookingCreatedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ParkBookingCreated.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ParkBookingCreated> parkBookingCreatedEventsParkBookingCreatedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ParkBookingCreated> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(parkBookingCreatedEventsParkBookingCreatedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.parkBookingUpdatedEvents}")
    protected String parkBookingUpdatedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ParkBookingUpdated> parkBookingUpdatedEventsParkBookingUpdatedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, parkBookingUpdatedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ParkBookingUpdated.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ParkBookingUpdated> parkBookingUpdatedEventsParkBookingUpdatedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ParkBookingUpdated> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(parkBookingUpdatedEventsParkBookingUpdatedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.parkCanceledDeletedEvents}")
    protected String parkCanceledDeletedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ParkBookingCanceled> parkBookingCanceledEventsParkCanceledDeletedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, parkCanceledDeletedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ParkBookingCanceled.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ParkBookingCanceled> parkBookingCanceledEventsParkCanceledDeletedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ParkBookingCanceled> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(parkBookingCanceledEventsParkCanceledDeletedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
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

    @Value(value = "${kafka.group.parkAndChargeCreatedEvents}")
    protected String parkAndChargeCreatedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ParkAndChargeBookingCreated> parkAndChargeBookingCreatedEventsParkAndChargeCreatedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, parkAndChargeCreatedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ParkAndChargeBookingCreated.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ParkAndChargeBookingCreated> parkAndChargeBookingCreatedEventsParkAndChargeCreatedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ParkAndChargeBookingCreated> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(parkAndChargeBookingCreatedEventsParkAndChargeCreatedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.parkAndChargeBookingUpdatedEvents}")
    protected String parkAndChargeBookingUpdatedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ParkAndChargeBookingUpdated> parkAndChargeBookingUpdatedEventsParkAndChargeBookingUpdatedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, parkAndChargeBookingUpdatedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ParkAndChargeBookingUpdated.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ParkAndChargeBookingUpdated> parkAndChargeBookingUpdatedEventsParkAndChargeBookingUpdatedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ParkAndChargeBookingUpdated> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(parkAndChargeBookingUpdatedEventsParkAndChargeBookingUpdatedEventsConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.parkAndChargeCanceledDeletedEvents}")
    protected String parkAndChargeCanceledDeletedEventsConsumerGroupId;

    @Override
    public ConsumerFactory<String, ParkAndChargeBookingCanceled> parkAndChargeBookingCanceledEventsParkAndChargeCanceledDeletedEventsConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, parkAndChargeCanceledDeletedEventsConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(ParkAndChargeBookingCanceled.class));
    }

    @Bean()
    @Override
    public ConcurrentKafkaListenerContainerFactory<String, ParkAndChargeBookingCanceled> parkAndChargeBookingCanceledEventsParkAndChargeCanceledDeletedEventsKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ParkAndChargeBookingCanceled> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(parkAndChargeBookingCanceledEventsParkAndChargeCanceledDeletedEventsConsumerFactory());
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
