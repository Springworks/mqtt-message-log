/*
 * Copyright 2013 dc-square GmbH
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.dcsquare.hivemq.plugin.mqttmessage.plugin;

import com.dcsquare.hivemq.spi.HiveMQPluginModule;
import com.dcsquare.hivemq.spi.PluginEntryPoint;
import com.dcsquare.hivemq.spi.plugin.meta.Information;
import com.google.inject.Provider;
import org.apache.commons.configuration.AbstractConfiguration;

import static com.dcsquare.hivemq.spi.config.Configurations.noConfigurationNeeded;


/**
 * @author Dominik Obermaier
 */
@Information(name = "HiveMQ MQTT Message Log Plugin", author = "dc-square GmbH", version = "1.0.0")
public class MqttMessageLogPluginModule extends HiveMQPluginModule {


    @Override
    public Provider<Iterable<? extends AbstractConfiguration>> getConfigurations() {
        return noConfigurationNeeded();
    }


    @Override
    protected void configurePlugin() {

    }

    @Override
    protected Class<? extends PluginEntryPoint> entryPointClass() {
        return MqttMessageLog.class;
    }
}
