package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.SensorValue;
import java.util.ArrayList;

public abstract class SensorValueListGenImpl extends ArrayList<SensorValueListGenImpl.SensorValueListItem> implements SensorValueListGen {

    public static class SensorValueListItem {

        public SensorValueListItem() {
        }

        private SensorValue v;

        public SensorValue getV() {
            return v;
        }

        public void setV(SensorValue v) {
            this.v = v;
        }

        public SensorValueListItem(SensorValue v) {
            this.v = v;
        }
    }
}
