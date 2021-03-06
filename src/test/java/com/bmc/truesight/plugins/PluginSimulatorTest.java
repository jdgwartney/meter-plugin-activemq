//
// Copyright 2015 BMC Software, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
package com.bmc.truesight.plugins;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import com.bmc.truesight.plugins.PluginSimulator;
import org.junit.*;

public class PluginSimulatorTest {


    @Test
    public void testConstructor() {
        PluginSimulator simulator = new PluginSimulator();
        assertThat(simulator, is(notNullValue()));
    }
}
