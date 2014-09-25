package org.graylog2.alarmcallbacks.slack;

import org.graylog2.plugin.PluginModule;

public class SlackAlarmCallbackModule extends PluginModule {
    @Override
    protected void configure() {
        registerPlugin(SlackAlarmCallbackMetadata.class);
        addAlarmCallback(SlackAlarmCallback.class);
    }
}
