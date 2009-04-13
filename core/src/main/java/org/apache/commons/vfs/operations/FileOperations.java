/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.vfs.operations;

import org.apache.commons.vfs.FileSystemException;

/**
 * FileOperations interface provides API to work with operations.
 *
 * @see FileOperation on what a operation in the context of VFS is.
 *
 * @author Siarhei Baidun
 * @since 0.1
 */
public interface FileOperations
{
    /**
     * @return all operations associated with the fileObject
     * @throws FileSystemException
     */
    Class[] getOperations() throws FileSystemException;

    /**
     * @return a operation implementing the given <code>operationClass</code>
     * @throws FileSystemException
     */
    FileOperation getOperation(Class operationClass) throws FileSystemException;

    /**
     * @return if a operation <code>operationClass</code> is available
     * @throws FileSystemException
     */
    boolean hasOperation(Class operationClass) throws FileSystemException;
}
