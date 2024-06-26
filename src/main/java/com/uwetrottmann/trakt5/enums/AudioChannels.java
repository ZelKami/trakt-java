/*
 * Copyright 2024 Uwe Trottmann
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

package com.uwetrottmann.trakt5.enums;

import java.util.HashMap;
import java.util.Map;

public enum AudioChannels implements TraktEnum {

    CH1_0("1.0"),
    CH2_0("2.0"),
    CH2_1("2.1"),
    CH3_0("3.0"),
    CH3_1("3.1"),
    CH4_0("4.0"),
    CH4_1("4.1"),
    CH5_0("5.0"),
    CH5_1("5.1"),
    CH5_1_2("5.1.2"),
    CH5_1_4("5.1.4"),
    CH6_1("6.1"),
    CH7_1("7.1"),
    CH7_1_2("7.1.2"),
    CH7_1_4("7.1.4"),
    CH9_1("9.1"),
    CH10_1("10.1");

    private final String value;

    AudioChannels(String value) {
        this.value = value;
    }

    private static final Map<String, AudioChannels> STRING_MAPPING = new HashMap<>();

    static {
        for (AudioChannels via : AudioChannels.values()) {
            STRING_MAPPING.put(via.toString(), via);
        }
    }

    public static AudioChannels fromValue(String value) {
        return STRING_MAPPING.get(value);
    }

    @Override
    public String toString() {
        return value;
    }

}
