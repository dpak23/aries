/*
 * Copyright (c) OSGi Alliance (2017). All Rights Reserved.
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

package org.osgi.service.cdi.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation applied to {@link javax.inject.Qualifier} for use on
 * {@link Reference} for conversion to service filters.
 *
 * When the Qualifier is a simple annotation, the property key is derived from
 * the annotation type's simple name converted to dot notation. The value is the
 * <code>String.valueOf()</code> return value of the <code>value()</code>
 * method.
 *
 * When the Qualifier is a complex annotation, the property keys are derived
 * from the method names converted to dot notation. The values are the
 * <code>String.valueOf()</code> return value of the methods. The key/value
 * pairs are 'ANDed' together.
 *
 * Multiple such Qualifiers' on a single Reference are 'ANDed' together and as
 * such they can be combined.
 */
@Target(value = ElementType.ANNOTATION_TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface ReferenceFilterQualifier {
}
