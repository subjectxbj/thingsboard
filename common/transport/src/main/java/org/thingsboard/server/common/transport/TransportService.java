/**
 * Copyright © 2016-2018 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.transport;

import org.thingsboard.server.gen.transport.TransportProtos;

/**
 * Created by ashvayka on 04.10.18.
 */
public interface TransportService {

    void process(TransportProtos.ValidateDeviceTokenRequestMsg msg,
                 TransportServiceCallback<TransportProtos.ValidateDeviceTokenResponseMsg> callback);

    void process(TransportProtos.SessionEventMsg msg, TransportServiceCallback<Void> callback);

    void process(TransportProtos.PostTelemetryMsg msg, TransportServiceCallback<Void> callback);

    void process(TransportProtos.PostAttributeMsg msg, TransportServiceCallback<Void> callback);

}