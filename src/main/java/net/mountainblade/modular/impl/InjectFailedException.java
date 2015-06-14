/**
 * Copyright (C) 2014 MountainBlade (http://mountainblade.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.mountainblade.modular.impl;

/**
 * Represents an exception that gets thrown when an injection failed.
 *
 * @author spaceemotion
 * @version 1.0
 */
public class InjectFailedException extends Exception {

    public InjectFailedException(String message) {
        super(message);
    }

    public InjectFailedException(String message, Throwable cause) {
        super(message, cause);
    }

}
