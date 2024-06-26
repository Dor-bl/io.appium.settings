/*
  Copyright 2012-present Appium Committers
  <p>
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  <p>
  http://www.apache.org/licenses/LICENSE-2.0
  <p>
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

package io.appium.settings.handlers;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;

@SuppressLint("MissingPermission")
public class BluetoothConnectionSettingHandler extends AbstractSettingHandler {

    private final BluetoothAdapter bluetoothAdapter;

    public BluetoothConnectionSettingHandler(Context context, BluetoothAdapter bluetoothAdapter) {
        super(context);
        this.bluetoothAdapter = bluetoothAdapter;
    }

    @Override
    protected boolean setState(boolean state) {
        return state ? bluetoothAdapter.enable() : bluetoothAdapter.disable();
    }

    @Override
    protected String getSettingDescription() {
        return "Bluetooth";
    }
}
