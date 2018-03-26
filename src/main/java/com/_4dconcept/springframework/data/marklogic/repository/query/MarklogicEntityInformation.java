/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com._4dconcept.springframework.data.marklogic.repository.query;

import org.springframework.data.repository.core.EntityInformation;

/**
 * Marklogic specific {@link EntityInformation}.
 *
 * @author Stéphane Toussaint
 */
public interface MarklogicEntityInformation<T, ID> extends EntityInformation<T, ID> {

    /**
     * @return the uri the entity shall be persisted to.
     */
    String getUri();

    /**
     * @return the default collection the entity will be persisted in
     */
    String getDefaultCollection();

    /**
     * @return true if the id element is expected to be find in property fragment
     */
    boolean idInPropertyFragment();

}
