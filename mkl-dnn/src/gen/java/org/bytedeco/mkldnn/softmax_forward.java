// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_softmax Softmax
 *  A primitive to perform softmax.
 * 
 *  @see \ref dev_guide_softmax in developer guide
 *  @see \ref c_api_softmax in \ref c_api
 *  \{
 <p>
 *  Softmax for forward propagation.  Implements descriptor, primitive
 *  descriptor, and primitive. */
@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class softmax_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public softmax_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public softmax_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public softmax_forward position(long position) {
        return (softmax_forward)super.position(position);
    }


    /** Descriptor for softmax forward propagation. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_softmax_desc_t data(); public native desc data(mkldnn_softmax_desc_t setter);

        /** Initializes a softmax descriptor for forward propagation using \p
         *  prop_kind (possible values are #mkldnn::forward_training and
         *  #mkldnn::forward_inference) and memory descriptor \p data_desc. */
        public desc(prop_kind aprop_kind, @Const @ByRef memory.desc data_desc,
                     int softmax_axis) { super((Pointer)null); allocate(aprop_kind, data_desc, softmax_axis); }
        private native void allocate(prop_kind aprop_kind, @Const @ByRef memory.desc data_desc,
                     int softmax_axis);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc data_desc,
                     int softmax_axis) { super((Pointer)null); allocate(aprop_kind, data_desc, softmax_axis); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc data_desc,
                     int softmax_axis);
    }

    /** Primitive descriptor for softmax forward propagation. */
    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, attr, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e);

        /** Queries source memory descriptor. */
        public native @ByVal memory.desc src_desc();

        /** Queries destination memory descriptor. */
        public native @ByVal memory.desc dst_desc();
    }

    public softmax_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    public softmax_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
