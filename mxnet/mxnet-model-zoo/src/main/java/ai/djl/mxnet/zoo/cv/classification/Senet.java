/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package ai.djl.mxnet.zoo.cv.classification;

import ai.djl.repository.Repository;

/**
 * Model loader for Senet Symbolic models.
 *
 * <p>The model was trained on Gluon and loaded in DJL in MXNet Symbol Block. See <a
 * href="https://arxiv.org/pdf/1709.01507.pdf">Senet</a>.
 *
 * @see ai.djl.mxnet.engine.MxSymbolBlock
 */
public class Senet extends ImageClassificationModelLoader {

    private static final String ARTIFACT_ID = "senet";
    private static final String VERSION = "0.0.1";

    /**
     * Creates the Model loader from the given repository.
     *
     * @param repository the repository to load the model from
     */
    public Senet(Repository repository) {
        super(repository, ARTIFACT_ID, VERSION);
    }
}
