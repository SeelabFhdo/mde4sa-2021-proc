#!/usr/bin/env bash

cloc --by-file --force-lang-def="cloc_defs/cloc_deployment_def" "../../generated_code/de/fhdo/puls/environmentaldataanalysiscommand" "../../generated_code/de/fhdo/puls/environmentaldataanalysisquery"
cloc --by-file "../../generated_code/de/fhdo/puls/environmentaldataanalysiscommand/Dockerfile" "../../generated_code/de/fhdo/puls/environmentaldataanalysisquery/Dockerfile"

