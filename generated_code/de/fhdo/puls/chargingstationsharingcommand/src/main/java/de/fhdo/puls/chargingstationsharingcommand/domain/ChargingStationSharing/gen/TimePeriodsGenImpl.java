package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.TimePeriod;
import java.util.ArrayList;

public abstract class TimePeriodsGenImpl extends ArrayList<TimePeriodsGenImpl.TimePeriodsItem> implements TimePeriodsGen {

    public static class TimePeriodsItem {

        public TimePeriodsItem() {
        }

        private TimePeriod tp;

        public TimePeriod getTp() {
            return tp;
        }

        public void setTp(TimePeriod tp) {
            this.tp = tp;
        }

        public TimePeriodsItem(TimePeriod tp) {
            this.tp = tp;
        }
    }
}
