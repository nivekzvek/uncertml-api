/**
 * Copyright 2014 52°North Initiative for Geospatial Open Source Software GmbH
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
package org.uncertml.statistic;

import java.util.List;

/**
 * Class representing a median statistic.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/Median}
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class Median extends ContinuousStatistic {

    /**
     * Constructor that takes a single value, representing a single median
     * statistic.
     * 
     * @param value the value of the median statistic.
     */
    public Median(double value) {
        super(value);
    }

    /**
     * Constructor that takes an array of doubles. Each value represents
     * a single median statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values an array of doubles representing the value of n
     * median statistics.
     */
    public Median(double[] values) {
        super(values);
    }

    /**
     * Constructor that takes a <code>List</code> of doubles. Each value represents
     * a single median statistic. This is in line with the UncertML syntax
     * whereby a collection of types can be represented by a single entity.
     * 
     * @param values a <code>List</code> of doubles representing the value of n
     * median statistics.
     */
    public Median(List<Double> values) {
        super(values);
    }
}
