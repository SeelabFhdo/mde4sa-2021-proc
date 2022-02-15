#!/usr/bin/env bash

cloc --by-file --force-lang-def="cloc_defs/cloc_deployment_def" "../../generated_code/de/fhdo/puls/chargingstationsharingcommand/" "../../generated_code/de/fhdo/puls/chargingstationsharingquery"
cloc --by-file "../../generated_code/de/fhdo/puls/chargingstationsharingcommand/Dockerfile" "../../generated_code/de/fhdo/puls/chargingstationsharingquery/Dockerfile"

