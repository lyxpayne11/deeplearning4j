/*-
 *  * Copyright 2016 Skymind, Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 */

package org.datavec.local.transforms.transform;

import org.datavec.api.transform.TransformProcess;
import org.datavec.api.writable.Writable;
import org.datavec.spark.transform.BaseFlatMapFunctionAdaptee;

import java.util.List;

/**
 * Spark function for executing a transform process
 */
public class SparkTransformProcessFunction extends BaseFlatMapFunctionAdaptee<List<Writable>, List<Writable>> {

    public SparkTransformProcessFunction(TransformProcess transformProcess) {
        super(new SparkTransformProcessFunctionAdapter(transformProcess));
    }

}
