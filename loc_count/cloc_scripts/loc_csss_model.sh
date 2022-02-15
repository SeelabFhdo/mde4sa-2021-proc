#!/usr/bin/env bash
#!/usr/bin/env bash

echo "Data"
cloc --by-file --force-lang-def="cloc_defs/cloc_lemma_data_def" "../..//Charging-Station-Sharing-Microservice-Command/" "../..//Charging-Station-Sharing-Microservice-Query/" --exclude-dir=intermediate
echo "Service"
cloc --by-file --force-lang-def="cloc_defs/cloc_lemma_service_def" "../..//Charging-Station-Sharing-Microservice-Command/" "../..//Charging-Station-Sharing-Microservice-Query/" --exclude-dir=intermediate
echo "Operation"
cloc --by-file --force-lang-def="cloc_defs/cloc_lemma_operation_def" "../..//Charging-Station-Sharing-Microservice-Command/" "../..//Charging-Station-Sharing-Microservice-Query/" --exclude-dir=intermediate


