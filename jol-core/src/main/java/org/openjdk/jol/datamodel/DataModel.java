/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.openjdk.jol.datamodel;

/**
 * Describes the data model, notably,
 * the basic types sizes.
 *
 * @author Aleksey Shipilev
 */
public interface DataModel {

    /**
     * Return the mark header size.
     * @return mark header size in bytes.
     */
    int markHeaderSize();

    /**
     * Return the class header size.
     * @return class header size in bytes.
     */
    int classHeaderSize();

    /**
     * Return the array length header size.
     * @return array length header size in bytes.
     */
    int arrayLengthHeaderSize();

    /**
     * Return the object header size.
     *
     * @return object header size in bytes.
     */
    int headerSize();

    /**
     * Return the array header size.
     *
     * @return object header size in bytes.
     */
    int arrayHeaderSize();

    /**
     * Return the size of the type.
     *
     * @param klass string representation of the type.
     * @return size in bytes.
     */
    int sizeOf(String klass);

    /**
     * Return the object alignment.
     *
     * @return minimal object alignment
     */
    int objectAlignment();

    /**
     * Machine address size.
     *
     * @return machine address size, in bytes
     */
    int addressSize();

}
