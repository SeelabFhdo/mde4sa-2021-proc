# LEMMA Models and generated Code for the Park and Charge Platform (PACP) Case Study

This repository was created in the context of our paper "*Towards an Extensible Approach for Generative Microservice Development and Deployment Using LEMMA*" for  the LNCS-proceedings of [Second International Workshop on Model-Driven Engineering for Software Architecture (MDE4SA 2021)](http://mde4sa2021.disim.univaq.it/). It can be used for the replication of our results in Section 4 ("Validation") of the paper. More specifically, the repository comprises the [LEMMA](https://github.com/SeelabFhdo/lemma) models for all PACP microservices concerning their design, implementation, and operation. In addition to this, the repository provides service code and deployment specifications of each modeled PACP microservice, based on the corresponding LEMMA Base Generators (LBGs) and LEMMA Generation Fragments (LGFs) (https://github.com/SeelabFhdo/lemma/tree/main/code%20generators). 

To use the models for replication purposes, you can install LEMMA locally as described in its documentation (cf. https://seelabfhdo.github.io/lemma-docs/getting-started/index.html). 

### Detailed Content Description
The repository contains the models and the generated code of five logical PACP microservices as presented in the paper. Except one microservice, which comprises only a query side, all logical microservices consist of a pysical command and a physical query side microservice according to the [Command Query Responsibility Segregation (CQRS) pattern](https://martinfowler.com/bliki/CQRS.html). Each physical microservice is described by one or more domain models, service models, and operation models expressed in the corresponding viewpoint-specific LEMMA modeling languages. Based on these LEMMA models, each microservice also provides a "generated code" folder that contains the microservice code generated by LBGs and LGFs. Furthermore, the repository provides the ["technology" folder](https://link-tofolder) for the LEMMA technology models mentioned in the paper.

**Booking Management Microservice | Command + Query Side ([BMMC](https://github.com/SeelabFhdo/link-to-bmmc)) ([BMMQ](https://github.com/SeelabFhdo/link-to-bmmq))**<br/>
Microservice that enables the management of park bookings as well as park and charge bookings. It provides appropriate API methods for booking creation and for booking data requests.

**Charging Station Management Microservice | Command + Query Side ([CSMMC](https://github.com/SeelabFhdo/link-to-csmmc)) ([CSMMQ](https://github.com/SeelabFhdo/link-to-csmmq))**<br/>
Microservice that provides the technical charging station management. This service can be used to create and provide new parking spaces as well as parking spaces with charging stations. It is also possible to request charging stations.

**Charging Station Search Microservice | Only Query Side ([CSSM](https://github.com/SeelabFhdo/link-to-cssm))**<br/>
Microservice that allows citizens to search for available parking spaces and charging stations. 

**Charging Station Sharing Microservice | Command + Query Side ([CSSMC](https://github.com/SeelabFhdo/link-to-cssmc)) ([CSSMQ](https://github.com/SeelabFhdo/link-to-cssmq))**<br/>
Microservice that allows owners of a charging station to make it available for use by other electric vehicle drivers.

**Environmental Data Analysis Microservice | Command + Query Side ([EDAMC](https://github.com/SeelabFhdo/link-to-edamc)) ([EDAMQ](https://github.com/SeelabFhdo/link-to-edamq))**<br/>
Microservice that is responsible for the analysis of air quality indicators. For this purpose, the service provides functions for creating environment sensor units and for retrieving various sensor data.