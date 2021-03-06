package com.bmc.truesight.plugins;

import java.util.ListIterator;

public class PluginMeasurementList extends PluginItemList<PluginMeasurement> {

    PluginMeasurementList getByMetric(String metric) {
        PluginMeasurementList list = new PluginMeasurementList();

        ListIterator<PluginMeasurement> iterator = this.listIterator(0);

        while(iterator.hasNext()) {
            PluginMeasurement measurement = iterator.next();
            if (measurement.getMetric().equals(metric)) {
                list.add(measurement);
            }
        }

        return list;
    }
}
