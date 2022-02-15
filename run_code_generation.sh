#!/usr/bin/env bash

# This script runs the code generators for creating all deployment relevent artifacts, e.g.,
# Dockerfiles, Kubernetes deployment files and build scripts.
# The script requires the file path to the LEMMA folder as a command line parameter. 

if [ ! -z "$1" ]; then
  LEMMA_PATH="$1"
fi

# Path to LEMMA Repository folder
SCRIPT_PATH="scripts/run_model_processor.py"

# Path to Code Generators
CONTAINER_BASE_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.container_base/docker/execution.yaml"
MONGODB_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.mongodb/docker/execution.yaml"
MARIADB_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.mariadb/docker/execution.yaml"
EUREKA_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.springcloud.eureka/docker/execution.yaml"
ZUUL_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.springcloud.zuul/docker/execution.yaml"
MONGODB_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.mongodb/docker/execution.yaml"
MARIADB_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.mariadb/docker/execution.yaml"
JAVABASE_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.java_base/docker/execution.yaml"
SPRINGCLOUD_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.springcloud/docker/execution.yaml"
DOMAINEVENTS_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.springcloud.domain_events/docker/execution.yaml"
KAFKA_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.springcloud.kafka/docker/execution.yaml"
DDD_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.ddd/docker/execution.yaml"
CQRS_PATH="code generators/de.fhdo.lemma.model_processing.code_generation.springcloud.cqrs/docker/execution.yaml"



# Path to code generation target folder
TARGET_PATH="$PWD/generated_code"

# Test output
echo $LEMMA_PATH
echo $PWD 

####################################################################################################
# Booking Microservice Command
####################################################################################################
# Java Base Generator - Booking Microservice Command
echo "Java Base Generator - Booking Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$JAVABASE_PATH" \
    -b "$PWD" \
         -s "Booking-Management-Microservice-Command/bookingCommandManagement.services" \
         -i "Booking-Management-Microservice-Command/intermediate/service models/bookingCommandManagement.xmi" \
    -p "generation-gap" \
    -g "$SPRINGCLOUD_PATH" \
    -g "$DOMAINEVENTS_PATH" \
    -g "$KAFKA_PATH" \
    -g "$DDD_PATH" \
    -g "$CQRS_PATH" \
    -t "$TARGET_PATH"

# Container Base Generator - Booking Microservice Command
echo "Container Base Generator - Booking Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Booking-Management-Microservice-Command/bookingCommandManagement.operation" \
         -i "Booking-Management-Microservice-Command/intermediate/operation models/bookingCommandManagement.xmi" \
    -t "$TARGET_PATH"

# MongoDB Generator - Booking Microservice Command
echo "MariaDB Generator - Booking Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MARIADB_PATH" \
    -b "$PWD" \
         -s "Booking-Management-Microservice-Command/bookingCommandManagement.operation" \
         -i "Booking-Management-Microservice-Command/intermediate/operation models/bookingCommandManagement.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Booking Microservice Command
echo "Eureka Generator - Booking Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Booking-Management-Microservice-Command/bookingCommandManagement.operation" \
         -i "Booking-Management-Microservice-Command/intermediate/operation models/bookingCommandManagement.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# Booking Microservice Query
####################################################################################################
# Java Base Generator - Booking Microservice Query
echo "Java Base Generator - Booking Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$JAVABASE_PATH" \
    -b "$PWD" \
         -s "Booking-Management-Microservice-Query/bookingQueryManagement.services" \
         -i "Booking-Management-Microservice-Query/intermediate/service models/bookingQueryManagement.xmi" \
    -p "generation-gap" \
    -g "$SPRINGCLOUD_PATH" \
    -g "$DOMAINEVENTS_PATH" \
    -g "$KAFKA_PATH" \
    -g "$DDD_PATH" \
    -g "$CQRS_PATH" \
    -t "$TARGET_PATH"

# Container Base Generator - Booking Microservice Query
echo "Container Base Generator - Booking Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Booking-Management-Microservice-Query/bookingQueryManagement.operation" \
         -i "Booking-Management-Microservice-Query/intermediate/operation models/bookingQueryManagement.xmi" \
    -t "$TARGET_PATH"

# MariaDB Generator - Booking Microservice Query
echo "MariaDB Generator - Booking Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MARIADB_PATH" \
    -b "$PWD" \
         -s "Booking-Management-Microservice-Query/bookingQueryManagement.operation" \
         -i "Booking-Management-Microservice-Query/intermediate/operation models/bookingQueryManagement.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Booking Microservice Query
echo "Eureka Generator - Booking Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Booking-Management-Microservice-Query/bookingQueryManagement.operation" \
         -i "Booking-Management-Microservice-Query/intermediate/operation models/bookingQueryManagement.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# Charging Station Management Microservice Command (CSMM)
####################################################################################################
# Java Base Generator - Charging Station Management Microservice 
echo "Java Base Generator - Charging Station Management Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$JAVABASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Management-Microservice-Command/chargingStationCommandManagement.services" \
         -i "Charging-Station-Management-Microservice-Command/intermediate/service models/chargingStationCommandManagement.xmi" \
    -p "generation-gap" \
    -g "$SPRINGCLOUD_PATH" \
    -g "$DOMAINEVENTS_PATH" \
    -g "$KAFKA_PATH" \
    -g "$DDD_PATH" \
    -g "$CQRS_PATH" \
    -t "$TARGET_PATH"

# Container Base Generator - Charging Station Management Microservice 
echo "Container Base Generator - Charging Station Management Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Management-Microservice-Command/chargingStationCommandManagement.operation" \
         -i "Charging-Station-Management-Microservice-Command/intermediate/operation models/chargingStationCommandManagement.xmi" \
    -t "$TARGET_PATH"

# MongoDB Generator -Charging Station Management Microservice
echo "MongoDB Generator -Charging Station Management Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MONGODB_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Management-Microservice-Command/chargingStationCommandManagement.operation" \
         -i "Charging-Station-Management-Microservice-Command/intermediate/operation models/chargingStationCommandManagement.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Charging Station Management Microservice 
echo "Eureka Generator - Charging Station Management Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Management-Microservice-Command/chargingStationCommandManagement.operation" \
         -i "Charging-Station-Management-Microservice-Command/intermediate/operation models/chargingStationCommandManagement.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# Charging Station Management Microservice Query (CSMM)
####################################################################################################
# Java Base Generator - Charging Station Management Microservice 
echo "Java Base Generator - Charging Station Management Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$JAVABASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Management-Microservice-Query/chargingStationQueryManagement.services" \
         -i "Charging-Station-Management-Microservice-Query/intermediate/service models/chargingStationQueryManagement.xmi" \
    -p "generation-gap" \
    -g "$SPRINGCLOUD_PATH" \
    -g "$DOMAINEVENTS_PATH" \
    -g "$KAFKA_PATH" \
    -g "$DDD_PATH" \
    -g "$CQRS_PATH" \
    -t "$TARGET_PATH"

# Container Base Generator - Charging Station Management Microservice 
echo "Container Base Generator - Charging Station Management Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Management-Microservice-Query/chargingStationQueryManagement.operation" \
         -i "Charging-Station-Management-Microservice-Query/intermediate/operation models/chargingStationQueryManagement.xmi" \
    -t "$TARGET_PATH"

# MongoDB Generator -Charging Station Management Microservice
echo "MongoDB Generator -Charging Station Management Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MONGODB_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Management-Microservice-Query/chargingStationQueryManagement.operation" \
         -i "Charging-Station-Management-Microservice-Query/intermediate/operation models/chargingStationQueryManagement.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Charging Station Management Microservice 
echo "Eureka Generator - Charging Station Management Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Management-Microservice-Query/chargingStationQueryManagement.operation" \
         -i "Charging-Station-Management-Microservice-Query/intermediate/operation models/chargingStationQueryManagement.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# Charging Station Search Microservice
####################################################################################################
# Java Base Generator - Charging Station Search Microservice
echo "Java Base Generator - Charging Station Search Microservice"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$JAVABASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Search-Microservice/chargingStationSearch.services" \
         -i "Charging-Station-Search-Microservice/intermediate/service models/chargingStationSearch.xmi" \
    -p "generation-gap" \
    -g "$SPRINGCLOUD_PATH" \
    -g "$DOMAINEVENTS_PATH" \
    -g "$KAFKA_PATH" \
    -g "$DDD_PATH" \
    -g "$CQRS_PATH" \
    -t "$TARGET_PATH"

# Container Base Generator - Charging Station Search Microservice 
echo "Container Base Generator - Charging Station Search Microservice"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Search-Microservice/chargingStationSearch.operation" \
         -i "Charging-Station-Search-Microservice/intermediate/operation models/chargingStationSearch.xmi" \
    -t "$TARGET_PATH"

# MongoDB Generator - Charging Station Search Microservice
echo "MongoDB Generator - Charging Station Search Microservice"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MONGODB_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Search-Microservice/chargingStationSearch.operation" \
         -i "Charging-Station-Search-Microservice/intermediate/operation models/chargingStationSearch.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Charging Station Search Microservice 
echo "Eureka Generator - Charging Station Search Microservice"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Search-Microservice/chargingStationSearch.operation" \
         -i "Charging-Station-Search-Microservice/intermediate/operation models/chargingStationSearch.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# Environment Data Analysis Microservice Query
####################################################################################################
# Java Base Generator - Environment Data Analysis Microservice Query
echo "Java Base Generator - Environment Data Analysis Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$JAVABASE_PATH" \
    -b "$PWD" \
         -s "Environmental-Data-Analysis-Microservice-Query/environmentalDataQueryAnalysis.services" \
         -i "Environmental-Data-Analysis-Microservice-Query/intermediate/service models/environmentalDataQueryAnalysis.xmi" \
    -p "generation-gap" \
    -g "$SPRINGCLOUD_PATH" \
    -g "$DOMAINEVENTS_PATH" \
    -g "$KAFKA_PATH" \
    -g "$DDD_PATH" \
    -g "$CQRS_PATH" \
    -t "$TARGET_PATH"

# Container Base Generator - Environment Data Analysis Microservice Query
echo "Container Base Generator - Environment Data Analysis Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Environmental-Data-Analysis-Microservice-Query/environmentalDataQueryAnalysis.operation" \
         -i "Environmental-Data-Analysis-Microservice-Query/intermediate/operation models/environmentalDataQueryAnalysis.xmi" \
    -t "$TARGET_PATH"

# MongoDB Generator - Environment Data Analysis Microservice Query
echo "MongoDB Generator - Environment Data Analysis Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MONGODB_PATH" \
    -b "$PWD" \
         -s "Environmental-Data-Analysis-Microservice-Query/environmentalDataQueryAnalysis.operation" \
         -i "Environmental-Data-Analysis-Microservice-Query/intermediate/operation models/environmentalDataQueryAnalysis.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Environment Data Analysis Microservice Query
echo "Eureka Generator - Environment Data Analysis Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Environmental-Data-Analysis-Microservice-Query/environmentalDataQueryAnalysis.operation" \
         -i "Environmental-Data-Analysis-Microservice-Query/intermediate/operation models/environmentalDataQueryAnalysis.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# Environment Data Analysis Microservice Command
####################################################################################################
# Java Base Generator - Environment Data Analysis Microservice Command
echo "Java Base Generator - Environment Data Analysis Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$JAVABASE_PATH" \
    -b "$PWD" \
         -s "Environmental-Data-Analysis-Microservice-Command/environmentalDataCommandAnalysis.services" \
         -i "Environmental-Data-Analysis-Microservice-Command/intermediate/service models/environmentalDataCommandAnalysis.xmi" \
    -p "generation-gap" \
    -g "$SPRINGCLOUD_PATH" \
    -g "$DOMAINEVENTS_PATH" \
    -g "$KAFKA_PATH" \
    -g "$DDD_PATH" \
    -g "$CQRS_PATH" \
    -t "$TARGET_PATH"

# Container Base Generator - Environment Data Analysis Microservice Command
echo "Container Base Generator - Environment Data Analysis Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Environmental-Data-Analysis-Microservice-Command/environmentalDataCommandAnalysis.operation" \
         -i "Environmental-Data-Analysis-Microservice-Command/intermediate/operation models/environmentalDataCommandAnalysis.xmi" \
    -t "$TARGET_PATH"

# MongoDB Generator - Environment Data Analysis Microservice Command
echo "MongoDB Generator - Environment Data Analysis Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MONGODB_PATH" \
    -b "$PWD" \
         -s "Environmental-Data-Analysis-Microservice-Command/environmentalDataCommandAnalysis.operation" \
         -i "Environmental-Data-Analysis-Microservice-Command/intermediate/operation models/environmentalDataCommandAnalysis.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Environment Data Analysis Microservice Command
echo "Eureka Generator - Environment Data Analysis Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Environmental-Data-Analysis-Microservice-Command/environmentalDataCommandAnalysis.operation" \
         -i "Environmental-Data-Analysis-Microservice-Command/intermediate/operation models/environmentalDataCommandAnalysis.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# Charging Station Sharing Microservice Command
####################################################################################################
# Charging Station Sharing Microservice Command
echo "Java Base Generator - Charging Station Sharing Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$JAVABASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Sharing-Microservice-Command/chargingStationSharingCommand.services" \
         -i "Charging-Station-Sharing-Microservice-Command/intermediate/service models/chargingStationSharingCommand.xmi" \
    -p "generation-gap" \
    -g "$SPRINGCLOUD_PATH" \
    -g "$DOMAINEVENTS_PATH" \
    -g "$KAFKA_PATH" \
    -g "$DDD_PATH" \
    -g "$CQRS_PATH" \
    -t "$TARGET_PATH"

# Container Base Generator - Charging Station Sharing Microservice Command
echo "Container Base Generator - Charging Station Sharing Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Sharing-Microservice-Command/chargingStationSharingCommand.operation" \
         -i "Charging-Station-Sharing-Microservice-Command/intermediate/operation models/chargingStationSharingCommand.xmi" \
    -t "$TARGET_PATH"

# MongoDB Generator - Charging Station Sharing Microservice Command
echo "MongoDB Generator - Charging Station Sharing Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MONGODB_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Sharing-Microservice-Command/chargingStationSharingCommand.operation" \
         -i "Charging-Station-Sharing-Microservice-Command/intermediate/operation models/chargingStationSharingCommand.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Environment Data Analysis Microservice Command
echo "Eureka Generator - Charging Station Sharing Microservice Command"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Sharing-Microservice-Command/chargingStationSharingCommand.operation" \
         -i "Charging-Station-Sharing-Microservice-Command/intermediate/operation models/chargingStationSharingCommand.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# Charging Station Sharing Microservice Query
####################################################################################################
# Charging Station Sharing Microservice Query
echo "Java Base Generator - Charging Station Sharing Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$JAVABASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Sharing-Microservice-Query/chargingStationSharingQuery.services" \
         -i "Charging-Station-Sharing-Microservice-Query/intermediate/service models/chargingStationSharingQuery.xmi" \
    -p "generation-gap" \
    -g "$SPRINGCLOUD_PATH" \
    -g "$DOMAINEVENTS_PATH" \
    -g "$KAFKA_PATH" \
    -g "$DDD_PATH" \
    -g "$CQRS_PATH" \
    -t "$TARGET_PATH"

# Container Base Generator - Charging Station Sharing Microservice Query
echo "Container Base Generator - Charging Station Sharing Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Sharing-Microservice-Query/chargingStationSharingQuery.operation" \
         -i "Charging-Station-Sharing-Microservice-Query/intermediate/operation models/chargingStationSharingQuery.xmi" \
    -t "$TARGET_PATH"

# MongoDB Generator - Charging Station Sharing Microservice Query
echo "MongoDB Generator - Charging Station Sharing Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MONGODB_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Sharing-Microservice-Query/chargingStationSharingQuery.operation" \
         -i "Charging-Station-Sharing-Microservice-Query/intermediate/operation models/chargingStationSharingQuery.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Environment Data Analysis Microservice Query
echo "Eureka Generator - Charging Station Sharing Microservice Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Charging-Station-Sharing-Microservice-Query/chargingStationSharingQuery.operation" \
         -i "Charging-Station-Sharing-Microservice-Query/intermediate/operation models/chargingStationSharingQuery.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# MongoDB
####################################################################################################
# MongoDB Generator - MongoDB
echo "MongoDB Generator - MongoDB"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MONGODB_PATH" \
    -b "$PWD" \
         -s "Service-Oriented-Infrastructure-Components/infrastructure/mongodb.operation" \
         -i "Service-Oriented-Infrastructure-Components/intermediate/operation models/mongodb.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# Eureka
####################################################################################################
# Container Base Generator - Eureka
echo "Container Base Generator - Eureka"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$CONTAINER_BASE_PATH" \
    -b "$PWD" \
         -s "Service-Oriented-Infrastructure-Components/infrastructure/eureka.operation" \
         -i "Service-Oriented-Infrastructure-Components/intermediate/operation models/eureka.xmi" \
    -t "$TARGET_PATH"

# Eureka Generator - Eureka
echo "Eureka Generator - Eureka"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$EUREKA_PATH" \
    -b "$PWD" \
         -s "Service-Oriented-Infrastructure-Components/infrastructure/eureka.operation" \
         -i "Service-Oriented-Infrastructure-Components/intermediate/operation models/eureka.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# MariaDB Command
####################################################################################################

# MariaDB Generator - MariaDB
echo "MariaDB Generator - MariaDB"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MARIADB_PATH" \
    -b "$PWD" \
         -s "Service-Oriented-Infrastructure-Components/infrastructure/mariadbcommand.operation" \
         -i "Service-Oriented-Infrastructure-Components/intermediate/operation models/mariadbcommand.xmi" \
    -t "$TARGET_PATH"

####################################################################################################
# MariaDB Query
####################################################################################################
# MariaDB Generator - MariaDB Query
echo "MariaDB Generator - MariaDB Query"
"$LEMMA_PATH/$SCRIPT_PATH" \
    "$LEMMA_PATH/$MARIADB_PATH" \
    -b "$PWD" \
         -s "Service-Oriented-Infrastructure-Components/infrastructure/mariadbquery.operation" \
         -i "Service-Oriented-Infrastructure-Components/intermediate/operation models/mariadbquery.xmi" \
    -t "$TARGET_PATH"