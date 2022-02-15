#!/usr/bin/env bash

cloc --exclude-ext=yaml,sh,yml,properties --not-match-f=Dockerfile --by-file "../../generated_code/de/fhdo/puls/bookingmanagementcommand/" "../../generated_code/de/fhdo/puls/bookingmanagementquery/"

