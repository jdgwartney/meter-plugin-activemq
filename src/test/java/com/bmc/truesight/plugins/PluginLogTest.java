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

import com.bmc.truesight.plugins.PluginLog;
import org.junit.*;

import java.text.ParseException;

public class PluginLogTest {

    @Test
    public void testDefaultConstructor() {
        PluginLog log = new PluginLog();
        assertThat(log, is(notNullValue()));
        assertThat(log.getLine(), is(nullValue()));
    }

    @Test
    public void testParse() throws ParseException {
        PluginLog log = new PluginLog();
        String s = "FOOBAR";
        log.parse(s);
        assertThat(log.getLine(), is(equalTo(s)));
    }

    @Test(expected=ParseException.class)
    public void testParseException() throws ParseException {
        PluginLog log = new PluginLog();
        String s = null;
        log.parse(s);
    }
}
