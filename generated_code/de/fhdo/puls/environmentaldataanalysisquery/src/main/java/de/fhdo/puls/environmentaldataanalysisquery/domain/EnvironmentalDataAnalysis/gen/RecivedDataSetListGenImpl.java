package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.ReceivedDataSet;
import java.util.ArrayList;

public abstract class RecivedDataSetListGenImpl extends ArrayList<RecivedDataSetListGenImpl.RecivedDataSetListItem> implements RecivedDataSetListGen {

    public static class RecivedDataSetListItem {

        public RecivedDataSetListItem() {
        }

        private ReceivedDataSet receivedDataSet;

        public ReceivedDataSet getReceivedDataSet() {
            return receivedDataSet;
        }

        public void setReceivedDataSet(ReceivedDataSet receivedDataSet) {
            this.receivedDataSet = receivedDataSet;
        }

        public RecivedDataSetListItem(ReceivedDataSet receivedDataSet) {
            this.receivedDataSet = receivedDataSet;
        }
    }
}
