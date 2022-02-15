#!/usr/bin/env bash

cloc --by-file --force-lang-def="cloc_defs/cloc_deployment_def" "../../generated_code/de/fhdo/puls/chargingstationmanagementquery" "../../generated_code/de/fhdo/puls/chargingstationmanagementcommand" 
cloc --by-file "../..generated_code/de/fhdo/puls/chargingstationmanagementcommand/Dockerfile" "../../generated_code/de/fhdo/puls/chargingstationmanagementquery/Dockerfile"

