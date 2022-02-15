#!/usr/bin/env bash
#!/usr/bin/env bash

echo "Data"
cloc --by-file --force-lang-def="cloc_defs/cloc_lemma_data_def" "../../Service-Oriented-Infrastructure-Components/" --exclude-dir=intermediate
echo "Service"
cloc --by-file --force-lang-def="cloc_defs/cloc_lemma_service_def" "../../Service-Oriented-Infrastructure-Components/" --exclude-dir=intermediate
echo "Operation"
cloc --by-file --force-lang-def="cloc_defs/cloc_lemma_operation_def" "../../Service-Oriented-Infrastructure-Components/" --exclude-dir=intermediate


