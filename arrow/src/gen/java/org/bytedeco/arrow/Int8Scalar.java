// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Int8Scalar extends BaseInt8Type {
    static { Loader.load(); }
    /** Default native constructor. */
    public Int8Scalar() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Int8Scalar(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Int8Scalar(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Int8Scalar position(long position) {
        return (Int8Scalar)super.position(position);
    }

}
