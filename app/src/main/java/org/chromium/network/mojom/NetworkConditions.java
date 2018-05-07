
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_service.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class NetworkConditions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean offline;
    public org.chromium.mojo.common.mojom.TimeDelta latency;
    public double downloadThroughput;
    public double uploadThroughput;

    private NetworkConditions(int version) {
        super(STRUCT_SIZE, version);
    }

    public NetworkConditions() {
        this(0);
    }

    public static NetworkConditions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static NetworkConditions deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static NetworkConditions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        NetworkConditions result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new NetworkConditions(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.offline = decoder0.readBoolean(8, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.latency = org.chromium.mojo.common.mojom.TimeDelta.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.downloadThroughput = decoder0.readDouble(24);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.uploadThroughput = decoder0.readDouble(32);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.offline, 8, 0);
        
        encoder0.encode(this.latency, 16, false);
        
        encoder0.encode(this.downloadThroughput, 24);
        
        encoder0.encode(this.uploadThroughput, 32);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        NetworkConditions other = (NetworkConditions) object;
        if (this.offline!= other.offline)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.latency, other.latency))
            return false;
        if (this.downloadThroughput!= other.downloadThroughput)
            return false;
        if (this.uploadThroughput!= other.uploadThroughput)
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.offline);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.latency);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.downloadThroughput);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.uploadThroughput);
        return result;
    }
}